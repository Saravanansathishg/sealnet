package sealnet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenRDS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome RDS ");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rds-uat.ufours.com/");
		System.out.println("Welcome RDS ");
		Thread.sleep(3000);
		driver.findElement(By.id("txt_UserName")).sendKeys("jjohnson");
		Thread.sleep(3000);
		driver.findElement(By.id("txt_Password")).sendKeys("Assisted321",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/a/b")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/a/b")).click();
		Thread.sleep(3000);
		
		
		 driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[1]/a/b")).click();
		 
		Thread.sleep(3000);
		
		//Unit
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		//unit added.
		driver.findElement(By.id("BtnNewunit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_UnitName")).sendKeys("Unit New 7");
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'divaddunitentry\']/article/div/div[2]/div/div/div/button[1]")).click();
		System.out.println("Unit added successfully.");
		//Room Type added.
		Thread.sleep(3000);
		//Room Type
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewRoomType")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_RoomType")).sendKeys("room 2");
		driver.findElement(By.id("txt_Description")).sendKeys("room type1",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'divroomtypeentry\']/article/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Level of living
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewLevelOfLiving")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_LevelOfLivingName")).sendKeys("level1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc 1",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'divlevelofliveentry\']/article/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Amenity
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewAmenity")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_AmenityName")).sendKeys("Rolling Chair",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("Rolling chari with helper",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'divaddAmenityEntry\']/article/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		
		//Apartment Preference
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewApartmentPreference")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_ApartmentPreferenceName")).sendKeys("Apartment 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("apartment 1",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'divapartmententryform\']/article/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
	
		
		// Room setup
		
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'wid-id-3\']/div/div[2]/div[2]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_ShiftName")).sendKeys("FNS",Keys.TAB);
		driver.findElement(By.id("txt_ShiftAbbreviation")).sendKeys("Full night",Keys.TAB);
		driver.findElement(By.id("timepicker")).sendKeys("",Keys.TAB);
		driver.findElement(By.id("timepicker")).sendKeys("12:01 AM",Keys.TAB);
		driver.findElement(By.id("timepicker1")).sendKeys("08:01 AM",Keys.TAB);
		driver.findElement(By.id("txt_ShiftDifferential")).sendKeys("8hours",Keys.TAB);
		driver.findElement(By.id("txt_EffectiveStartDate")).click();
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[4]/a")).click();
		driver.findElement(By.id("chkiseffectiveenddate")).click();
		driver.findElement(By.id("txt_EffectiveEndDate")).click();
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.id("s2id_autogen3")).sendKeys("10",Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'idFormShiftEntry\']/div/div/div/button[1]")).click();
		
		Thread.sleep(3000);
	
		//Room Style
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewRoomStyle")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("txt_RoomStyleName")).sendKeys("Fully A/C",Keys.TAB);
		driver.findElement(By.id("txt_RoomStyleCost")).sendKeys("2300",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("test",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'idFormRoomStyleEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		
		//Resident Room
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewResidentRoom")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_RoomNumber")).sendKeys("101",Keys.TAB);
		driver.findElement(By.id("s2id_ddl_RoomStyleId")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("s2id_autogen2_search")).sendKeys("roo",Keys.TAB);
		
		driver.findElement(By.id("select2-chosen-3")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("s2id_autogen3_search")).sendKeys("new 3",Keys.TAB);
		
		driver.findElement(By.id("timepicker")).click();
		driver.findElement(By.id("timepicker1")).click();
		driver.findElement(By.id("timepicker2")).click();
		
		driver.findElement(By.id("select2-chosen-4")).click();
		
		driver.findElement(By.id("s2id_autogen4_search")).sendKeys("lev",Keys.TAB);
		
		
		driver.findElement(By.id("s2id_autogen5")).sendKeys("monday",Keys.TAB);
		driver.findElement(By.id("s2id_autogen6")).sendKeys("Tuesday",Keys.TAB);
		driver.findElement(By.id("s2id_autogen7")).sendKeys("friday",Keys.TAB);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\'idFormResidentRoomEntry\']/div[2]/div/div/button[1]")).click();
		
		//Facility Room
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewFacilityRoom")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_FacilityRoomName")).sendKeys("Personal supporter",Keys.TAB);
		driver.findElement(By.id("s2id_ddl_CommunityType")).click();
		driver.findElement(By.id("s2id_autogen4_search")).sendKeys("detox center",Keys.TAB);
		driver.findElement(By.id("s2id_ddl_Unit")).click();
		driver.findElement(By.id("s2id_autogen5_search")).sendKeys("new 2",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("Test Description",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'idFormFacilityRoomEntry\']/div/div/div/button[1]")).click();
		
		//care setup
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewAssistanceLevel")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_LevelName")).sendKeys("Assistance 1",Keys.TAB);
		driver.findElement(By.id("txt_LevelNo")).sendKeys("1",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'idFormAssistanceLevelsEntry\']/div/div/button[1]")).click();
		Thread.sleep(3000);
		
		//Group providers
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewGroupProviders")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_GroupProviderName")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'idFormGroupProviderEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		
		// Categories
		driver.findElement(By.id("BtnNewCategory")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_CategoryName")).sendKeys("Category 1",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'idFormCategoryEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		
		//Service items
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[3]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewServiceItem")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("txt_ServiceItemName")).sendKeys("service 1",Keys.TAB);
		driver.findElement(By.id("s2id_ddl_CategoryId")).click();
		driver.findElement(By.id("s2id_autogen2_search")).sendKeys("Category 1",Keys.TAB);
		driver.findElement(By.id("txt_ServiceAcctlink")).sendKeys("1",Keys.TAB);
		driver.findElement(By.id("txt_ServiceDescription")).sendKeys("description",Keys.TAB);
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("idbtnSave")).click();
		
		
		// Custom field info
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		//Food Alergy
		driver.findElement(By.xpath("<a href=\'/Masters/FoodAllergy/FoodAllergyList\'>Food Allergy</a>")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewFoodAllergy")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_FoodAllergyName")).sendKeys("Food alergy 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormFoodAllergyEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Medical Allergy
		driver.findElement(By.xpath("//*[@id=\"left-panel\"]/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewMedicalAllergy")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_MedicalAllergyName")).sendKeys("Medical allergy 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormMedicalAllergyEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Medication
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewMedication")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_MedicationName")).sendKeys("Medication 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormMedicationEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Contact Type 
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewContactType")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_ContactTypeName")).sendKeys("Primary contact",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("Description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormContactTypeEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Insurance Type
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewInsuranceType")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_InsuranceTypeName")).sendKeys("Health insurance",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("txt_InsuranceTypeName",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormInsuranceTypeEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Task
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewTask")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_TaskName")).sendKeys("Primary task",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("primary description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormTaskEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Mortuary
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewMortuary")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_MortuaryName")).sendKeys("Silent Valley",Keys.TAB);
		driver.findElement(By.id("txt_Phone")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("Test description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormMortuaryEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Hospital
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[8]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewHospital")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_HospitalName")).sendKeys("Malar Hospital",Keys.TAB);
		driver.findElement(By.id("txt_Phone")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("test",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormHospitalEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Hospice
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[9]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewHospice")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_HospiceName")).sendKeys("Hospice 1",Keys.TAB);
		driver.findElement(By.id("txt_Phone")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormHospiceEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Home Care
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[10]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewHomeCare")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_HomeCareName")).sendKeys("Home care 1",Keys.TAB);
		driver.findElement(By.id("txt_Phone")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("test med",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormHomeCareEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Religious
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewReligious")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_ReligiousName")).sendKeys("Hindu",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("RSS",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormReligiousEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Insurance Providers
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[4]/ul/li[12]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewProviders")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_ProviderName")).sendKeys("LIC",Keys.TAB);
		driver.findElement(By.id("txt_Address1")).sendKeys("LIC TOWER",Keys.TAB);
		driver.findElement(By.id("txt_Address2")).sendKeys("Park Avenue",Keys.TAB);
		driver.findElement(By.id("txt_Zip")).sendKeys("50010",Keys.TAB);
		driver.findElement(By.id("txt_Phone1")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.id("txt_Phone2")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'divaddProvidersentry\']/article/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Nursing Assessment
		//Assessment Period
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[5]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewAssessmentPeriod")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_AssessmentPeriodName")).sendKeys("Assessment 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormAssessmentPeriodEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Assistance Type
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[5]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewAssistanceType")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_AssistanceTypeName")).sendKeys("assistance 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormAssessmentPeriodEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Assessment Type
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[5]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewAssessmentType")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_AssessmentTypeName")).sendKeys("Assessment 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormAssessmentTypeEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		
		//Medications
	
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		//custom prompts
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[6]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewcustomprompt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_CustomPromptName")).sendKeys(" 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("test",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormCustomPromptEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Medication Categories
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[6]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewMedicationCategories")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_CategoryName")).sendKeys(" med care 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("description",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormMedicationCategoriesEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Diagnosis
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[6]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewDiagnosis")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_DiagnosisName")).sendKeys(" Diagnosis 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormDiagnosisEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Drug dose measurements
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[6]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewDrugDose")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_DrugDoseMeasurementName")).sendKeys(" DDM 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormDrugDoseEntry\']/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Medical contacts
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[6]/ul/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewMedicalContacts")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("s2id_ddl_ContactType")).click();
		driver.findElement(By.id("s2id_autogen2_search")).sendKeys("physician",Keys.TAB);
		driver.findElement(By.id("txt_FirstName")).sendKeys("sri",Keys.TAB);
		driver.findElement(By.id("txt_LastName")).sendKeys("jay",Keys.TAB);
		driver.findElement(By.id("txt_Address1")).sendKeys("add1",Keys.TAB);
		driver.findElement(By.id("txt_Address2")).sendKeys("add2",Keys.TAB);
		driver.findElement(By.id("txt_MedicalContactZip")).sendKeys("60010",Keys.TAB);
		driver.findElement(By.id("txt_Email")).sendKeys("test@mail.com",Keys.TAB);
		driver.findElement(By.id("txt_Phone")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'divaddmedicalcontactentryform\']/article/div/div[2]/div/div/div/button[1]")).click();
		Thread.sleep(3000);
		//Resident Menu
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[7]/a")).click();
		Thread.sleep(3000);
		//click vendor
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[7]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("BtnNewVendor")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txt_FullName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_FirstName")).sendKeys("Sri",Keys.TAB);
		driver.findElement(By.id("txt_MiddleName")).sendKeys("Sathya",Keys.TAB);
		driver.findElement(By.id("txt_LastName")).sendKeys("Narayanan",Keys.TAB);
		driver.findElement(By.id("btn_SaveFullName")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txt_Email")).sendKeys("test@test.com",Keys.TAB);
		driver.findElement(By.id("s2id_ddl_changeUnit")).click();
		driver.findElement(By.id("s2id_autogen10_search")).sendKeys("100 unit",Keys.TAB);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("txt_Name")).sendKeys("test",Keys.TAB);
		driver.findElement(By.id("select2-chosen-11")).click();
		driver.findElement(By.id("s2id_autogen11_search")).sendKeys("ALL TEL",Keys.TAB);
		driver.findElement(By.id("txt_CellPhone")).sendKeys("9876543210",Keys.TAB);
		driver.findElement(By.id("txt_Address")).sendKeys("add1",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'txt_Address\']")).sendKeys("add2",Keys.TAB);
		driver.findElement(By.id("txt_Zip")).sendKeys("60010",Keys.TAB);
		driver.findElement(By.id("txt_Fax")).sendKeys("9876543210",Keys.TAB);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("select2-chosen-12")).click();
		driver.findElement(By.id("s2id_autogen12_search")).sendKeys("full-Time",Keys.TAB);
		driver.findElement(By.xpath("txt_EmpOrganization")).sendKeys("u4s",Keys.TAB);
		driver.findElement(By.id("txt_JobTitle")).sendKeys("test",Keys.TAB);
		driver.findElement(By.id("txt_EmpName")).sendKeys("sam",Keys.TAB);
		driver.findElement(By.id("txt_EmpAddress")).sendKeys("add1",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'txt_EmpAddress\']")).sendKeys("add2",Keys.TAB);
		driver.findElement(By.id("txt_WorkZipCode")).sendKeys("50010",Keys.TAB);
		driver.findElement(By.id("txt_EmpCellPhone")).sendKeys("",Keys.TAB);
		driver.findElement(By.id("txt_EmpCellPhone")).sendKeys("",Keys.TAB);
		driver.findElement(By.id("select2-chosen-15")).click();
		driver.findElement(By.id("s2id_autogen15_search")).sendKeys("nextel",Keys.TAB);
		driver.findElement(By.id("BtnSaveVendor")).click();
		//Provider
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[7]/ul/li[2]/a")).click();
		driver.findElement(By.id("BtnNewProviders")).click();
		driver.findElement(By.id("txt_FullName")).sendKeys("Provider1",Keys.TAB);
		driver.findElement(By.id("txt_Email")).sendKeys("provider@mail.com",Keys.TAB);
		driver.findElement(By.id("txt_Address1")).sendKeys("test address 1",Keys.TAB);
		driver.findElement(By.id("txt_Address2")).sendKeys("test address 2",Keys.TAB);
		driver.findElement(By.id("txt_Address2")).sendKeys("",Keys.TAB);
		driver.findElement(By.id("txt_Zip")).sendKeys("50010",Keys.TAB);
		driver.findElement(By.id("txt_Phone1")).sendKeys("9876544123",Keys.TAB);
		driver.findElement(By.id("txt_Phone2")).sendKeys("9876544123",Keys.TAB);
		driver.findElement(By.id("txt_Phone3")).sendKeys("9876544123",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'divProvidersentry\']/article/div/div[2]/fieldset/div[4]/div[2]/div/div[1]/div/label/i")).click();
		driver.findElement(By.id("txt_EmploymentStatus")).sendKeys("lavanya",Keys.TAB);
		driver.findElement(By.id("txt_Employer")).sendKeys("ufours",Keys.TAB);
		driver.findElement(By.id("txt_JobTitle")).sendKeys("staff nurse",Keys.TAB);
		driver.findElement(By.id("txt_WorkAddress1")).sendKeys("addresss 1",Keys.TAB);
		driver.findElement(By.id("txt_WorkAddress2")).sendKeys("address 2",Keys.TAB);
		driver.findElement(By.id("txt_WorkZipCode")).sendKeys("30010",Keys.TAB);
		driver.findElement(By.id("s2id_ddl_changeUnit")).click();
		driver.findElement(By.id("s2id_autogen7_search")).sendKeys("100 unit",Keys.TAB);
		driver.findElement(By.id("idbtnSave")).click();
		//Supported Living Setup
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[8]/ul/li/a")).click();
		driver.findElement(By.id("BtnNewPrimaryGoal")).click();
		driver.findElement(By.id("txt_PrimaryGoalName")).sendKeys("pria",Keys.TAB);
		driver.findElement(By.id("txt_Acctlink")).sendKeys("244",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.id("txt_Instruction")).sendKeys("erad",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'groupprovider\']/label/i")).click();
		driver.findElement(By.id("idbtnSave")).click();
		
		
		//Application Approval
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[9]/ul/li/a")).click();
		driver.findElement(By.id("BtnNewVerification")).click();
		driver.findElement(By.id("txt_Name")).sendKeys("verification1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormVerificationEntry\']/fieldset/div[4]/div/div/div/button[1]")).click();
		
					
		//Agreement Summary
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[10]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[10]/ul/li/a")).click();
		driver.findElement(By.id("BtnNewAgreement")).click();
		driver.findElement(By.id("txt_Name")).sendKeys("agreement 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'idFormAgreementEntry\']/div/div/div/button[1]")).click();
		
		//HR Staff
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[11]/a")).click();
		// Garnishment
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[11]/ul/li[1]/a")).click();
		driver.findElement(By.id("BtnNewGarnishmentType")).click();
		driver.findElement(By.id("txt_GarnishmentTypeName")).sendKeys("garnishment 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.id("idbtnSave")).click();
		//Discipline
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[11]/ul/li[2]/a")).click();
		driver.findElement(By.id("BtnNewDisciplineType")).click();
		driver.findElement(By.id("txt_DisciplineTypeName")).sendKeys("disip1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.id("idbtnSave")).click();
		
		//Seperation
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[11]/ul/li[3]/a")).click();
		driver.findElement(By.id("BtnNewSeparationReason")).click();
		driver.findElement(By.id("txt_SeparationReasonName")).sendKeys("sep1");
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.id("idbtnSave")).click();
		
		//Layoff status
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[11]/ul/li[4]/a")).click();
		driver.findElement(By.id("BtnNewLayOffStatus")).click();
		driver.findElement(By.id("txt_LayOffStatusName")).sendKeys("layoff 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.id("idbtnSave")).click();
		
		//Incident
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[12]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'left-panel\']/nav/ul/li[2]/ul/li[2]/ul/li[12]/ul/li/a")).click();
		driver.findElement(By.id("BtnNewIncident")).click();
		driver.findElement(By.id("txt_IncidentType")).sendKeys("incident 1",Keys.TAB);
		driver.findElement(By.id("txt_ReportName")).sendKeys("report 1",Keys.TAB);
		driver.findElement(By.id("txt_Description")).sendKeys("desc",Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'addIncidentEntryDiv\']/article/div/div[2]/div/div/div/button[1]")).click();
		//driver.close();
	}

}
