package com.demo.staticdemo;

public class India 
{
	static String country;  
	int area_of_state;


	void display()
	{
		System.out.println("this India method");
		
		India n = new India();
		n.country = "spain";
		System.out.println("the country name-->"+n.country);
	}
}

//static variables store in method  