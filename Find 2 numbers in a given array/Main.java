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
  int x,b,index1=-1,index2=-1;
  cin>>x>>b;
  for(int i=0;i<n;i++)
  {
    if(x==a[i])
    {
      index1=i;
      break;
    }
  }
  for(int i=0;i<n;i++)
  {
    if(b==a[i])
    {
      index2=i;
      break;
    }
  }
  cout<<"Element 1 index = "<<index1<<"\n";
  cout<<"Element 2 index = "<<index2;
}