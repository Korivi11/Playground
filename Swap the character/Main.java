#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
    char a[100],b[100],c[100];
    cin>>a>>b>>c;
    for(int i=0;i<strlen(a);i++){
      if(a[i] == 'a'||a[i] =='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i] == 'A'||a[i] =='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
        a[i]='$';
      }
    }
   for(int i=0;i<strlen(b);i++){
      if(b[i]=='a'|| b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'|| b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
      {
            continue;
      }
     else{
       b[i]='#';
     }
    }
   for(int i=0;i<strlen(c);i++){
     if(c[i]>='a'&&c[i]<='z')
        c[i]= c[i]-32;
   }
   int x=strlen(a)+strlen(b)+strlen(c);
  for(int i=0;i<strlen(a);i++){
      cout<<a[i];
  }
   for(int i=0;i<strlen(b);i++){
      cout<<b[i];
  }
   for(int i=0;i<strlen(c);i++){
       cout<<c[i] ;
  }
  
   return 0;
}