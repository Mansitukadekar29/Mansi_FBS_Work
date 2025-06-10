#include<stdio.h>
void main()
{
    int num,r1,r2,r3,q1,res;
    printf("Enter the no:");
    scanf("%d",&num);
    r1=num%10;//121
    q1=num/10;
    r2=q1%10;
    r3=q1/10;
    
    res=r1*100+r2*10+r3;
    if(num==res)
    {
        printf("The no. is palindrome");
    }
    else
    {
        printf("The no. is not palindrome");
    }

}

//Output:Enter the no:234
// The no. is not Palindrome
// Enter the no:121
// The no. is palindrome