#include <iostream>
using namespace std;
int gcd(int a,int b)
{ 
   int r,min;
  if(a<b){
    min=a;
  }
  else
  {
    min=b;
  }
  for(int i=1;i<=min;i++)
  {
    if(a%i==0 && b%i==0){
       r=i;
    }
  }
  return r;
}
int main() 
{
   int n,a[30];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int r=a[0];
  for(int i=1;i<n;i++)
  {
    r=gcd(r,a[i]);
  }
 cout<<r;
return 0;
}                 