#include <stdio.h>

 void main() {
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


//output:Enter a number: 2345

// The first digit is:2
// The last digit is:5
// The sum of the first and last digit is: 7