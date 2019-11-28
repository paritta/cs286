import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class CardVelification {

	public static void main(String[] args) {
		ArrayList<Integer> allnum = new ArrayList<Integer>();
		ArrayList<Integer> removeData = new ArrayList<Integer>();
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Scanner scan =new Scanner(System.in);
		String a = scan.next();
		
		for (int i = 0; i < a.length(); i++) {
			allnum.add(Integer.valueOf(a.substring(i,i+1)) );
		}
		for (int i = 0; i < allnum.size(); i++) {
			if(i%2!=0) {
				num1.add(allnum.get(i)*2);
			}else {
				num3.add(allnum.get(i));
			}
		}
	//	System.out.println(num1);
		int num=0;
		int all_sum=num1.size();
		for (int i = 0; i <all_sum; i++) {
			//System.out.println(num1.get(i)+":"+i);
			if(num1.get(i)>9) {
				for (int j = 0; j < String.valueOf(num1.get(i)).length(); j++) {
					temp.add(Integer.valueOf(String.valueOf(num1.get(i)).substring(j,j+1)));
				}
				removeData.add(i);
				for (int j = 0; j < temp.size(); j++) {
					num1.add(temp.get(j));
				}
				all_sum = num1.size();
				temp.clear();
			}
		}
	//	System.out.println(removeData);
		for (int i = removeData.size()-1; i >=0 ; i--) {
			int d = removeData.get(i);
			num1.remove(d);
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < num1.size(); i++) {
			sum1 =sum1+num1.get(i);
		}
		for (int i = 0; i < num3.size(); i++) {
			sum2 =sum2+num3.get(i);
		}
		
		String sum =String.valueOf(sum1+sum2).charAt(String.valueOf(sum1+sum2).length()-1)+"" ;
		//System.out.println(sum);
		if(sum.equals("0")) {
			if(a.substring(0,2).equals("34")||a.substring(0,2).equals("37")) {
				System.out.println("AMEX");
			}else if(a.substring(0,2).equals("51")||a.substring(0,2).equals("52")||
					a.substring(0,2).equals("53")||a.substring(0,2).equals("54")||
					a.substring(0,2).equals("55")) {
				System.out.println("MASTERCARD");
			}else if(a.substring(0,1).equals("2")) {
				System.out.println("MASTERCARD");
			}else if(a.substring(0,1).equals("4")) {
				System.out.println("VISA");
			}else if(a.substring(0,1).equals("6")) {
				System.out.println("DISCOVER");
			}else {
				System.out.println("OTHER");
			}
		}else {
			System.out.println("INVALID");
		}
		
	//	System.out.println(num1);
		//System.out.println(num3);
		

	}

}
