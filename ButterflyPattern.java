package com.codegnan.patterns;

public class ButterflyPattern {

	public static void main(String[] args) {
		
				int rows=5;
				//upper part of the butterfly pattern(ecxpanding wings)
				for(int i=1;i<=rows;i++) {// 1<=5 outer for loop controls the current row number
					// inner for loop 1: print the * as left wing
					for(int j=1;j<=i;j++) {//1<=1
						System.out.print("*");
						
					}
					//inner for loop2: print spaces in middle gap.
					//The number spaces decreases as 1 increases.
					//formula =2*(rows-i);
					int spaces=2*(rows-i);
					for(int k=1;k<=spaces;k++) {
						System.out.print(" ");
					}
					//inner for loop 3 print stars as right wing.
					for(int a=1;a<=i;a++) {//1<=1
						System.out.print("*");
					}
					System.out.println();
				}
				//lower part of the butter fly pattern.
				for(int i=rows-1;i>=1;i--) {//outer for loop for below butterfly pattern rows.
					//inner for loop 1 downward pattern
					//print the stars on left wing.
					//The number of stars decreases with i.
					for(int j=1;j<=i;j++) {
						System.out.print("*");
						
					}
					//inner for loop2 print spaces.
					int spaces=2*(rows-i);
					for(int k=1;k<=spaces;k++) {
						System.out.print(" ");
					}
					//inner for loop 3 print stars.
					for(int a=1;a<=i;a++) {
						System.out.print("*");

					}
					System.out.println();
					
					
				}

			}

		}

		