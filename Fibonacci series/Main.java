#include <iostream>
using namespace std;
void fib(int n)
{
   int a=0;
  int b=1;
   cout<<a<<" "<<b<<" ";
   for(int i=2;i<n;i++)
   {
     int c=a+b;
      a=b;
      b=c;
     cout<<c<<" ";
   }
}
int main() 
{
  int n;
  cin>>n;
  fib(n);
  return 0;
}