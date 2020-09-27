#include <iostream>
using namespace std;

int main() 
{
   int n1,n2,min,gcd;
  cin>>n1>>n2;
  min = (n1<n2)?n1:n2;
  for(int i=1;i<=min;i++)
  {
    if(n1%i==0 && n2%i==0)
    {
      gcd=i;
    }
  }
  cout<<gcd;
}