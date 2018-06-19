package testcase;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGListeners implements ISuiteListener, ITestListener, IInvokedMethodListener {
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Before Invoke");
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Invoke");

	}


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		

	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("On suite start");

	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("On suite finish");

	}

	
}
