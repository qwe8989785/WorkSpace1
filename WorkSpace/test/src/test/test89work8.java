package test;
import java.util.*;
public class test89work8
{
	public static void main(String[] args) 
	{
		double i=7.0,j=4.0;
        double powNum,logNum;	
        powNum=Math.pow(i,j);
        System.out.println(i + "��" + j + "����=" + powNum);
        logNum=Math.log10(powNum);
        System.out.println(powNum + "��10�����=" + logNum);
	}
}