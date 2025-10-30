package com.codegnan.patterns;

public class RightPascalTriangle {

	public static void main(String[] args) {
		        int n = 4; // You can change this value to increase or decrease size

		        // Upper half
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		        // Lower half
		        for (int i = n - 1; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		}


