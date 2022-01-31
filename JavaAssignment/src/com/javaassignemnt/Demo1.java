package com.javaassignemnt;
import java.util.*;
public class Demo1{
public static void main(String args[]) {
String  rev="";
Scanner in=new Scanner(System.in);
System.out.println("Enter a String");
String str=in.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
  rev=rev+str.charAt(i);
System.out.println("Result string is: "+rev);
}
}
