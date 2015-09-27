package com.example.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.thoughtworks.xstream.XStream;


public class ContactDataGenerator {

	public static void main(String[] args) throws IOException {
		if (args.length < 3) {
		System.out.println("Please, specify parameters: <amount of test data> <file> <format>");
		return;
		}
		
		int amount = Integer.parseInt(args[0]);
		File file = new File(args[1]);
		String format = args[2];
		
		if (file.exists()) {
			System.out.println("File " + file + " is exists: please remove or rename it manually" );
			return;
		}
		
		List<ContactData> contacts = GenerateRandomContacts(amount);
		if ("csv".equals(format)) {
			saveContactsToCsvFile(contacts, file);
		} else if ("xml".equals(format)) {
			saveContactsToXmlFile(contacts, file);
		} else {
			System.out.println("Unknown format " + format);
		return;
		}
	}
	
	
	private static void saveContactsToXmlFile(List<ContactData> contacts, File file) throws IOException {
		XStream xstream = new XStream();
		xstream.alias("contact", ContactData.class);
		String xml = xstream.toXML(contacts);
		FileWriter writer = new FileWriter(file);
		writer.write(xml);
		writer.close();
	}

	public static List<ContactData> loadContactsFromXmlFile(File file) throws IOException {
		XStream xstream = new XStream();
		xstream.alias("contact", ContactData.class);
		return (List<ContactData>) xstream.fromXML(file);
	}
		
	private static void saveContactsToCsvFile(List<ContactData> contacts, File file) throws IOException {
		FileWriter writer = new FileWriter(file);
		for (ContactData contact : contacts) {
			writer.write(contact.getFirstname() + "," + contact.getLastname() + "," + contact.getAddress() + "," + contact.getHome() + "," + contact.getMobile() + ","
		+ contact.getWork() + "," + contact.getEmail() + "," + contact.getEmail2() + "," + contact.getBday() + "," + contact.getBmonth() + "," + contact.getByear() + ","
		+ contact.getAddress2() + "," + contact.getPhone2() + ",!" + "\n");
		}
		writer.close();
	}
	
	
	
	public static List<ContactData> loadContactsFromCsvFile(File file) throws IOException {
		List<ContactData> list = new ArrayList<ContactData>();
		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		while (line != null) {
			String[] part = line.split(",");
			ContactData contact = new ContactData()
					.withFirstname(part[0])
					.withLastname(part[1])
					.withAddress(part[2])
					.withHome(part[3])
					.withMobile(part[4])
					.withWork(part[5])
					.withEmail(part[6])
					.withEmail2(part[7])
					.withBday(part[8])
					.withBmonth(part[9])
					.withByear(part[10])
					.withAddress2(part[11])
					.withPhone2(part[12]);
			list.add(contact);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		return list;
	}

	public static List<ContactData> GenerateRandomContacts(int amount) {
			    List<ContactData> list = new ArrayList <ContactData>();
			    for (int i = 0; i < amount; i++) {
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
			      list.add(contact);
			    }
			    return list;
			}
	
	public static String generateRandomContactString()
		{
			Random rnd = new Random();
			if (rnd.nextInt(2) == 0) {
				return "";
			}
			return "test" + rnd.nextInt();
		}
	  
	 public static String generateRandomPhoneString()
	 	{
		 Random rnd = new Random();
		 if (rnd.nextInt(3) == 0) {
			 return "";
		 }
		 	return "+8 (999) 777 44 - " + rnd.nextInt(100);
	 	}
	  
	  public static String generateRandomDateString()
	  	{
		  Random rnd = new Random();
		  if (rnd.nextInt(5) == 0) {
			  return "-";
		  }
		  	return "" + rnd.nextInt(32);
	  	}
	    
	    public static String generateRandomMonthString() {
	        String[] monthList = {"-", "January", "February", "March", "April", "May", "June", "July", 
	        		"August", "September", "October", "November", "December"};
	        int oneLength = monthList.length;
	        int rand = (int) (Math.random() * oneLength);
			return monthList[rand];
	    }
	    
	    public static String generateRandomYearString() {
	    	{
	    		Random rnd = new Random();
	    		if (rnd.nextInt(5) == 0) {
	    			return "";
	    		}
	    			return "" + rnd.nextInt(2032);
	    	}
	    }
	  
}
