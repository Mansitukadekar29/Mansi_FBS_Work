#include<stdio.h>
void ispersonage(int* age);
void main()
{
    int age;
    printf("Enter the age:");
    scanf("%d",&age);
    ispersonage(&age);
}

void ispersonage(int* age)
{
    
   if((*age) >= 18)
    {
       printf("Eligible for votting");
   
    }
    else
    {
        printf("Not eligible for votting");
    } 
}

//output:Enter the age:34
//Eligible for votting