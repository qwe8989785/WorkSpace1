package test;
import java.util.*;
public class test88work3
{
	public static void main(String[] args) 
	{
		char x ='a';
        //���׬O�L
        //���OZ�]���OX
        switch (x)
        {
            case 'z' : System.out.println("�OZ");break;
            case 'x' :
                System.out.println("�OX");
                break;
            case 'a' :
            	System.out.println("It's A");
            	break;
            default:
                System.out.println("���OZ�]���OX");
                break;
        }
        System.out.println("-------------------------");
        int y = 5;
        //���׬O�L
        //�O3
        switch(y)
        {
            case 5 : System.out.println("�O5");break;
            case 3 : System.out.println("�O3");break;
        }
        System.out.println("-------------------------");
        int z = 5;
        //���׬O�L
        //�O5
        //�O3
        switch(z)
        {
            case 6 : System.out.println("�O6");
            case 5 : System.out.println("�O5");
            case 3 : System.out.println("�O3");
        }

	}
}