#include<stdio.h>
void main()
{
    int marks;
    printf("Enter the marks:");
    scanf("%d",&marks);
    if(marks>75)
    {
        printf("Distinction pass");
    }
    else if(marks>65)
    {
        printf("First Class pass");
    }
    else if(marks>55)
    {
        printf("Second class pass");
    }
    else if(marks>40)
    {
        printf("Pass class");
    }
    else if(marks<40)
    {
        printf("fail");
    }
    else
    {
       printf("Enter the valid  marks");
    }
}

//output:Enter the marks:78
//Distinction pass
// Enter the marks:34
// fail