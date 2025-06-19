#include <stdio.h>
 void isFLdigit(int* num);
 void main()
  {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    isFLdigit(&num);
  }
  void isFLdigit(int* num)
  {
    int fDigit,lDigit,sum;

    lDigit = (*num) % 10;
    
    while ((*num) >= 10)
    {
        (*num)=(*num)/ 10;
    }
    fDigit = (*num);
    sum = fDigit + lDigit;
    printf("The first digit is:%d",fDigit);
    printf("\nThe last digit is:%d",lDigit);
    printf("\nThe sum of the first and last digit is: %d\n", sum);

}

//output:Enter a number: 2345
// The first digit is:2
// The last digit is:5
// The sum of the first and last digit is: 7




