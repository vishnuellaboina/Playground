#include<stdio.h>
#include<string.h>

int getarraysum(int *arr,int len)
{
 
    int sum = 0,i;
    for(i=0;i<len;i=i+1)
    {
        sum += arr[i];
    }

    return sum;
  
}


int main() 
{ 
  int a;   
  scanf("%d",&a);       
  int arr[a];
  for(int i=0;i<a;i++){
      scanf("%d",&arr[i]);
  }
  printf("%d",getarraysum(arr,a));
}
