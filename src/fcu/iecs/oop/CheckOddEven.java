package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i; 
		System.out.println("Enter integer");
		i =scanner.nextInt();
		if(i%2==0){
			System.out.println("The input is Even Number.");
		}
		else{
			System.out.println("The input is Odd Number.");
		}
	}

}