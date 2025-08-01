#include<stdio.h>
void mystrcpy(char[],char[]);
void main()
{
   char str1[50]="Mansi Tukadekar";
   char str2[50];
   mystrcpy(str1,str2); 
}
void mystrcpy(char str1[],char str2[])
{
    int i=0;
    while(str1[i]!='\0')
    {
        str2[i]=str1[i];
        i++;

    }
    str2[i]='\0';
    printf("%s",str1);
    printf("\n%s",str2);
}

//output:Mansi Tukadekar
//Mansi Tukadekar