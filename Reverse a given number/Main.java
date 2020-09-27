#include <iostream>
using namespace std;

int main() 
{
   int n,res;
  cin>>n;
  while(n!=0)
  {
    int temp=n%10;
    res=(res*10)+temp;
    n=n/10;
  }
  cout<<res;
}