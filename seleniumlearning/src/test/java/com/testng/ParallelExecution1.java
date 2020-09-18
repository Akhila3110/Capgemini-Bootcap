package com.testng;

import org.testng.annotations.Test;

public class ParallelExecution1 {
	
	@Test
	public void testCase4()
	{
		System.out.println("TestCase4 : Login");
	}
	@Test
	public void testCase5()
	{
		System.out.println("TestCase5 : Search");
	}
	@Test
	public void testCase6()
	{
		System.out.println("TestCase6 : Logout");
	}

}
