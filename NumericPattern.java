/*print below numeric Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21*/
package com.codegnan.patterns;
public class NumericPattern {
	    public static void main(String[] args) {
	        int n = 6;  // number of rows
	        int num = 1;  // starting number

	        for (int i = 1; i <= n; i++) {
	            // print numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();  // move to next line
	        }
	    }
	}
