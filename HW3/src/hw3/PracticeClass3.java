package hw3;

import java.util.Scanner;

public class PracticeClass3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a String.");
		Scanner ui = new Scanner (System.in);
		String a = ui.nextLine();
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.length());
		
		System.out.println(a.replace('a', 'z'));
		
		System.out.println(a.charAt(a.length() - 1));
	
		System.out.println(a.concat(":").concat("NY, ").concat("NC, ").concat("CA, ").concat("PA and ").concat("FL"));
		
		System.out.println(a.toCharArray());
		
		
	}

}
