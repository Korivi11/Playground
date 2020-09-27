#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int a[30];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int i=0;
while(i<n)
{
  for(int j=0;j<n;j++)
  {
    if(i==j)
    {
      continue;
    }
    else if(a[i]==a[j])
    {
      a[i]=0;
      a[j]=0;
    }
  }
  i++;
}
 for(int i=0;i<n;i++)
 {
   if(a[i]==0)
   {
     continue;
   }
   else
     cout<<a[i]<<" ";
 }
   
}