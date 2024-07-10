#include <stdio.h>
void main()
{
    int i, item, flag = 0, n, a[100];
    printf("enter the number of elements in the array");
    scanf("%d", &n);
    printf("Enter the element");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter the Element to Be searched");
    scanf("%d", &item);
    for (i = 0; i < n; i++)
    {
        if (item == a[i])
        {
            flag = flag + 1;
            break;
        }
    }
    if (flag == 1)
    {
        printf("The element %d is exist at position %d", n, i + 1);
    }else{
        printf("not found");
    }
}