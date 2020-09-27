#include<iostream>

using namespace std;

int main(){
  long long n,result=1;
  cin>>n;
  if(n>0)
  {
  for(int i=1;i<=n;i++){
    result= result*i;
  }
  cout<<result;
  }
}