//package com.java.collection;
//
//import java.util.Scanner;
//
//public class NumbertToWords {
//
//	private static final String[] units = {"One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight","Nine"};
//	private static final String[] teens = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fiveteen", "Sixteen", "Seventeen", "Eighteen","Nineteen"};
//	private static final String[] tens = {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
//	private static final String[] huns = {"Hundred", "Thousand"};
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Number: ");
//		int no = sc.nextInt();
//		
//		String words = cntw(no);
//		System.out.println("No in words: "+words);
//		
//		sc.close();	
//	}
//	
//	public static String cntw(int no) {
//		if(no == 0) {
//			return "Zero";
//		}
//		
//		String words = "";
//		int count = 0;
//		
//		while (no > 0) {
//			if(no % 1000 !=0) {
//				words = cltot((int) (no % 1000))+Thousand[count]+" " +words;
//			}
//			no = no/1000;
//			count++;
//		}
//		return words.trim();
//	}
//	
//	private static String cltot(int no) {
//		if(no == 0) {
//			return "";
//		}
//		
//		if(no<10) {
//			return units[no]+" ";
//		}else if(no<20) {
//			return teens[no]+" ";
//		}else if(no<100) {
//			return tens[no/10] + " " + cltot(no%10);
//		}else {
//			return units[no / 100] + " Hundred " + cltot(no%100);
//		}
//	}
//}
