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

//Login
WebUI.openBrowser('https://holapulsa.netlify.app')

WebUI.click(findTestObject('Login/Page_Hola Pulsa/a_Login'))

WebUI.click(findTestObject('Login/Page_Hola Pulsa/input_Nama Pengguna_form-control'))

WebUI.setText(findTestObject('Login/Page_Hola Pulsa/input_Nama Pengguna_form-control'), 'admin@example.com')

WebUI.click(findTestObject('Login/Page_Hola Pulsa/input_Password_form-control'))

WebUI.setText(findTestObject('Login/Page_Hola Pulsa/input_Password_form-control'), 'admin')

WebUI.click(findTestObject('Login/Page_Hola Pulsa/button_Masuk'))

WebUI.verifyElementPresent(findTestObject('Login/Page_Hola Pulsa/h2_Login Succes'), 0)

WebUI.click(findTestObject('Login/Page_Hola Pulsa/button_OK-success'))

WebUI.click(findTestObject('User/Page_Hola Pulsa/div_Kelola Pengguna'))

WebUI.click(findTestObject('User/Page_Hola Pulsa/a_Pelanggan'))

WebUI.click(findTestObject('User/Page_Hola Pulsa/button_Tambah Pengguna'))

WebUI.click(findTestObject('User/Page_Hola Pulsa/input_Nama Lengkap_name'))

WebUI.setText(findTestObject('User/Page_Hola Pulsa/input_Nama Lengkap_name'), 'admin')

WebUI.click(findTestObject('User/Page_Hola Pulsa/input_Email_email'))

WebUI.setText(findTestObject('User/Page_Hola Pulsa/input_Email_email'), 'admin')

WebUI.click(findTestObject('User/Page_Hola Pulsa/input_Password_password'))

WebUI.setText(findTestObject('User/Page_Hola Pulsa/input_Password_password'), 'admin')

WebUI.click(findTestObject('User/Page_Hola Pulsa/input_Konfirmasi Password_konfirmasiPassword'))

WebUI.setText(findTestObject('User/Page_Hola Pulsa/input_Konfirmasi Password_konfirmasiPassword'), 'admin')

WebUI.click(findTestObject('User/Page_Hola Pulsa/button_Tambah PenggunaSubmit'))

