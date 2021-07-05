package com.pattern;

public class Pattern4 {
	public static void main(String[] args){
		int tempNum=0;
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<tempNum;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<5-tempNum;j++)
			{
				System.out.print("*");
			}
			tempNum++;
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