#include <iostream>
using namespace std;

int main() 
{
   int n,res=0;
   cin>>n;
  int temp= n;
  while(n!=0)
  {
    int temp = n%10;
    res=(res*10)+temp;
    n=n/10;
  }
 if(temp==res)
   cout<<"Palindrome";
 else
   cout<<"Not a Palindrome";
}