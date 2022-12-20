import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

int x = findTestData('Data Files/Login/Data').getRowNumbers()

for (i = 1; i <= x; i++) {
    WebUI.openBrowser('https://holapulsa.netlify.app')

    WebUI.click(findTestObject('Login/Page_Hola Pulsa/a_Login'))

    WebUI.click(findTestObject('Login/Page_Hola Pulsa/input_Nama Pengguna_form-control'))

    WebUI.setText(findTestObject('Object Repository/Login/Page_Hola Pulsa/input_Nama Pengguna_form-control'), findTestData(
            'Data Files/Login/Data').getValue(1, i))

    WebUI.click(findTestObject('Login/Page_Hola Pulsa/input_Password_form-control'))

    WebUI.setText(findTestObject('Login/Page_Hola Pulsa/input_Password_form-control'), findTestData('Data Files/Login/Data').getValue(
            2, i))

    WebUI.click(findTestObject('Login/Page_Hola Pulsa/button_Masuk'))

    if ((i == 1) | (i == 4)) {
        WebUI.verifyElementPresent(findTestObject('Login/Page_Hola Pulsa/h2_Failed Login'), 0)

        WebUI.click(findTestObject('Login/Page_Hola Pulsa/button_OK-failed'))
    } else {
        WebUI.verifyElementPresent(findTestObject('Login/Page_Hola Pulsa/h2_Login Succes'), 0)

        WebUI.click(findTestObject('Login/Page_Hola Pulsa/h2_Failed Login'))
    }
    
    WebUI.closeBrowser()
}

