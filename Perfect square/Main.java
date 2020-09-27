#include <iostream>
using namespace std;

int main() 
{
   int n,count=0;
  cin>>n;
  for(int i=1;i<n;i++)
  {
    int product = i*i;
    if(product == n){
       count++;
        break;
    }
  }
  if(count)
    cout<<"YES";
  else
    cout<<"NO";
}