#include<stdio.h>
#include<string.h>
void main()
{
    int size;
    int i=0,count=0;
    char ch[10];
    printf("Enter the string:");
    scanf("%d",&size);
    while(ch[i]!='\0')
    {
    char ch;
    if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
        count++;
    }
    i++;
    }
    if(count>3)
    {
        printf("The string is more than 3 vowels %s",ch);
    }
    else
    {
        printf("The string not available");
    }
}