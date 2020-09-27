#include <iostream>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  
  if(n%4==0&&n%100==0)
  {
    if(n%400==0)
      {
        cout<<"LEAP YEAR";
      }
     else{
       cout<<"NOT LEAP YEAR";
     }
  }
  else if(n%4==0)
  {
    cout<<"LEAP YEAR";
  }
  else
  {
    cout<<"NOT LEAP YEAR";
  }

}