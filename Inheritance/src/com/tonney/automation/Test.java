package com.tonney.automation;

public class Test extends A{
public static void main (String args[])
{
	A obj = new A(); //  Create an object of class A and call the instance variable using reference variable obj. 
	System.out.println("the values is::  " +obj.a);  // 'a' of A is called. 
	Q q = new Q(); // Create an object of class Q and call the instance variable using reference variable obj. 
	System.out.println("the values is::  " +q.a);  //'a' of Q is called. 
}
}
