package com.demo.staticdemo;

public class Maharashtra extends India
{
	static String  state_name = "Maharashtra State";		// static variable defined
	int district_id;
	public static void main(String[] args)
	{
		System.out.println("In Maharashtra Class");
	
		Maharashtra m = new Maharashtra();
		m.district_id = 28;

		Maharashtra m1 = new Maharashtra();
		m1.district_id = 35;
		
		System.out.println("--->"+state_name);

		System.out.println("--->"+m.district_id);
	
		m1.display();
	
	}

}
/*
 *   
 * 
 * 
 * */
