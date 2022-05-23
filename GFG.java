import java.util.*;
public class GFG
{
	static void checkSymmetric(int mat[][],int row,int col)
	{
		int i,j,flag=1;
		System.out.println("the matrix formed is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}
		int[][]transpose=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				transpose[j][i]=mat[i][j];
			}
		}
		if(row==col)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					if(mat[i][j]!=transpose[i][j])
					{
						flag=0;
						break;
					}
				}
				if(flag==0)
				{
					System.out.print("\n the matrix is not symmetric");
					break;
				}
			}
			if(flag==1)
			{
				System.out.print("\n the matrix is symmertic");
			}
		}
		else
		{
			System.out.print("\n the matrix is not symmetric");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,j,row,col,flag=1;
		System.out.print("enter the no of rows:");
		row=s.nextInt();
		System.out.print("enter the no of cols");
		col=s.nextInt();
		int[][]mat=new int[row][col];
		System.out.println("enter the matrix elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		checkSymmetric(mat,row,col);
	}
}

D:\lincy>java GFG
enter the no of rows:2
enter the no of cols2
enter the matrix elements
1
4
6
7
the matrix formed is:
1       4
6       7

 the matrix is symmertic
D:\lincy>java GFG
enter the no of rows:3
enter the no of cols3
enter the matrix elements
1
2
3
4
5
6
7
8
9
the matrix formed is:
1       2       3
4       5       6
7       8       9

 the matrix is symmertic
