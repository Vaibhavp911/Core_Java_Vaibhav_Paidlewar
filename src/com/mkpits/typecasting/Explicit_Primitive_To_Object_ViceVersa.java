package com.mkpits.typecasting;

public class Explicit_Primitive_To_Object_ViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java provide set of pre-defined classes called wrapper classes
		// String is class
		// wrapper classes are Integer, Float, Byte, Double, Long, Short, Boolean, Character.
		String prise = "236576.353";
		float p = Float.parseFloat(prise);	// Float wrapper class and parseFloat() is method of Float Wrapper class
		System.out.println("String 'prise' value assigned to float 'p' is "+p);
		// console only takes string value to store it in data-type we use TypeCasting between primitive to object & vice versa. 
	}

}
