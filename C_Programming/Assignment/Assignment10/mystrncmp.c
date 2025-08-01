#include<stdio.h>
int mystrncmp(char*,char*,int);
void main()
{
    char s1[]="Hello";
    char s2[]="Heyyyyy";
    int n;
    printf("Enter the limit:");
    scanf("%d",&n);
    int res=mystrncmp(s1,s2,n);
    if(res==0)
    {
        printf("Equal string");
    }
    else
    {
        printf("Not Equal string");
    }
}
int mystrncmp(char* s1,char* s2,int n)
{
    int i=0;
    while(i<n)
    {
        if(s1[i]!=s2[i])
        {
            return 1;
        }
        if(s1[i]=='\0'|| s2[i]=='0')
        {
            break;
        }
        i++;
    }
    return 0;
}

//output:Enter the limit:0
//Equal string
// Enter the limit:5
// Not Equal string
