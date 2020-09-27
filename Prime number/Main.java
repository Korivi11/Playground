#include <iostream>
#include<math.h>
#include<stdio.h>
using namespace std;

int main() 
{
  int n,count;
  float res=0.000000;
  cin>>n;
    for(int i=1;i<=n;i++){
      if(n%i==0)
      {
        count++;
      }
    }
  if(count==2)
  {
    res=sqrt(n);
    printf("%0.2f",res);
  }
  else
    printf("%0.2f",res);
    
      
}