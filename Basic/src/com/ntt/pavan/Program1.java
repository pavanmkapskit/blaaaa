package com.ntt.pavan;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		 int a[]=new int[5];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<5;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<5;i=i+2)
		 {
			 System.out.println(a[i]);
			 			
		 }
	}

}
