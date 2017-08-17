package test;
import java.util.*;
public class test89work2
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3}, {4,5,6}};
        int sum = 0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
              sum += a[i][j];
        }
        System.out.println("sum(a) = "+sum);

	}
}