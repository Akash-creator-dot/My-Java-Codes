#include<stdio.h>
int sum(int x,int y);
int main(){
    int a,b,s;
    printf("Please enter the value of a and b\n");
    scanf("%d%d",&a,&b);
    s=sum(a,b);
    printf("The value of a and b and the sum is:%d %d %d",&a,&b,s);
}
 int sum(int x, int y){
    int S;
    S=x+y;
    return S;
 }
