package com.mkpits.methods;

public class Calling_Method_Using_Return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling methods using different ways.
				// 1. Direct Access
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("calling method by Direct Access");
				System.out.println();
				getAllData();
				System.out.println("-------------------------------------------------------------------------------------------");

				
				// 2. className.methodName();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("calling method by reference of class");
				System.out.println();
				Calling_Method_Using_Return_type.getAllData();
				System.out.println("------------------------------------------------------------------------------------------");
				
				// 3. objreference.methodName(); 
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("calling method by reference of object");
				System.out.println();
				Calling_Method_Using_Return_type cMURT = new Calling_Method_Using_Return_type();
				cMURT.getAllData();
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("fjkvnksdvnkj");
			//	System.out.println();		
	}
	
	public static String getFirstName() {
		String fName = "Vaibhav";
		//System.out.println("First Name: "+fName);
		return fName;
	}
	
	public static String getLastName() {
		String lName = "Paidlewar";
		//System.out.println("Last Name: "+lName);
		return lName;
	}
	
	public static String getEmail() {
		String eMail = "vaibhavp9890@gmail.com";
		//System.out.println("Email: "+eMail);
		return eMail;
	}
	
	public static int getMobile() {
		int mobileNo = 1234567890;
		//System.out.println("Mobile Number: "+mobileNo);
		return mobileNo;
	}
	
	public static char getGender() {
		char yourGender = 'M';
		//System.out.println("Enter Gender: "+yourGender);
		return yourGender;
	}
	
	public static String getPassword() {
		String passWord = "hmmm_aage_se_Right";
		//System.out.println("Enter password: "+passWord);
		return passWord;
	}
	
	public static void getAllData() {
		// direct calling
		getFirstName();
		getLastName();
		getGender();
		getMobile();
		getEmail();
		getPassword();
		
	}

	// declare return type if not use void
	// method name - any valid name but not keyword
	// () - for argument
	// {} - method body
	
	
}
