/*Zero-One Triangle Pattern

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1*/
package com.codegnan.patterns;

public class ZeroOneTrianglePattern {

	public static void main(String[] args) {
		        int rows = 6; // You can change this value for more/less rows
		        
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                // If sum of row and column is even → print 1, else 0
		                if ((i + j) % 2 == 0)
		                    System.out.print("1 ");
		                else
		                    System.out.print("0 ");
		            }
		            System.out.println();
		        }
		    }

	}


