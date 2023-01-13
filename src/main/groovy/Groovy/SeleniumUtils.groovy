package Groovy
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

  class SeleniumUtils {
  WebDriver driver

  // Method to initialize the Chrome driver
  void initDriver() {

     System.setProperty("webdriver.chrome.driver","C:\\Users\\Taimoor Hassan Kiani\\Downloads\\chromedriver.exe")
      driver = new ChromeDriver()

 }

  // Method to navigate to a specified URL
  void navigateTo(String url) {
    driver.get(url)
  }

  // Method to click on an element by XPath
  void clickByXPath(String xpath) {
    driver.findElement(By.xpath(xpath)).click()
  }

  // Method to click on an element by ID
  void clickById(String id) {
    driver.findElement(By.id(id)).click()
  }

  // Method to send keys to an element by XPath
  void sendKeysByXPath(String xpath, String keys) {
    driver.findElement(By.xpath(xpath)).sendKeys(keys)
  }

  // Method to send keys to an element by ID
  void sendKeysById(String id, String keys) {
    driver.findElement(By.id(id)).sendKeys(keys)
  }

  // Method to add Implicit wait
  void addImplicitWait(int waitTime) {
    driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS)
  }

  // Method to add Explicit wait for visibility of element
  void addExplicitWaitForVisibility(String xpath, int waitTime) {
    WebDriverWait wait = new WebDriverWait(driver, waitTime)
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
  }

  // Method to add Explicit wait for clickability of element
  void addExplicitWaitForClickability(String xpath, int waitTime) {
    WebDriverWait wait = new WebDriverWait(driver, waitTime)
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
  }

  // Method to close the driver
  void closeDriver() {
    driver.close()
  }
}
