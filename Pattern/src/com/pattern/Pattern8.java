package com.pattern;
public class Pattern8 {
	public static void main(String[] args){
		int tempNum1=1,tempNum2=4;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<tempNum1;j++)
			{
				System.out.print("*");
			}
			tempNum1++;
			System.out.print("\n");
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<tempNum2;j++)
			{
				System.out.print("*");
			}
			tempNum2--;
			System.out.print("\n");
		}
	}
}
/*
*
**
***
****
*****
****
***
**
*
*/