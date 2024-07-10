#include<stdio.h>
int fib(int x);
void main(){
    int a,s=0,i;
    printf("Enter the value of number of terms");
    scanf("%d",&a);
    for(i=0;i<a;i++){
        s=fib(i);
        printf("%d\n",s);
    }
    printf("The value of sum is:%d",s);
}
int fib(int x){
    int S;
    if(x==0)
    return 0;
    else if(x==1)
    return 1;
    else
    return fib(x-1)+fib(x-2);
}