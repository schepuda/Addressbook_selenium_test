package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.framework.ApplicationManager;

public class TestBase
{
  protected static ApplicationManager app;
  
  @BeforeTest
  public void setUp()
    throws Exception
  {
    app = new ApplicationManager();
  }
  
  @AfterTest
  public void tearDown()
    throws Exception
  {
    app.stop();
  }
  
  @DataProvider
  public Iterator<Object[]> randomValidGroupGenerator()
  {
    List<Object[]> list = new ArrayList();
    for (int i = 0; i < 5; i++)
    {
      GroupData group = new GroupData()
    	.withName(generateRandomGroupString())
    	.withHeader(generateRandomGroupString())
    	.withFooter(generateRandomGroupString());
      list.add(new Object[] { group });
    }
    return list.iterator();
  }
  
  public String generateRandomGroupString()
  {
    Random rnd = new Random();
    if (rnd.nextInt(2) == 0) {
      return "";
    }
    return "test" + rnd.nextInt();
  }
  
  
  @DataProvider
  public Iterator<Object[]> randomValidContactGenerator()
  {
    List<Object[]> list = new ArrayList();
    for (int i = 0; i < 5; i++)
    {
      ContactData contact = new ContactData()
	  .withFirstname(generateRandomContactString())
	  .withLastname(generateRandomContactString())
	  .withAddress(generateRandomContactString())
	  .withHome(generateRandomPhoneString())
	  .withMobile(generateRandomPhoneString())
	  .withWork(generateRandomPhoneString())
	  .withEmail(generateRandomContactString())
	  .withEmail2(generateRandomContactString())
	  .withBday(generateRandomDateString())
	  .withBmonth(generateRandomMonthString())
	  .withByear(generateRandomYearString())
	  //.withNew_group(generateRandomContactString())
	  .withAddress2(generateRandomContactString())
	  .withPhone2(generateRandomPhoneString());
      list.add(new Object[] { contact });
    }
    return list.iterator();
  }
  
  public String generateRandomContactString()
  {
    Random rnd = new Random();
    if (rnd.nextInt(3) == 0) {
      return "";
    }
    return "testing_teõt" + rnd.nextInt();
  }
  
  public String generateRandomPhoneString()
  {
    Random rnd = new Random();
    if (rnd.nextInt(3) == 0) {
      return "";
    }
    return "+8 (999) 777 44 - " + rnd.nextInt(100);
  }
  
  public String generateRandomDateString()
  {
    Random rnd = new Random();
    if (rnd.nextInt(5) == 0) {
      return "-";
    }
    return "" + rnd.nextInt(32);
  }
    
    public String generateRandomMonthString() {
        String[] monthList = {"-", "January", "February", "March", "April", "May", "June", "July", 
        		"August", "September", "October", "November", "December"};
        int oneLength = monthList.length;
        int rand = (int) (Math.random() * oneLength);
		return monthList[rand];
    }
    
    public String generateRandomYearString() {
    {
      Random rnd = new Random();
      if (rnd.nextInt(5) == 0) {
      return "";
      }
     return "" + rnd.nextInt(20320);
     }
   }
    
}
