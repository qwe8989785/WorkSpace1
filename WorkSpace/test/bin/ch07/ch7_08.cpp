/*   �ɦW:ch7_08.cpp   �\��:�ǰѦҩI�s   */

#include <iostream>
#include <stdlib.h>
using namespace std;

class CVector2                      //�G���V�q���O
{
  public: int x,y;               //�G���V�q���ⶵ�������
  public: void set(int m,int n)  //�Ω�]�w�G���V�q���ⶵ�������
  {          
        x=m;
        y=n;      
  }
};

class CMyClass
{
    public: void swap(CVector2 &a,CVector2 &b)  //�����禡,�ǰѦҩI�s
    {
        CVector2 temp;
        temp=a;
        a=b;
        b=temp;
    }
};

int main(char args[])
{
   CVector2 i;
   i.set(20,40);
   CVector2 j;
   j.set(15,45);
   cout << "-----��l------" << endl;      //�C�L
   cout << "Vector i=(" << i.x << "," << i.y << ")" << endl;
   cout << "Vector j=(" << j.x << "," << j.y << ")" << endl;
   CMyClass X;
   X.swap(i,j);   //����i,j
   cout << "-----swap��-------" << endl;   //�C�L
   cout << "Vector i=(" << i.x << "," << i.y << ")" << endl;
   cout << "Vector j=(" << j.x << "," << j.y << ")" << endl;
   //system("pause");
   return 0;
}


