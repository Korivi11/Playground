#include <iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

int main() 
{
   char a[100];
   scanf("%[^\n]c",a);
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
    {
      a[i]='0';
    }
  }
  for(int i=0;i<strlen(a);i++){
    if(a[i]!='0'){
      cout<<a[i];
    }
  }
}