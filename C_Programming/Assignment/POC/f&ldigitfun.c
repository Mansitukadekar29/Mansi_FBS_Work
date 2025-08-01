#include<stdio.h>
 void firstlastdigit();
 void main()
{
    firstlastdigit();
}
void firstlastdigit()
{
    int num,fDigit,lDigit,sum;
    printf("Enter a number: ");
    scanf("%d", &num);

    lDigit = num % 10;
    
    while (num >= 10)
    {
        num=num/ 10;
    }
    fDigit = num;
    sum = fDigit + lDigit;
    printf("\nThe first digit is:%d",fDigit);
    printf("\nThe last digit is:%d",lDigit);
    printf("\nThe sum of the first and last digit is: %d\n", sum);

}


//output:Enter a number: 456

// The first digit is:4
// The last digit is:6
// The sum of the first and last digit is: 10
