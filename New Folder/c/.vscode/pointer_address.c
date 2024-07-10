#include<stdio.h>
void main(){
    int a=30;
    int *p=&a; 
    printf("%d\n",*p+1);
     printf("%d\n",p);
     printf("%u\n",p);
     printf("%d\n",&p);
     printf("%d\n",*(&p));
}