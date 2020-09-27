#include <iostream>
using namespace std;

int main() 
{
   int n,a[50],count=0;
  cin>>n;
   while(n!=0)
   {
     a[count]=n%2;
     n=n/2;
     count++;
   }
  for(int i=count-1;i>=0;i--)
  {
    cout<<a[i];
  }
}