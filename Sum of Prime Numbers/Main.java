#include <iostream>
using namespace std;

int main() 
{
  int n1, n2,sum=0;
  cin>>n1>>n2;
   for(int i=n1+1;i<n2;i++)
   {
     int count=0;
     for(int j=1;j<=i;j++)
     {
       if(i%j==0)
       {
         count++;
       }
     }
     if(count==2)
     {
       sum=sum+i;
     }
   }
  cout<<sum;
 return 0;
}
         
