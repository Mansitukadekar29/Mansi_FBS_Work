#include<stdio.h>
void areacircle();
void areatriangle();
void main()
{
    areacircle();
    areatriangle();
}
void areacircle()
{
    float radius,area;
    printf("\nEnter the radius of circle:");
    scanf("%f",&radius);
     area=3.14*radius*radius;
     printf("The area of circle: %f",area);
}
void areatriangle()
{
    float b,h,a;
    printf("\nEnter the value of b and h:");
    scanf("%f%f",&b,&h);
    
    a=0.5*(b*h);
    printf("The area of triangle is=%2f",a);
}

//output:Enter the radius of circle:2
// The area of circle: 12.560000
// Enter the value of b and h:4 6
// The area of triangle is=12.000000