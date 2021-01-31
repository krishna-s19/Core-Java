package com.array.test;

public class Arrays {
	public static void main(String[] args) {
		//datatype[] arrayname ; is Declaring array
		int[] x; 
		//Instantiation of an Array in Java
		x = new int[5];
		//assiagining values
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for(int y:x) {
			System.out.println(y);
		}
		for(int i=0;i<x.length;i++) {
			System.out.println(i+"="+x[i]);
		}
		// declaration, instantiation
		int []y =new int[5];
//		declaration, instantiation and initialization in single line 
		int []z= {50,200,300,100,400};
		min(z);
	}
	
	static void min(int[]a) {
		int m=a[0];
		for(int i=1;i<a.length;i++) {
			if(m>a[i]) {
				m=a[i];
			}			
		}
		System.out.println("minimum value is ="+m);
		
	}
}
