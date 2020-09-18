package com.testng;

import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void testCase1()
	{
		System.out.println("TestCase1 : Login");
	}
	@Test
	public void testCase2()
	{
		System.out.println("TestCase2 : Search");
	}
	@Test
	public void testCase3()
	{
		System.out.println("TestCase3 : Logout");
	}

}
