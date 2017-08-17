package test;
import java.util.*;


import java.lang.*;
public class test814work1
{
	public static void main(String args[])
    {
        CCar bus = new CCar();
        CCar truck = new CCar();
        CCar taxi = new CCar();
 
        bus.name="そó";
        bus.wheel=6;
        bus.person=40;
 
        truck.name="ó";
        truck.wheel=8;
        truck.person=3;
  
        taxi.name="璸祘ó";
        taxi.wheel=4;
        taxi.person=5;
        taxi.engine="V16";         //ぃ╬ノ单跑计
  
        System.out.print(bus.name + "Τ" + bus.wheel + "近");
        System.out.println(",更" + bus.person + "");
        System.out.print(truck.name + "Τ" + truck.wheel + "近");
        System.out.println(",更" + truck.person + "");
        System.out.print(taxi.name + "Τ" + taxi.wheel + "近");
        System.out.println(",更" + taxi.person + "");
    } 
	
}
class CCar
{
    public int wheel;
    public int person;
    public String name;
    protected String engine;
}