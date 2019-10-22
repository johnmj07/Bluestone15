package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestListeners implements ITestListener,IAUTOCONSTANT
{
    ExtentHtmlReporter reporter;
    ExtentReports report;
    ExtentTest test;
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getTestClass().getName()+result.getMethod().getMethodName());
		test.log(Status.INFO,"Started"+result.getTestClass().getName()+result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Testcase Pass"+result.getTestClass().getName()+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Testcase Fail"+result.getTestClass().getName()+result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Testcase Skipped"+result.getTestClass().getTestName()+result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		reporter=new ExtentHtmlReporter(XLREPORT);
		reporter.config().setDocumentTitle("");
		reporter.config().setReportName("");
		reporter.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Environment", "Test");
		report.setSystemInfo("Platform", "Win10");
		report.setSystemInfo("Build", "2.14");
		report.setSystemInfo("Engineer", "JOEMJ");

		
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}
	
 
}
