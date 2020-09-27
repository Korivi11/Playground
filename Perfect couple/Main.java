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
  int x,count=0;
  cin>>x;
  int i=0;
  while(i<n)
  {
  for(int j=0;j<n;j++)
  {
    if(a[i]+a[j]==x)
    {
      cout<<"Perfect couple: "<<a[i]<<" "<<a[j];
      count=1;
      break;
    }
  }
    i++;
    if(count)
    {
      break;
    }
 }
  if(count==0)
  {
    cout<<"No perfect couple found!";
  }
}
