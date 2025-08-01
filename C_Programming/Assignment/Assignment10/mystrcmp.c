#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char*);
void main(){
   char str[]="Mansi";
   char str1[]="Manu";

    int res=mystrcmp(str,str1);
    printf("%d",res);
}

int mystrcmp(char* str,char*str1)
{
    int flag;
for(int i=0;str[i]!='\0';i++)
    {
       if(str[i]==str1[i])
       {
         flag=0;
       }
       else
       return 1;//not equal
    }
    return flag;
}

//output:1