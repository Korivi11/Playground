#include <iostream>
using namespace std;
void fib(int n)
{
  int a=0,b=1,c;
  if(n==1)
  {
    cout<<a;
  }
  else if(n==2)
  {
    cout<<b;
  }
  else
  {
    for(int i=2;i<n;i++){
      c=a+b;
      a=b;
      b=c;
    }
    cout<<c;
  }
}
int main() 
{
  int n;
  cin>>n;
  fib(n);
}