//Write a C program to convert given minutes into hours and remaining minutes.
#include<stdio.h>
void main()
{
    int tmin=100,hr,min;
    hr=tmin/60;
    printf("print the total hr:%d",hr);
    min=tmin%60; //% use for the remaining min
    printf("\n print the remaining min:%d",min);
    
}

//Output:print the total hr:1 print the remaining min:40
