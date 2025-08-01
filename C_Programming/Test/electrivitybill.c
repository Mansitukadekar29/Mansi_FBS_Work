#include<stdio.h>
void main()
{
    int unit,price;
    printf("Enter the unit:");
    scanf("%d",&unit);
    if(unit>=1 && unit<=50){
    price=unit*30;
    printf("\n The electricity bill is :%d",price);
    }
    else if(unit>=51 && unit <=150)
    {
        price=unit*40;
        printf("\n The electricity bill is :%d",price);
    }
    
    else if(unit>=151)
    {
        price=unit*50;
        printf("\n The electricity bill is :%d",price);
    }
    else
    {
        printf("\n Invalid price");
    }
    

}