#include <iostream>
using namespace std;

int main() 
{
   int n,term1=1,term2=2,term3=0,res;
   cin>>n;
  if(n==1)
  {
    cout<<term1;
  }
  else if(n==2)
  {
    cout<<term2;
  }
   else if(n<31)
   {
   for(int i=1;i<n-1;i++)
   {
     term3=term1+term2;
     term1=term2;
     term2=term3;
   }
  cout<<term3;
   }
  else
    cout<<"Invalid Input";
}
