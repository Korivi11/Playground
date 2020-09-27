#include <iostream>
using namespace std;
int lcm(int a,int b)
{
  int r,max;
  if(a>b)
    max=a;
  else
    max=b;
  while(1)
  {
    if(max%a==0 && max%b==0){
      r=max;
      break;
    }
   max++;
  }
  return max;
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
     r=lcm(r,a[i]);
  }
  cout<<r;
}