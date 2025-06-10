#include<stdio.h>
void main()
{
    int price,discount;
    char student;
    printf("Enter the price:\n");
    scanf("%d",&price);
    printf("Are you a student:y,n:\n");
    scanf(" %c",&student);// (" %c") stores the buffer value (space)
    if(student=='y')
    {
        if(price>500)
        {
            discount=0.2*price;
            price=price-discount;
        }
        else
        {
            discount=0.1*price;
            price=price-discount;
        }
        printf("The price is =%d",price);
    }
    else if(student=='n')
    {
        if(price>600)
        {
            discount=0.15*price;
            price=price-discount;
        }
        else
        {
            price=price;
        }
        printf("The price is=%d",price);
    }
    else
    {
        printf("invalid price");
    }
    
}


//output:Enter the price:
// 4000
// Are you a student:y,n:
// y
// The price is =3200