package test;
import java.util.*;
public class test88work2
{
	public static void main(String[] args) 
	{
		  Scanner scan = new Scanner(System.in);
	      int Credit,Status;  //�H���B��,ú�ڪ��A
	      double Year;        // ���d�~��
	    	
	      System.out.print("�п�J�H���B��:");
	      Credit=scan.nextInt();
	      System.out.print("ú�ڬO�_���`(1:���`,0:�����`):");
	      Status=scan.nextInt();
	      if(Status==1)
	      {
	        System.out.print("�п�J���d�~��:");
	        Year=scan.nextDouble();
	        if(Year>=0.5)
	        {
	          if(Year<1)
	          {
	            System.out.println("�w�ɲ{�����B��"+(Credit*0.05)+"��");
	          }
	          else  //������25�檺if
	          {
	            System.out.println("�w�ɲ{�����B��"+(Credit*0.1)+"��");
	          }
	        }
	        else  //������23�檺if
	        {
	          System.out.println("�w�ɲ{�����B��0��");
	        }
	      }
	      else   //������19�檺if
	      {
	        System.out.println("�w�ɲ{�����B��0��");
	      }
	}
}