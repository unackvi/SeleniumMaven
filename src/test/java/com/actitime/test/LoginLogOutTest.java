package com.actitime.test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.LoginPage;

public class LoginLogOutTest extends BaseTest {
	@Test
	public void login() throws IOException {
		Reporter.log("login method of test class is executing", true);
		System.out.println("Hello");
	}
}
