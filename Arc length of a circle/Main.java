#include <iostream>
#include<stdio.h>
using namespace std;

int main() 
{
   float radius,angle,length;
   cin>>radius>>angle;
   length = 2*radius*3.14*(angle/360);
   printf("%0.2f",length);
}
