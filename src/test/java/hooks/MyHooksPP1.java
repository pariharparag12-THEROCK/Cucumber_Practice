package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHooksPP1 {
	
	/*
	@Before (order = -1)
	public void beforeHook1() {
		System.out.println("Before Hook 1 is executing");
	}
	
	@Before (order = 0)
	public void beforeHook2() {
		System.out.println("Before Hook 2 is executing");
	}
	
	@After (order = 200)
	public void afterHook1() {
		System.out.println("After Hook 1 is executing");
	}
	
	@After (order = 50)
	public void afterHook2() {
		System.out.println("After Hook 2 is executing");
	}
	
	@BeforeStep (order = 2)
	public void beforeStep1() {
		System.out.println("Before Step 1 is executing");
	}
	
	@BeforeStep (order = 4)
	public void beforeStep2() {
		System.out.println("Before Step 2 is executing");
	}
	
	@AfterStep (order = 400)
	public void afterStep1() {
		System.out.println("After Step 1 is executing");
	}
	
	@AfterStep (order = 300)
	public void afterStep2() {
		System.out.println("After Step 2 is executing");
	}
	
	@BeforeAll (order = 0)
	public static void beforeAll1() {
		System.out.println("Before All1  is executing");
	}
	
	@BeforeAll (order = 1)
	public static void beforeAll2() {
		System.out.println("Before All2  is executing");
	}
	
	

	@AfterAll(order = 15)
	public static void afterAll1() {
		System.out.println("After All1  is executing");
	}
	
	
	@AfterAll (order = 12)
	public static void afterAll2() {
		System.out.println("After All2  is executing");
	}
	*/
	
	@BeforeStep ("@Sanity")
	public void BeforeStep() {
		
		System.out.println("Before Step is executing");
	}
	
	/*
	 * @AfterStep("@Regression") public void AfterStep() {
	 * 
	 * System.out.println("After Step is executing"); }
	 * 
	 * @Before("@Regression") public void beforehook() {
	 * 
	 * System.out.println("BeforeHook is executing"); }
	 */

}
