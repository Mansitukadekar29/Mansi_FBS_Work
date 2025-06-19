#include<stdio.h>
void areaofrect(float,float);
void periofrect(float,float);
void main()
{
   float l,b;
   printf("enter length,breadth:");
   scanf("%f%f",&l,&b);

   areaofrect(l,b);
   periofrect(l,b);
}
void areaofrect(float l,float b)
{
   float area=l*b;

   printf("area of rectangle %f:",area);
}

void periofrect(float l,float b)
{
    float peri=2*(l+b);

    printf("\nperimeter of rectangle %f:",peri);
}


//output:enter length,breadth:3 4
// area of rectangle 12.000000:
// perimeter of rectangle 14.000000: