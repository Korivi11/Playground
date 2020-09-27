#include <iostream>
#include<stdio.h>
using namespace std;
void reverse(char *a)
{
  if(*a)
  {
    reverse(a+1);
    cout<<*a;
  }
}
int main() 
{
  char s[100];
  scanf("%[^\n]s",s);
  reverse(s);
  return 0;
}