package com.pattern;

public class Pattern7 {
	public static void main(String[] args){
		int tempNum1=4,tempNum2=0;
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<tempNum1;k++)
			{
				System.out.print(" ");
			}
			tempNum2++;
			for(int j=0;j<tempNum2;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<tempNum1;k++)
			{
				System.out.print(" ");
			}
			tempNum2++;
			tempNum1--;
			System.out.print("\n");
		}
		tempNum1=1;
		tempNum2=8;
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<tempNum1;k++)
			{
				System.out.print(" ");
			}
			tempNum2--;
			for(int j=0;j<tempNum2;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<tempNum1;k++)
			{
				System.out.print(" ");
			}
			tempNum2--;
			tempNum1++;
			System.out.print("\n");
		}
	}
}
/*
    *    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *    
*/