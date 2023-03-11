package assistent_practice;

import java.util.Scanner;

public class Calculatoe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0;
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter the operator");
		char op=sc.next().charAt(0);
		System.out.println("Enter the 2st number");
		int n2=sc.nextInt();
		switch(op) {
		case '+':	result=n1+n2;
					System.out.println(n1+"+"+n2+"="+result);
					break;
		case '-':result=n1-n2;
		System.out.println(n1+"-"+n2+"="+result);
		break;
			
			
			
		case '*':result=n1*n2;
		System.out.println(n1+"*"+n2+"="+result);
		break;
			
			
			
		case '/':result=n1/n2;
		System.out.println(n1+"/"+n2+"="+result);
		break;
					
		
		
		
		}

	}

}
