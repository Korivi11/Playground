#include <iostream>
#include<math.h>
using namespace std;

int main()
{
   int n,sum=0,x=0;
   cin>>n;
  while(n!=0)
  {
    int temp=n%10;
     if(temp==1)
       sum=sum+pow(2,x);
    x++;
    n=n/10;
  }
  int a[30],i=0;
  while(sum!=0)
  {
      a[i]=sum%8;
      i++;
      sum=sum/8;
  }
  for(int j=i-1;j>=0;j--)
  {

      cout<<a[j];
  }
}
