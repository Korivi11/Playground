#include <iostream>
using namespace std;

int main() 
{
   int num,a[30],i=0;
   cin>>num;
   while(num!=0)
   {
     a[i++]=num%8;
     num=num/8;
   }
  for(int j=i-1;j>=0;j--)
  {
    cout<<a[j];
  }
}
