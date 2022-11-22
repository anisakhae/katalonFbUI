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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/button_Log in'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Log in to Facebook/a_Forgotten password'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/a_Create New Account'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_Female_sex'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_Male_sex'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_Custom_sex'))

WebUI.setText(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_8e27d1'), 
    'anisa')

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_554ec3'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/i_Custom_mrm _5dbc _8esb img sp_98fCI7IVTTz_f00bf3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/select_Select your pronounShe Wish her a ha_90e2d2'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/select_Select your pronounShe Wish her a ha_90e2d2'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/CheckButton/Page_Facebook  log in or sign up/img_concat(id(, , u_2_9_gk, , ))_u_2_9_gk'))

