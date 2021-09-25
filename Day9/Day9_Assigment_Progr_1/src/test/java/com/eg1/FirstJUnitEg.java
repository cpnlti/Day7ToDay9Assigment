package com.eg1;
//#1. In the JUnit example shared, write a Test case to check subtraction of two negative numbers?
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class FirstJUnitEg {

	static ArithBusinessLogic obj;
	static IArithService ias;

	// execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");

		obj = new ArithBusinessLogic();
		ias = mock(IArithService.class);

		obj.setIAService(ias);
	}

	// execute after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	// execute before test
	@Before
	public void before() {
		System.out.println("in before");

	}

	// execute after test
	@After
	public void after() {
		System.out.println("in after");
	}

	// test case
	@Test
	public void test1() {

		// add the behavior to add numbers
		when(ias.iadd(20, 10)).thenReturn(30);
		// thenThrow()

		Assert.assertEquals(obj.add(20, 10), 30);

		System.out.println("in test1");

	}
	@Test
	public void test0() {

		// add the behavior to add numbers
		when(ias.iadd(Integer.MAX_VALUE, Integer.MAX_VALUE)).thenReturn(-2);
		// thenThrow()

		Assert.assertEquals(obj.add(Integer.MAX_VALUE, Integer.MAX_VALUE), -2);

		System.out.println("in test1");

	}
	// test case
	@Test
	public void test2() {
		// subtract the behavior to subtract numbers
		when(ias.isub(20, 10)).thenReturn(10);

		Assert.assertEquals(obj.sub(20, 10), 10);
		System.out.println("in test2");
	}
	
	@Test
	public void test3() {

		// add the behavior to add numbers
		when(ias.isub(-20, -30)).thenReturn(10);
		// thenThrow()

		Assert.assertEquals(obj.sub(-20, -30), 10);

		System.out.println("in test3");

	}
	
	@Test
	public void test5() {
		// subtract the behavior to subtract numbers
		when(ias.imul(5, 2)).thenReturn(10);

		Assert.assertEquals(obj.mul(5, 2), 10);
		System.out.println("in test4");
	}
	

	// test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("in ignore test");
	}
}