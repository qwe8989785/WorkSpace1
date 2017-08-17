package test;
import java.util.*;
public class test89work7
{
	public static void main(String[] args) 
	{
		int a[][][]={  //³]©w2x4x3ªº°}¦C
			     {
			        {15,85,36},
			        {30,14,37},
			        {47,23,96},
			        {19,39,51}
			      },
			      {
			        {22,16,51},
			        {97,30,12},
			        {68,77,26},
			        {57,32,76}
			       }
		      };
		int i,j,k;
		int max=a[0][0][0],min=a[0][0][0];

		for(i=0; i<a.length; i++)
		  for(j=0; j<a[i].length; j++)
		    for(k=0; k<a[i][j].length; k++)
                    {
                       System.out.println("score["+i+"]["+j+"]["+k+"]="+a[i][j][k]);
                       if(max>a[i][j][k])
			 max=a[i][j][k];
			if(min<a[i][j][k])
			 min=a[i][j][k];
		      }
		System.out.println("max= "+max);
		System.out.println("min= "+min);
		
	}
}