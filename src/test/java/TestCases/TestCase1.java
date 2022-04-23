package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Epic("Allure examples")
@Feature("Log in feature")
public class TestCase1 {
@Test
@Description("this is a login test")
@Severity(SeverityLevel.CRITICAL)
@Story("In order to perform Login")
	public void doLogin() throws FileNotFoundException
	{
		System.out.println("Test Case pass");
		
		
		
	}
@Test

@Description("this is a Registartion test")
@Severity(SeverityLevel.BLOCKER)
public void userReg()
{
	Assert.fail("Testcase fail");
	
}
@Test
public void isSkip()
{
	throw new SkipException("test case skip");
	
}
@Test
@Description("this is a Registartion test")
@Severity(SeverityLevel.BLOCKER)
public void userReg2()
{
	Assert.fail("Testcase fail");
	
}

	
}
