#include<stdio.h>
// void main()
// {
//     int age;
//     if(age=18)
//     {
//         printf("Eligible for driving licence");
    
//     }
//     else
//     {
//         printf("Not eligible for driving licence");
//     }
// }

//output:Eligible for driving licence

// void main()
// {
//     int num;
//     if(num>0)
//     {
//         printf("the num is positive");
//     }
//     else
//     {
//         printf("the num is negative");
//     }
// }

//output:the num is negative

// void main()
// {
//     int num;
//     printf("Enter the no:");
//     scanf("%d",&num);
//     if(num>0)
//     {
//         printf("the num is positive");
//     }
//     else
//     {
//         printf("the num is negative");
//     }
// }

// output:Enter the no:6
// the num is positive

void main()
{
    int year;
    printf("Enter the year:");
    scanf("%d",&year);
    if(year%4==0 && year%100 !=0 || year%400==0)
    {
        printf("The year is leap");
    }
    else
    {
        printf("The year is not leap");
    }
}

//output:Enter the year:2003
// The year is not leap