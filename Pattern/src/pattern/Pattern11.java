package pattern;

public class Pattern11 {
	public static void main(String[] args){
		int tempNum=4;
		for(int i=0;i<5;i++)
		{
			for(int k=4;k>tempNum;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<5;j++)
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
 *****
  *****
   *****
    *****
*/