#include <iostream>
using namespace std;

int main() 
{
   int n,a[100][100],b[100][100];
  cin>>n;
  while(n--)
  {
    int x,y;
    cin>>x>>y;
    for(int i=0;i<x;i++)
      for(int j=0;j<y;j++)
        cin>>a[i][j];
    for(int i=0;i<x;i++)
      for(int j=0;j<y;j++)
        cin>>b[i][j];
   
     for(int i=0;i<x;i++)
      for(int j=0;j<y;j++)
          a[i][j]=a[i][j]+b[i][j];
    
   for(int i=0;i<x;i++)
      for(int j=0;j<y;j++)
            cout<<a[i][j]<<" ";
}
}