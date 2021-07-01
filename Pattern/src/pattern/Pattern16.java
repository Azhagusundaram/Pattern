package pattern;

public class Pattern16 {
	public static void main(String[] args){
		int tempNum=0,num=4;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<1;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<tempNum&&tempNum<4;j++)
			{
				System.out.print(" ");

			}
			for(int j=0;j<1&&tempNum!=0;j++)
			{
				System.out.print("*");
			}

			for(int j=0;j<3&&tempNum==4;j++)
			{
				System.out.print("*");
			}
			tempNum++;
			num--;
			System.out.print("\n");
		}

	}
}
/*
    *
   **
  * *
 *  *
*****
*/