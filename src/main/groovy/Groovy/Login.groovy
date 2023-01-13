package Groovy
import org.junit.Test

class Login {

@Test
   void testfunction()
    {
        def seleniumUtils = new SeleniumUtils()
        def loginlocators = new LoginLocators()
        seleniumUtils.initDriver()
        seleniumUtils.navigateTo(loginlocators.url)
        seleniumUtils.sendKeysById(loginlocators.username,"taimoorkiani94@gmail.com")
        seleniumUtils.sendKeysById(loginlocators.password, "test")
        seleniumUtils.clickById(loginlocators.loginButton)
        seleniumUtils.closeDriver()
    }
}
