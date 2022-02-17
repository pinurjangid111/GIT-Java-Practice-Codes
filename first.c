#include <stdio.h>
int main(){
  int num,fact;
  scanf("%d",&num);
  fact=1;
  int temp=num;
  while(temp!=0)
  {
      fact=fact*temp;
      temp--;
  }

  printf("Factorial of %d
   is %d",num,fact);
  return 0;
}