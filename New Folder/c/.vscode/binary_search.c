#include <stdio.h>
void main()
{
    int i, item, flag = 0, n, a[100], l, h, mid;
    printf("enter the number of elements in the array");
    scanf("%d", &n);
    printf("Enter the element");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter the Element to Be searched");
    scanf("%d", &item);
    l = 0;
    h = n - 1;
    mid = (l + h) / 2;
    while (l <= h)
    {
        if (item==a[mid])
        {
            flag++;
            break;
        }
        else if (a[mid] > item)
        {
            h = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
        mid = (l + h) / 2;
    }
    if (flag == 1)
    {
        printf("The element is found");
    }
    else
    {
        printf("The element is not found");
    }
}