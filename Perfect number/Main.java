#include <iostream>
using namespace std;

int main() 
{ 
  int n,p=1,s=0;
  cin>>n;
for(int i=1;i<n;i++){
  if(n%i==0)
  {
    s=s+i;
  }
}
  if(n==s)
  {
   cout<<"Yes";
  }
 else
 {
   cout<<"No";
 }
}
