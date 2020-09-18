package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(groups = {"smoke-testing","sanity-testing"})
	public void login()
	{
		System.out.println("TestCase1 : Login");
	}
	@Test(groups = {"functional-testing","smoke-testing"})
	public void search()
	{
		
		System.out.println("TestCase2 : Search");
	}
	@Test(groups = {"re-testing","smoke-testing"})
	public void logout()
	{
		System.out.println("TestCase3 : Logout");
	}



}
