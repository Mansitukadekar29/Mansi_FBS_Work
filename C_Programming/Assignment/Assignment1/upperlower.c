#include<stdio.h>
void main()
{
    char ch;
    printf("Enter the value:");
    scanf("%c",&ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'|| ch=='E'|| ch=='I' || ch=='O' ||ch=='U')
    {
        printf("The alphabet is vowel");
    }
    else
    {
        printf("The alphabet is consonent");
    }
   
    if(ch>=97 && ch<=122)
    {
        ch=ch-32;
        printf("\n%c",ch);
       printf("\n The character converted into uppercase");

    }
    else if(ch>=65 && ch<=90)
    {
        ch=ch+32;
        printf("\n%c",ch);
        printf("\n The character converted into lowercase");
    }
    else if(ch>='0' && ch<='9')
    {
       printf("the no is digit");
    }
    else{
        printf("It is special character");
    }
}

//output:Enter the value:y
// The alphabet is consonent
// Y
//  The character converted into uppercase
// Enter the value:H
// The alphabet is consonent
// h
//  The character converted into lowercase