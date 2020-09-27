#include <iostream>
#include<stdio.h>

using namespace std;

int main() 
{
   int n;
  cin>>n;
  float i= 0.00;
  while(i*i<=n)
  {
    i=i+0.001;
  }
  i=i-0.001;
  printf("%0.2f",i);
}