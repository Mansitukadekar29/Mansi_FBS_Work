#include<stdio.h>
void main()
{
    int s1,s2,s3;
    printf("Enter the side:");
    scanf("%d %d %d" ,&s1,&s2,&s3);
    if(s1==s2 && s2==s3)
    {
        printf("Equilateral triangle");
    }
    else if(s1==s2 || s2==s3 || s1==s3)
    {
        printf("Isoscales triangle");
    }
    else{
        printf("scalene triangle");
    }

}

//output:Enter the side:23
//23
//45
//Isoscales triangle
// Enter the side:5 
// 7
// 9
// scalene triangle
// Enter the side:6
// 6
// 6
// Equilateral triangle