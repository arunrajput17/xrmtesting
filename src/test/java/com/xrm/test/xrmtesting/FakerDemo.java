package com.xrm.test.xrmtesting;


import com.github.javafaker.Faker;


public class FakerDemo {

	public static void main(String[] args) {
		
//		com.github.javafaker.Faker fk = new com.github.javafaker.Faker();
		
		Faker fake = new Faker();
		String city =fake.address().city();
		System.out.println(city);
		System.out.println(fake.country().currency());
		


	}

}


