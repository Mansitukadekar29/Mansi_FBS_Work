#include<stdio.h>
void main()
{
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    (num%3==0)?(num%5==0)? printf("Divisible by both"):printf("Divisible by 3 but not by 5"):(num%5==0)? printf("Divisible by 5 but not by 3"):printf("Divisible by none");
}

//output:Enter the number:6
//Divisible by 3 but not by 5
// Enter the number:25
// Divisible by 5 but not by 3
// Enter the number:79
// Divisible by none
// Enter the number:15
// Divisible by both