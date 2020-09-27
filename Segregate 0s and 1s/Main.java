#include<iostream>
using namespace std;
    int main()
    {
     int n,a[10],count1=0,count2=0;
     cin>>n;
      for(int i=0;i<n;i++)
      {
        cin>>a[i];
          if(a[i]==0)
          {
            count1++;
          }
        else
        {
          count2++;
        }
      }
    while(count1--)
    {
      cout<<'0'<<" ";
    }
    while(count2--)
    {
      cout<<'1'<<" ";
    }
     
 }