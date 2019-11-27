package cs300week1;

import java.util.ArrayList;
import java.util.Scanner;

public class BugCatcher {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;
		for (int i = 0; i < text.length(); i++) {
			if(text.substring(i,i+1).equals("A")) {
				a =a+1;
			}else if(text.substring(i,i+1).equals("B")) {
				b =b+1;
			}else if(text.substring(i,i+1).equals("C")) {
				c =c+1;
			}else if(text.substring(i,i+1).equals("D")) {
				d =d+1;
			}else if(text.substring(i,i+1).equals("E")) {
				e =e+1;
			}
				
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		if(a>b&&a>c&&a>d&&a>e) {
			System.out.println("A");
		}else if(b>a&&b>c&&b>d&&b>e) {
			System.out.println("B");
		}else if(c>a&&c>b&&c>d&&c>e) {
			System.out.println("C");
		}else if(d>a&&d>b&&d>c&&d>e) {
			System.out.println("D");
		}else if(e>a&&e>b&&e>c&&e>d) {
			System.out.println("E");
		}

	}

}
