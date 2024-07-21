package javaproj;

//types of variables 1.local variable,instance variable and static variable
public class VariablesDemo{
	//instance variable
	int a=10;
	byte b=-128;
	boolean flag=false;
	float c=10.2f;
	double d=19.9;	
	//local variable
  void print() {
  	String mesg="hello i am local variable";
  	System.out.println(mesg);
  }
	//static variable
  static String message="Hello i'm static variable";	
	public static void main(String[] args) {
		//Explicit type casting
		int x=10;
		short y=(short) x;
		System.out.println(y);	
		//Implicit
		short z=100;
		int zz=(int)z;
		System.out.println(zz);
		HelloWorld ob=new HelloWorld();	
		System.out.println("The value of a"+ob.a);	
		ob.print();	
		System.out.println(message);	
      System.out.println("Hello students welcome to TNS training...");
	}
	
}

