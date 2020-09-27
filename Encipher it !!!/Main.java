#include <iostream>
using namespace std;

int main() 
{
   char s;
  cin>>s;
  int n,anum=(int)s;
  cin>>n;
  if(97<=anum&&anum<=122)
  {
    char r=(((s-97)+n)%26);
    r=r+97;
    cout<<r;
  }
  if(65<=anum&&anum<=96)
   {
    char r=(((s-65)+n)%26);
    r=r+65;
    cout<<r;
  }
}