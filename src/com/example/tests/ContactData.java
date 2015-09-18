package com.example.tests;

public class ContactData implements Comparable<ContactData>{
	public String firstname;
	public String lastname;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email;
	public String email2;
	public String bday;
	public String bmonth;
	public String byear;
	public String new_group;
	public String address2;
	public String phone2;
	public String name;
	
	public ContactData() {
	}
	
	public ContactData(String firstname, String lastname, String address, String home, String mobile, String 
			work, String email, String email2, String bday, String bmonth, String byear, 
			String new_group, String address2, String phone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email = email;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.new_group = new_group;
		this.address2 = address2;
		this.phone2 = phone2;
	}
	
	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", home="
				+ home + ", mobile=" + mobile + ", work=" + work + ", email=" + email + ", email2=" + email2 + ", bday="
				+ bday + ", bmonth=" + bmonth + ", byear=" + byear + ", new_group=" + new_group + ", address2="
				+ address2 + ", phone2=" + phone2 + "]";
	}

	@Override
	public int hashCode() {
		//final int prime = 31;
		int result = 1;
		//result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return this.lastname.toLowerCase().compareTo(other.lastname.toLowerCase());
	}
}