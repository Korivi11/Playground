#include <iostream>
#include <string.h>
using namespace std;

int main() 
  
{
   char a[20];
   cin>>a;
  int count=1;
  if(strlen(a)<20){
  for(int i=1;i<=strlen(a);i++){
    if(a[i]==a[i-1])
    {
      count++;
    }
    else
    {
      cout<<a[i-1]<<count;
     count=1;
    }
 }
}
 else
    cout<<"Invalid Input";
}