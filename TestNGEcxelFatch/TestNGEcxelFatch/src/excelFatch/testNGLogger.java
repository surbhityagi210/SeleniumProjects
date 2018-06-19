package excelFatch;

import org.testng.IInvokedMethod;

import org.testng.IInvokedMethodListener;
 
import org.testng.ISuite;
 
import org.testng.ISuiteListener;
 
import org.testng.ITestContext;
 
import org.testng.ITestListener;
 
import org.testng.ITestNGMethod;
 
import org.testng.ITestResult;
 
import org.testng.Reporter;
 

public class testNGLogger implements ITestListener, ISuiteListener, IInvokedMethodListener {


	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("test...");
	}
		// TODO Auto-generated method stub
		

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
