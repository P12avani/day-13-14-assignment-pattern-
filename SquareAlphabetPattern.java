package com.codegnan.patterns;

public class SquareAlphabetPattern {

	public static void main(String[] args) {
		        int n = 4; // Number of rows and columns
		        char ch = 'A'; // Starting character

		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n; j++) {
		                System.out.print(ch);
		                ch++;
		            }
		            System.out.println();
		        }
		    }
		

	}


