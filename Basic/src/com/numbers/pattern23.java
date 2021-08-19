package com.numbers;

import java.util.Scanner;

public class pattern23 {

	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int count=1;
			for(int i=1;i<n-1;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(count+" ");
					count+=1;
				}
				System.out.println();
			}
			

	}

}
