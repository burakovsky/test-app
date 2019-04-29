import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.apple.com/')

WebUI.click(findTestObject('Object Repository/appleOR/Page_Apple/a_iPhone'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_iPhone - Apple/span_Buy'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_Buy iPhoneXR - Apple/input_Which model_tradeInSelection'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_Buy iPhoneXR - Apple/img_Choose your finish_ir'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_Buy iPhoneXR - Apple/span_64GB1'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_Buy iPhoneXR - Apple/label_ATT'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_iPhoneXR 64GB White ATT - Apple/input_74900_carrierModel'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_iPhoneXR 64GB White - Apple/button_Continue'))

WebUI.click(findTestObject('Object Repository/appleOR/Page_Warranty - Apple/span_AppleCare                        Get up to two years of technical support and coverage for hardware repair and accidental damage coverage1'))

WebUI.closeBrowser()

