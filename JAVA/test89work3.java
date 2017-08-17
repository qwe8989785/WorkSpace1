package test;
import java.util.*;
public class test89work3
{
	public static void main(String[] args) 
	{
		double score[][] = {{85,78,65,0},
                			{75,85,69,0},
            				{63,67,95,0},
                			{94,92,88,0},
                			{74,65,73,0}};

		System.out.println("計概\t數學\t英文\t平均");
		System.out.println("==============================");
		for(int i=0;i<5;i++)
		{
			score[i][3] = (score[i][0]+score[i][1]+score[i][2])/3;
			for(int j=0;j<4;j++)
				System.out.print(score[i][j] + "\t");
			System.out.println();
		}  
	}
}