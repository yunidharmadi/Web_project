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

WebUI.openBrowser('https://todomvc.com/examples/knockoutjs')

WebUI.sendKeys(findTestObject('Page_Knockout.js  TodoMVC/input_todos_new-todo (input)'), 'cuci piring')

WebUI.sendKeys(findTestObject('Page_Knockout.js  TodoMVC/input_todos_new-todo (input)'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Knockout.js  TodoMVC/input_todos_new-todo (input)'), 'belanja')

WebUI.sendKeys(findTestObject('Page_Knockout.js  TodoMVC/input_todos_new-todo (input)'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Knockout.js  TodoMVC/input_todos_new-todo (input)'), 'beres-beres')

WebUI.sendKeys(findTestObject('Page_Knockout.js  TodoMVC/input_todos_new-todo (input)'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Page_Knockout.js  TodoMVC/strong_3 (counter)'), '3')

WebUI.verifyElementText(findTestObject('Page_Knockout.js  TodoMVC/label_cuci piring'), 'cuci piring')

WebUI.verifyElementText(findTestObject('Page_Knockout.js  TodoMVC/label_belanja'), 'belanja')

WebUI.verifyElementText(findTestObject('Page_Knockout.js  TodoMVC/label_beres-beres'), 'beres-beres')

