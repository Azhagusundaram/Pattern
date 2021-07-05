package com.pattern;

public class Pattern3 {
	public static void main(String[] args){
		int tempNum=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<tempNum;j++)
			{
				System.out.print("*");
			}
			tempNum--;
			System.out.print("\n");
		}
	}
}
/*
*****
****
***
**
*
*/