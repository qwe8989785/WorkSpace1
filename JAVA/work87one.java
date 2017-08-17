package test;
import java.util.*;
public class work87one 
{
	public static void main(String[] args) 
	{
		int x;
		System.out.print("請輸入你要出甚麼(1為石頭，2為剪刀，3為布):");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		switch (x)
		{
			case 1 :
			{
				System.out.println("電腦選擇出布!!");
				System.out.println("你輸了!!");
				break;
			}
			case 2 :
			{
				System.out.println("電腦選擇出石頭!!");
				System.out.println("你輸了!!");
				break;
			}
			case 3 :
			{
				System.out.println("電腦選擇出剪刀!!");
				System.out.println("你輸了!!");
				break;
			}
			default:
			{
				System.out.println("別鬧了!!");
				break;
			}
		}
	}
	
}