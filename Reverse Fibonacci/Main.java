#include <iostream>
using namespace std;
void revfib(int *arr,int n)
{
  arr[0]=0;
  arr[1]=1;
  for(int i=2;i<n;i++)
  {
    arr[i]=arr[i-2]+arr[i-1];
  }
  for(int i=n-1;i>=0;i--)
  {
    cout<<arr[i]<<" " ;
  }
}
int main() 
{
  int n,arr[100];
  cin>>n;
  revfib(arr,n);
  return 0;
}