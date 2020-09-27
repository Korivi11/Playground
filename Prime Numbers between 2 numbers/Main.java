#include <iostream>
using namespace std;

int main() 
{
   int n,count=0;
  cin>>n;
  for(int i=2;i<=n;i++)
  { 
    int j=1;
    while(j<=i)
    {
      if(i%j==0)
      {
        count++;
      }
      j++;
    }
    if(count==2)
    {
      cout<<i<<" ";
    }
    count=0;
  }
}