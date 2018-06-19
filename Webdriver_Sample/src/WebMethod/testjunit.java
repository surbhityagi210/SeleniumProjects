package WebMethod;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testjunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Setup");
	}

	@Test
	public void test() {
		System.out.println("Function test");
	}
	@Test
	public void test1() {
		System.out.println("Function test1");
	}
	@Test
	public void test2() {
		System.out.println("Function test2");
	}
	@Test
	public void test3() {
		System.out.println("Function test3");
	}

}
