package com.codegnan.patterns;

public class FloydsTrianglePattern {

	public static void main(String[] args) {
		        int n = 5; // Number of rows
		        char ch = 'A'; // Starting character
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(ch);
		                ch++;
		            }
		            System.out.println();
		        }
		    }
		


	}


