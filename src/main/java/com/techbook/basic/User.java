package com.techbook.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

// value injection can be done by two ways by  setter  getter and through  constructor 
public class User {
	private String firstName;
	// public int age;
	// public Address address;//**** confusion****
	// auta manxae ko address auta matra nahuna sakxa so we take list
	public List<Address> addresses;
//#######################################################
	// public String getFirstName() {
	// return firstName;
	// }
 
	// This is setter injection
	// public void setFirstName(String name) {
	// this.firstName = name;
	// }
	// This injection is by constructor
	// public User(String firstName, int age, String address) {
	// this.firstName=firstName;
	// this.age=age;
	// this.address=address;
	// }

	// public String getFirstName() {
	// return firstName;
	// }

	// public void setFirstName(String firstName) {
	// this.firstName = firstName;
	// }

	// public Address getAddress() {
	// return address;
	// }

	// public void setAddress(Address address) {
	// this.address = address;
	// }
    //########################################################
	public String getFirstName() {
		return firstName;
	}
 
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}
	//public void setAddresses(List<Address> addresses) {
		//this.addresses = addresses;
	//}
	// first name ko bean create nagari garda autowired garidine
       @Autowired
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void displayInfo() {
		System.out.println("name is :" + firstName);
		// System.out.println("age is :"+age);
		// System.out.println("address is:" + address);
		// System.out.println("City name is:"+getAddress().getCityName());
		// System.out.println("Country name is:"+getAddress().getCountryName());
		for (Address address : getAddresses()) {
		System.out.println("City name is:"+address.getCityName());
		System.out.println("Country name is:"+address.getCountryName());
		System.out.println("=============================================");
		
		}
		
		}

	}
