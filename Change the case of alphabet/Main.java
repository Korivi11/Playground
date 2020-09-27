#include <iostream>
using namespace std;

int main() 
{
  char s;
  cin>>s;
  int anum=(int)s;
  if(anum>=97)
  {
    s=s-32;
    cout<<s;
  }
  else{
     s=s+32;
     cout<<s;
  }
}