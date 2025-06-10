//Write a C program to input the base and height of a triangle and calculate its area.
#include<stdio.h>
void main()
{
    
    float b,h,a;
    printf("Enter the value of b and h:\n");
    scanf("%f%f",&b,&h);
    
    a=0.5*(b*h);
    printf("The area of triangle is=%2f",a);
    
}

//Output:The perimeter of rectangle is:15