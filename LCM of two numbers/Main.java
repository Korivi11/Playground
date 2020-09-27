#include <iostream>
using namespace std;

int main() 
{
   int n1,n2,max,lcm,gcd;
  cin>>n1>>n2;
  if(n1<n2)
    max=n1;
  else
    max=n2;
  for(int i=1;i<=max;i++)
  {
    if(n1%i==0 && n2%i == 0)
    {
       gcd = i;
    }
  }
 lcm = (n1*n2)/gcd;
 cout<<lcm;
}