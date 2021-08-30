package com.bhn.xsd;

public class GetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ObjectFactory fact=new ObjectFactory();
		final Address address=new Address();
		address.setFirstname("Jhansi");
		
		System.out.println("First Name : "+address.firstname);
	}

}
