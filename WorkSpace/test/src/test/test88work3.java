package test;
import java.util.*;
public class test88work3
{
	public static void main(String[] args) 
	{
		char x ='a';
        //答案是印
        //不是Z也不是X
        switch (x)
        {
            case 'z' : System.out.println("是Z");break;
            case 'x' :
                System.out.println("是X");
                break;
            case 'a' :
            	System.out.println("It's A");
            	break;
            default:
                System.out.println("不是Z也不是X");
                break;
        }
        System.out.println("-------------------------");
        int y = 5;
        //答案是印
        //是3
        switch(y)
        {
            case 5 : System.out.println("是5");break;
            case 3 : System.out.println("是3");break;
        }
        System.out.println("-------------------------");
        int z = 5;
        //答案是印
        //是5
        //是3
        switch(z)
        {
            case 6 : System.out.println("是6");
            case 5 : System.out.println("是5");
            case 3 : System.out.println("是3");
        }

	}
}