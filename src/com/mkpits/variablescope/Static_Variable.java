package com.mkpits.variablescope;

public class Static_Variable {
		static int staticVar1 = 3432;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable is declared using static keyword just below class declaration above any method is called static variable.
		// Static variable are also called class variable because variable scope belong to class itself
		//:-Value of static variables is sharable by all instance of the class.
		// calling by direct using, 2 obj.reference
		Static_Variable variable_Static = new Static_Variable();
		System.out.println("static_Var1 is "+variable_Static.staticVar1);
		Non_Static_Variable nsv = new Non_Static_Variable();
		System.out.println("calling Non_static variable in static--> Pincode is "+nsv.pinCode);
		System.out.println("calling Non_static variable in static--> floatNumber is "+nsv.floatNumber);
		System.out.println("calling Non_static variable in static--> byteNumber is "+nsv.byteNumber);
		System.out.println("calling Non_static variable in static--> charLetter is "+nsv.charLetter);
		System.out.println("calling Non_static variable in static--> doubleNumber is "+nsv.doubleNumber);
		System.out.println("calling Non_static variable in static--> longNumber is "+nsv.longNumber);
		System.out.println("calling Non_static variable in static--> boolean nonStatic "+nsv.nonStatic);
	}

}
