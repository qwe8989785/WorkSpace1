package test;
import java.util.*;
public class work87three
{
	public static void main(String[] args) 
	{
		  Scanner scan = new Scanner(System.in);
	      int Score;
	      System.out.print("�п�J�p�����Z:");
	      Score = scan.nextInt();
	      if(Score<60) { System.out.println("���Ƶ��Ŭ��B��"); }
	      else if(Score<=69) { System.out.println("���Ƶ��Ŭ�����"); }
	      else if(Score<=79) { System.out.println("���Ƶ��Ŭ��A��"); }
	      else if(Score<=89) { System.out.println("���Ƶ��Ŭ��ҵ�"); }
	      else if(Score<=99) { System.out.println("���Ƶ��Ŭ��u��"); }
	      else if(Score==100) { System.out.println("��������"); }
	      else { System.out.println("�z��J�F���X�k������"); }
	}
}