package test;
import java.util.*;
public class test87 
{
	public static void main(String[] args) 
	{
		int OnePrice,Qty;
		double TotalPrice;
		System.out.print("�C���J�������?: ");
		Scanner scan1 = new Scanner(System.in);
		OnePrice = scan1.nextInt();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.print("�z�ʶR���i�Ƭ�?: ");
		Scanner scan2 = new Scanner(System.in);
		Qty = scan2.nextInt();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		if(Qty>=10)
		{
			System.out.println("�z�ʶR�W�L�Q�i���E��");
			TotalPrice = (OnePrice*Qty)*0.9;
		}
		else
		{
			System.out.println("�z�ʶR�����Q�i���E����");
			TotalPrice = (OnePrice*Qty)*0.95;
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("�z���`����"+TotalPrice);
	}
}
