package com.codegnan.patterns;

public class SquareHollow {

	public static void main(String[] args) {
		        int n = 5; // Size of the square

		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                // Print '*' for the first and last row or column
		                if (i == 1 || i == n || j == 1 || j == n)
		                    System.out.print("* ");
		                else
		                    System.out.print("  "); // Two spaces for proper alignment
		            }
		            System.out.println();
		        }
		    
		}


	}


