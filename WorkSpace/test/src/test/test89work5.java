package test;
import java.io.Console;
import java.util.*;
public class test89work5
{
	public static void main(String[] args) 
	{
		int score[][]={{85,78,65},
                {75},
                {63,95},
                {94,92,88}};
		int ary[];
		ary=score[3].clone();
		for(int i=0;i<ary.length;i++)
		System.out.print(ary[i] + "\t");
		
	}
}