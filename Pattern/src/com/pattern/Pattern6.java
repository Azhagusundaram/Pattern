package com.pattern;

public class Pattern6 {
	public static void main(String[] args){
		int tempNum1=0,tempNum2=10;
		for(int i=0;i<5;i++)
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
*********
 ******* 
  *****  
   ***   
    *    
*/