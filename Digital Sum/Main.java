#include <iostream>
using namespace std;
int sum(int n)
{
  int s=0;
  while(n!=0)
  {
    int temp=n%10;
    s=s+temp;
    n=n/10;
  }
 if(s>9)
 {
  s =  sum(s);
 }
  return s;
}
int main() 
{
 long int n;
  cin>>n;
 int digit = sum(n);
  cout<<digit;
 return 0;
}