package com.ntt.pavan;
import java.io.*;
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Square s=new Square();
		Triangle t=new Triangle();
		System.out.println(c.area(5));
		System.out.println(c.perimeter(4));
		System.out.println(s.area(2));
		System.out.println(s.perimeter(3));
		System.out.println(t.area(2, 3));
		t.perimeter();
	}
		
						
		
	}


