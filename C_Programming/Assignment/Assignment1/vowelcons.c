#include<stdio.h>
void main()
{
    char A;
    printf("Enter the alpha:");
    scanf("%c",&A);
   
    if( A=='a'|| A=='e' ||A=='i' ||A=='o' ||A=='u' ||A=='A' ||A=='E' ||A=='I' ||A=='O' ||A=='U')
    {
        printf("The alpha is vowel");

    }
    else if(A>='a' && A<='z')
    {
        printf("The alpha is consonent");
    }
    else{
        printf("It is not alphabet");
    }
}


//output:Enter the alpha:a
//The alpha is vowel
// Enter the alpha:y
// The alpha is consonent