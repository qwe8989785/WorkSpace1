package test;
import java.util.*;
public class test88work1
{
	public static void main(String[] args) 
	{
		int price,money,dif,coin50=0,coin10=0,coin5=0,coin1=0;
	       
		//price= 購票金額，money= 投入金額
		Scanner scan1= new Scanner(System.in);
		       Scanner scan2= new Scanner(System.in);
		       
		       do
		       {
		        System.out.print("請輸入購票金額:");
		       //price=Integer.parseInt(console.readLine());
		        price = scan1.nextInt();

		        }while(price<=0);
		 
		       do
		       {
		        System.out.print("請輸入投入金額:");
		        //money=Integer.parseInt(console.readLine());
		        money = scan2.nextInt();
		       }while((money%100!=0)||(money<price));
		       
		       dif=money-price;
		 
		       while(dif>=50)
		       {
		         coin50++;
		         dif=dif-50;
		       }
		 
		       while(dif>=10)
		       {
		         coin10++;
		         dif=dif-10;
		       }
		 
		       while(dif>=5)
		       {
		         coin5++;
		         dif=dif-5;
		       }
		 
		       while(dif>=1)
		       {
		         coin1++;
		         dif=dif-1;
		       }
		        System.out.println("找零50元硬幣共" + coin50 +"個,10元硬幣共" +coin10 + "個,5元硬幣共" +coin5 + "個,1元硬幣共"+ coin1+"個");
		    

	}
}