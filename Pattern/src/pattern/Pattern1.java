package pattern;
public class Pattern1{
	public static void main(String[] args){
		int tempNum=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<tempNum;j++)
			{
				System.out.print("*");
			}
			tempNum++;
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
*/