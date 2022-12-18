import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddFamilyMembersSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User on form book vaccine")
	def onFormBookVaccine (){
	}

	@When("Click add button")
	def clickAddButton (){
	}

	@And("Input NIK")
	def inputNIK (){
	}

	@And("Click search button")
	def clickSearchButton (){
	}

	@Then("Click Yes,add queue button")
	def clickYesAddQueueButton (){
	}

	@Given("User in form book vaccine")
	def inFormBookVaccine (){
	}

	@When("Click add")
	def clickAdd (){
	}

	@And("Input invalid NIK")
	def inputInvalidNIK (){
	}

	@Then("Click search")
	def clickSearch (){
	}

	@Given("User form book vaccine")
	def formBookVaccine () {
	}

	@When("Click button add")
	def clickButtonAdd () {
	}

	@Then("Click button search")
	def clickButtonSearch () {
	}

	@Given("On form book vaccine")
	def OFormBookVaccine (){
	}

	@When("Click add family members button")
	def addFamilyMembersButton (){
	}

	@And("Input NIK without register")
	def inputNIKWithoutRegister (){
	}

	@Then("Click search NIK button")
	def searchNIKButton (){
	}
	
	@Given("User success add family members")
	def successAddFamilyMembers (){
	}

	@Then("Click the cross icon on the family member want to delete")
	def clickTheCrossIconOnTheFamilyMemberWantToDelete (){
	}
}