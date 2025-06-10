#include<stdio.h>
void main()
{
    float basic,tot_sal,da,ta,hra;
    printf("Enter the salary:");
    scanf("%f",&basic);

    if(basic<=5000)
    {
    da=(basic * 10) /100.0;
    ta=(basic * 20) /100.0;
    hra=(basic * 25) /100.0;
    tot_sal=basic+da+ta+hra;
    printf("your total salary is %2f",tot_sal);
    }
    else
    {
        da=(basic * 15) /100.0;
        ta=(basic * 25) /100.0;
        hra=(basic * 30) /100.0;
        tot_sal=basic+da+ta+hra;
        printf("your total salary is %2f",tot_sal);
    }

}


//output:Enter the salary:7000
//your total salary is 11900.000000