#include<stdio.h>
#include<string.h>
void main()
{
    char str[100];
    char ch=' ';
    int i=0;
    printf("Enter the string:");
    gets(str);
    while(str[i]!='\0')
    {
        if(str[i]==ch)
        {
            str[i]='@';
        }
        i++;
    }
    printf("New string=%s",str);
}

//output:Enter the string:M a nsi
//New string=M@a@nsi