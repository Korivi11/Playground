#include <iostream>
#include<string.h>
#include<math.h>
using namespace std;

int main() 
{
  char s[100];
  cin>>s;
  int n=strlen(s);
  int k=0,sum=0;
  for(int i=n-1;i>=0;i--){
    
    if(s[i]=='1'){
      sum=sum+(pow(2,k));
    }
    k++;
    }
  cout<<sum;
}