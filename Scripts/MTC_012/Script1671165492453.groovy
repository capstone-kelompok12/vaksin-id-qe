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

Mobile.startApplication('C:\\Users\\User\\Downloads\\vaksin_id.apk', true)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - NIK'), 0)

Mobile.setText(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - NIKMasukkan NIK'), '35890208040400', 
    0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Nama'), 0)

Mobile.setText(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - NamaMasukkan nama lengkap'), 'Nicholas Saputra', 
    0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.view.View - Tanggal lahir'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (4)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (5)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - EmailMasukkan email'), 'nicho9999@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Phone'), 0)

Mobile.setText(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - PhoneMasukkan nomor'), '085244337898', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (6)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Kata sandi'), 0)

Mobile.setText(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Kata sandiMasukkan kata sandi'), 'nicho8989', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.Button (7)'), 0)

Mobile.tap(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Kata sandi (1)'), 0)

Mobile.setText(findTestObject('Object Repository/InvalidNIK/android.widget.EditText - Kata sandiMasukkan kata sandi (1)'), 
    'nicho8989', 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Object Repository/InvalidNIK/android.widget.Button (8)'), 0)

Mobile.closeApplication()

