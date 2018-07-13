package com.yiibai;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestHelloWorld {
  @Test
  public void testEmailGenerator() {
    RandomEmailGenerator obj = new RandomEmailGenerator();
    String email = obj.generate();
        
    Assert.assertNotNull(email);
    Assert.assertEquals(email, "feedback@yiibai.com");
    System.out.println("this is testEmailGenerator");
  }

  @Test
  public void testGitHub() {
    System.out.println("testGitHub");
  }
  @BeforeClass
  public void beforeClass() {
    System.out.println("this is beforeclass");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("this is afterclass");
  }

}