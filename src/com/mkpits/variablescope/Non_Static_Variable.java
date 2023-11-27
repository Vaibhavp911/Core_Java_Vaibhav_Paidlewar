package com.mkpits.variablescope;

public class Non_Static_Variable {
	
	public int pinCode = 441111; 	//non static variable as it is not declared static 
	public float floatNumber = 15.76567f;
	public byte byteNumber = 122;
	public char charLetter = 'V';
	public double doubleNumber = 2535.1423543654657;
	public long longNumber = 124325436574859086L;
	public boolean  nonStatic = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_Static_Variable variable = new Non_Static_Variable();
		System.out.println("Pincode is "+variable.pinCode);
		System.out.println("floatNumber is "+variable.floatNumber);
		System.out.println("byteNumber is "+variable.byteNumber);
		System.out.println("charLetter is "+variable.charLetter);
		System.out.println("doubleNumber is "+variable.doubleNumber);
		System.out.println("longNumber is "+variable.longNumber);
		System.out.println("boolean nonStatic "+variable.nonStatic);
		Static_Variable sv = new Static_Variable();
		System.out.println("calling static variable in Non-static --> staticVar1: "+sv.staticVar1);
		
	}

}
