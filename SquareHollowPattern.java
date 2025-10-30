 /*Print squareHollowPattern

******
*    *
*    *
*    *
*    *
******  */
package com.codegnan.patterns;

public class SquareHollowPattern {
	public static void main(String[]args) {
	        int rows = 6;
	        int cols = 6;

	        // Outer loop for rows
	        for (int i = 1; i <= rows; i++) {
	            // Inner loop for columns
	            for (int j = 1; j <= cols; j++) {
	                // Print * for border cells, space for inside cells
	                if (i == 1 || i == rows || j == 1 || j == cols) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}



