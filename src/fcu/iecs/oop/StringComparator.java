package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		boolean run=false;
		Scanner scanner = new Scanner(System.in);
		String a,b;
		
		do{
			System.out.println("Enter a string 1");
			a=scanner.next();
			System.out.println("Enter a string 2");
			b=scanner.next();
        if(a.equalsIgnoreCase(b)){
        	System.out.println("The two strings are the same.");
        	run=true;
        	break;
        }
        else{
        	System.out.println("The two strings are not the same.");
        	
     
        }
        }while(run=true);
	}

}