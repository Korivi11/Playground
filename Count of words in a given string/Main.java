#include <iostream>
#include<string.h>
#include<stdio.h>

using namespace std;

int main() 
{
  char c[100];
  scanf("%[^\n]c",c);
  int i=0,count=0;
  while(c[i]!='\0')
  {
    if(c[i]==' ')
    {
      count++;
    }
    i++;
  }
  cout<<(count+1);
}