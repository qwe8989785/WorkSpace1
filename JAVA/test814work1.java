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
 
        bus.name="����";
        bus.wheel=6;
        bus.person=40;
 
        truck.name="�d��";
        truck.wheel=8;
        truck.person=3;
  
        taxi.name="�p�{��";
        taxi.wheel=4;
        taxi.person=5;
        taxi.engine="V16";         //���i�s���p�ε��Ū��ܼ�
  
        System.out.print(bus.name + "��" + bus.wheel + "�ӽ��l");
        System.out.println(",�i��" + bus.person + "�H");
        System.out.print(truck.name + "��" + truck.wheel + "�ӽ��l");
        System.out.println(",�i��" + truck.person + "�H");
        System.out.print(taxi.name + "��" + taxi.wheel + "�ӽ��l");
        System.out.println(",�i��" + taxi.person + "�H");
    } 
	
}
class CCar
{
    public int wheel;
    public int person;
    public String name;
    protected String engine;
}