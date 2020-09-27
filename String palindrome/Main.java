#include <iostream>
#include<string.h>
using namespace std;
int  isPalidrome(char *str)
{
  int n=strlen(str);
  int x=n-1,flag=1;
  for(int i=0;i<=n/2;i++)
  {
    if(str[i]!=str[x])
    {
      flag=0;
      break;
    }
    x--;
  }
 return flag;
}
void print(char *str)
{
  for(int i=0;i<strlen(str);i++)
  {
    cout<<str[i];
  }
}
int main() 
{
  char str[100];int res;
  cin>>str;
  res=isPalidrome(str);
  if(res)
  {
    print(str);
    cout<<" "<<"is a palindrome";
  }
  else
  {
    print(str);
    cout<<" "<<"is not a palindrome";
  }
  return 0;
}