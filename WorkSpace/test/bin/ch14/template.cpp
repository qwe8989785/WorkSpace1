/********************************
  �ɦW:template.cpp
  �\��:�禡�˪O��   - �x��
 ********************************/

#include <iostream>
#include <stdlib.h>

using namespace std;

class CMyclass
{
   public:
   template <class N> N max(N a,N b)  // N���O�d����ƫ��A
   {      if(a>=b)   return a;   else  return b;    }

};


int main(void)
{
  double a1=0.7,b1=9.3,c1;
  int a2=25,b2=56,c2;

  CMyclass obj1;

  c1=obj1.max(a1,b1);   //�I�s�ɫ��w���T����ƫ��A
  c2=obj1.max(a2,b2);   //�I�s�ɫ��w���T����ƫ��A


  cout << c1<< endl; 
  cout << c2<< endl;   

  system("pause");
  return 0;
}
