#include <iostream>
using namespace std;

int main() 
{
  int n,sum=0;
  cin>>n;
  int temp=n;
  while(n!=0)
  {
    int fac=1;
    int in=n%10;
    for(int i=2;i<=in;i++)
    {
      fac=fac*i;
    }
    sum=sum+fac;
    n=n/10;
  }
  if(sum==temp)
    cout<<"Yes";
   else
     cout<<"No";
 }