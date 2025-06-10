//Write a C program to input marks of five subjects, find the total marks, and calculatethe percentage.
#include<stdio.h>
void main()
{
    float s1,s2,s3,s4,s5,per,sum;
    printf("Enter the sub marks:\n");
    scanf("%f%f%f%f%f",&s1,&s2,&s3,&s4,&s5);
    sum=s1+s2+s3+s4+s5;
    per=sum/500*100;
    printf("The percentage of students:%.2f%%",per);
}

//Output:Enter the sub marks:
//90 80 70 60 50
//The percentage of students:70.00%