package test;
import java.util.*;
public class work87one 
{
	public static void main(String[] args) 
	{
		int x;
		System.out.print("�п�J�A�n�X�ƻ�(1�����Y�A2���ŤM�A3����):");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		switch (x)
		{
			case 1 :
			{
				System.out.println("�q����ܥX��!!");
				System.out.println("�A��F!!");
				break;
			}
			case 2 :
			{
				System.out.println("�q����ܥX���Y!!");
				System.out.println("�A��F!!");
				break;
			}
			case 3 :
			{
				System.out.println("�q����ܥX�ŤM!!");
				System.out.println("�A��F!!");
				break;
			}
			default:
			{
				System.out.println("�O�x�F!!");
				break;
			}
		}
	}
	
}