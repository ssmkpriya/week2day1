package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String webtitle = driver.getTitle();
		System.out.println("Title:" + webtitle);
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("demosalesmanager");
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		WebElement login = driver.findElementByClassName("decorativeSubmit");
		login.click();
		WebElement crmFsa = driver.findElementByLinkText("CRM/SFA");
		crmFsa.click();
		WebElement createLead = driver.findElementByLinkText("Create Lead");
		createLead.click();
		WebElement companyName = driver.findElementById("createLeadForm_companyName");
		companyName.sendKeys("Test Leaf");
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Priya");
		String name=firstName.getText();
		WebElement lastName=driver.findElementById("createLeadForm_lastName");
		lastName.sendKeys("Thomas");
		WebElement lastNameLocal=driver.findElementById("createLeadForm_lastNameLocal");
		lastName.sendKeys("Priya");
		WebElement dob=driver.findElementById("createLeadForm_birthDate");
		dob.sendKeys("4/12/83");
		WebElement employees=driver.findElementById("createLeadForm_numberEmployees");
		employees.sendKeys("100");
		WebElement firstnameLocal = driver.findElementById("createLeadForm_firstNameLocal");
		firstnameLocal.sendKeys("Priya");
		WebElement salutation = driver.findElementById("createLeadForm_personalTitle");
		salutation.sendKeys("Software Engineer");
		WebElement title = driver.findElementById("createLeadForm_generalProfTitle");
		title.sendKeys("Testing");
		WebElement annualRevenue = driver.findElementById("createLeadForm_annualRevenue");
		annualRevenue.sendKeys("1300000");
		WebElement sicCode = driver.findElementById("createLeadForm_sicCode");
		sicCode.sendKeys("1001");
		WebElement description = driver.findElementById("createLeadForm_description");
		description.sendKeys("Testing Description");
		WebElement importantNote = driver.findElementById("createLeadForm_importantNote");
		importantNote.sendKeys("Testing Important Note");
		WebElement countryCode = driver.findElementById("createLeadForm_primaryPhoneCountryCode");
		countryCode.clear();
		countryCode.sendKeys("4");
		WebElement areaCode = driver.findElementById("createLeadForm_primaryPhoneAreaCode");
		areaCode.sendKeys("044");
		WebElement extension = driver.findElementById("createLeadForm_primaryPhoneExtension");
		extension.sendKeys("04411");
		WebElement email = driver.findElementById("createLeadForm_primaryEmail");
		email.sendKeys("testing@gmail.com");
		WebElement phoneNumber = driver.findElementById("createLeadForm_primaryPhoneNumber");
		phoneNumber.sendKeys("9876543210");
		WebElement persontoAsk = driver.findElementById("createLeadForm_primaryPhoneAskForName");
		persontoAsk.sendKeys("9876543210");
		WebElement webURL = driver.findElementById("createLeadForm_primaryWebUrl");
		webURL.sendKeys("Testing uRL");
		// Primary Address
		WebElement toName = driver.findElementById("createLeadForm_generalToName");
		toName.sendKeys("Testing To Name");
		WebElement attentionName = driver.findElementById("createLeadForm_generalAttnName");
		attentionName.sendKeys("Testing Attention Name");
		WebElement addressLine1 = driver.findElementById("createLeadForm_generalAddress1");
		addressLine1.sendKeys("Testing AddressLine1");
		WebElement addressLine2 = driver.findElementById("createLeadForm_generalAddress2");
		addressLine2.sendKeys("Testing AddressLine2");
		WebElement city = driver.findElementById("createLeadForm_generalCity");
		city.sendKeys("Testing City");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		state.sendKeys("Testing State");
		WebElement zipCode = driver.findElementById("createLeadForm_generalPostalCode");
		zipCode.sendKeys("1");
		WebElement zipCodeExtension = driver.findElementById("createLeadForm_generalPostalCodeExt");
		zipCodeExtension.sendKeys("111");
		driver.findElementByClassName("smallSubmit").click();
		String t=driver.getTitle();
		WebElement Fname=driver.findElement(By.id("viewLead_firstName_sp"));
		String printFn=Fname.getText();
		System.out.println("First Name Is:" + printFn);
		System.out.println("Page Title "+ t);
		//driver.quit();

	}

}
