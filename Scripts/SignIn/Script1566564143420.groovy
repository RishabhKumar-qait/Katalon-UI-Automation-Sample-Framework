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

WebUI.openBrowser('katalon.com')

WebUI.click(findTestObject('Object Repository/New Test Object'))

WebUI.click(findTestObject('Email'))

WebUI.sendKeys(findTestObject('Email'), 'rishabh.kumar@qainfotech.com')

WebUI.sendKeys(findTestObject('Password'), 'Test@1234')

WebUI.click(findTestObject('Sign_In'))

WebUI.clearText(findTestObject('Password'))

WebUI.sendKeys(findTestObject('Password'), 'Qait@1234')

WebUI.click(findTestObject('Sign_In'))

WebUI.verifyElementText(findTestObject('EncorrectText'), 'Incorrect email or password. Please try again')

WebUI.refresh()

