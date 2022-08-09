package com.practiceQue;
//"Largest palindrome substring

public class LargestPalindrome {
public static void main(String[] args) {
	String str="babad";           //[0 1 2 3 4]
	char[]arr=str.toCharArray();  //[b a b a d]
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			String str1=str.substring(i, j+1);
			//System.out.println(str1);
		    StringBuilder sb=new StringBuilder(str1);
		    sb.reverse();
		    String str2=sb.toString();
		   // System.out.println(str1+"//"+sb);
		    
		   if(str1.equalsIgnoreCase(str2)) {
			   System.out.println(str1);
		   }
		    
		}
	}
	
}
}
