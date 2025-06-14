#include<stdio.h>
void main()
{
    int num,rev=0,rem,temp;
    printf("Enter an integer:");
    scanf("%d",&num);
    temp=num;
    while(num!=0)
    {
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
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
//Enter an integer:2345
//2345 is not a palindrome
