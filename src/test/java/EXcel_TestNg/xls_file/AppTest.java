package EXcel_TestNg.xls_file;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 * @throws IOException
	 * @throws BiffException
	 */
	@BeforeTest
	@Parameters({ "first-name", "age", "designation", "skills" })
	public void testSingleString(String firstName, int age, String desig, String skills) {
		System.out.println("Invoked testString " + firstName + "\t" + age + "\t" + desig + "\t" + skills);
	}

	exce_method method1 = new exce_method();

	@Test(dataProvider = "data-provider1")
	void myMethod(String name, String number) {

		System.out.println(name + "\t" + number);
	}

//Excel file reading and the give tha values to the myMethod function
	@DataProvider(name = "data-provider1")
	public String[][] loginData() throws BiffException, IOException {

		String[][] arr;
		return arr = method1.method();

	}

	@DataProvider(name = "data-provider")
	public static Object[][] dataMethod() {
		return new Object[][] { { 1, "ajith", 21 }, { 2, "ranjtha", 23 }, { 2, "indhira", 23 } };
	}

	/*
	 * @DataProvider(name = "data-provider1") public static Object[][] dataMethod1()
	 * { return new Object[][] {}; }
	 */

	@Test(dataProvider = "data-provider")
	void diaplay(int a, String name, int pass) {
		System.out.println(name + "\t" + pass);
	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		AssertJUnit.assertTrue(true);
	}
}
