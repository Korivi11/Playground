#include <iostream>
using namespace std;

int main() 
{
   int n,count=0,a[100];
   cin>>n;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int number;
  cin>>number;
  for(int i=0;i<n;i++)
  {
    if(a[i]==number)
    {
      count=1;
      cout<<i+1;
      break;
    }
  }
  if(count==0)
    {
      cout<<number<<" "<<"isn't present in the array.";
    }
  
}
 