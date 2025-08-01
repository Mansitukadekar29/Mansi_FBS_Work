#include<stdio.h>
void mystrncat(char*,char*,int);
void main()
{
    char s1[20]="Hello";
    char s2[20]="Mansi";
    int n=2;
    mystrncat(s1,s2,n);
    printf("%s\n",s1);
}
void mystrncat(char* s1,char* s2,int n)
{
    int i=0,j=0;
    while(s1[i]!='\0')
    {
        i++;
    }
    while(j<n && s2[j]!='\0')
{
    s1[i]=s2[j];
    j++;
    i++;
}
s1[i]='\0';
}

//output:HelloMa