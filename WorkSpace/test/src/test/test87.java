package test;
import java.util.*;
public class test87 
{
	public static void main(String[] args) 
	{
		int OnePrice,Qty;
		double TotalPrice;
		System.out.print("每場入場券價格?: ");
		Scanner scan1 = new Scanner(System.in);
		OnePrice = scan1.nextInt();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.print("您購買的張數為?: ");
		Scanner scan2 = new Scanner(System.in);
		Qty = scan2.nextInt();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		if(Qty>=10)
		{
			System.out.println("您購買超過十張打九折");
			TotalPrice = (OnePrice*Qty)*0.9;
		}
		else
		{
			System.out.println("您購買未滿十張打九五折");
			TotalPrice = (OnePrice*Qty)*0.95;
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("您的總價為"+TotalPrice);
	}
}
