#include <iostream>
using namespace std;

int main() 
{
   int n;
   cin>>n;
  if(n%2==0){
    int a=0;
    int d=2;
   int  term = (n/2)-1;
    cout<<term;
   }
  else{
    int a=0;
    int d=1;
    int term = ((a+(n-1))*d);
    cout<<term;
  }
}