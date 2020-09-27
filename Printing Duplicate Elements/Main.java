#include <iostream>
using namespace std;

int main() 
{
   int n,mark[30];
  cin>>n;
  int a[30];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int i=0,k=0;
  while(i<n)
  {
    for(int j=0;j<n;j++)
    {
      if(i==j)
        continue;
      else if(a[i]==a[j]){
          mark[k]=a[i];
          a[i]=0;
          k++;
      }
    }
  i++;
  }

for(int i=0;i<k;i++)
{
  cout<<mark[i]<<" ";
}
}