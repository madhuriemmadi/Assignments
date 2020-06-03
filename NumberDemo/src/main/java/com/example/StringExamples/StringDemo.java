package com.example.StringExamples;

public class StringDemo {

	public static void main(String[] args) {
		String str1 ="James";
		String str4="Dsliva";
		String str5= "He lives in Texas";
		//str1.join(-, str5);
		String str2= new String("Sessions");
		String str3 =new String("James");
		StringBuilder strb1 =new StringBuilder(str1);
		StringBuilder strb2 =new StringBuilder(str1);
		System.out.print("Using Join : " + String.join("-", str1,str2));
		String[] arr =str5.split(" ");
		System.out.print("\nUsing Split :\n " );
		for(String s:arr) {
			System.out.println(s);
		}
		if(str2.equals(str3))
			System.out.print("Strings are eqaul ");
		System.out.println("Caluclating string lenght of Sessions :" + str2.length());
		System.out.println("\nSubstring :" + str3.substring(0,3));
		System.out.println("\nTo Upper case : " + str3.toUpperCase());
		strb1.append(str2);
		System.out.println("Using String builder append :" + strb1);
		System.out.println("Using equals for Stirng Builder" +strb1.equals(strb2));
		strb1.deleteCharAt(4);
		System.out.println("Using String builder append :" + strb1);
		
	}

}
