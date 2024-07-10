#include<stdio.h>
int main(){
    int a[10][10],b[10][10],c[10][10],i,j,k,n,m;
    //The number of columns in first matrix will must be equal to the number of rows in second
    printf("Please enter the number of rows\n");
    scanf("%d",&n);
    printf("Please enter the number of columns of first matrix\n");
    scanf("%d",&m);
    printf("Please enter the number of columns of first matrix\n");
    scanf("%d",&p);
    printf("Please enter the matrix 1\n");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("Please enter the matrix 2\n");
     for(i=0;i<n;i++){
        for(j=0;j<p;j++){
        scanf("%d",&b[i][j]);
        }
    }
     for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            c[i][j]=0;
           for(k=0;k<p;k++){
            c[i][j] += a[i][k]*b[k][j];
           }printf("\n");
        }
    }
    printf("Your matrix is:\n");
         for(i=0;i<n;i++){
        for(j=0;j<p;j++){
            printf("%d ",c[i][j]);
    }printf("\n");
    }
}