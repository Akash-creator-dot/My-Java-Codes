#include <stdio.h>
void main()
{
    int i,j,n,temp,a[100];
    printf("enter the number of elements in the array\n");
    scanf("%d", &n);
    printf("Enter the element\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        } printf("The sorted array is:\n");
        for(int i=0;i<n;i++){
            printf("%d\n",a[i]);
    }
}