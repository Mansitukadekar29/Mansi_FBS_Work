#include<stdio.h>
void ispalindrome(int* num);
void main()
{
    int num;
    printf("Enter an integer:");
    scanf("%d",&num);
    ispalindrome(&num);
}
void ispalindrome(int* num)
{
    int rev=0,rem,temp;
    temp=(*num);
    while((*num)!=0)
    {
    rem=(*num)%10;
    rev=rev*10+rem;
    (*num)=(*num)/10;
   }
if(temp==rev)
{
    printf("%d is a palindrome",temp);

}
else
{
     printf(" %d is not a palindrome",temp);
}

}

//output:Enter an integer:121
//121 is a palindrome
// Enter an integer:678
//  678 is not a palindrome

