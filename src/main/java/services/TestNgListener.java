package services;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestNgListener implements ITestListener {
 String filePath = "D:\\Java+Idea\\Java Fail Screen\\";

 @Override
 public void onTestFailure(ITestResult result) {
  System.out.println("***** Error " + result.getName() + " test has failed *****");
  String methodName = result.getName().trim();
  WebDriver driver = DriverProvider.getDriverProvider().getDriver();
  takeScreenShot(methodName, driver);
 }

 public void takeScreenShot(String methodName, WebDriver driver) {
  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  //The below method will save the screen shot in d drive with test method name
  try {
   FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
   System.out.println("***Placed screen shot in " + filePath + " ***");
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
