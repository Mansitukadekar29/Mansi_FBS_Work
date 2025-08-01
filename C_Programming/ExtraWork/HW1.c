#include<stdio.h>
#include<string.h>
void main()
{
    char str1[]="firstbit solutions";
    int size=sizeof(str1);
    //printf("\n%d",size);
    char str2[size];
     int i=size-2;
     char* res=strchr(str1,' ');
     int spc=res-str1;
     //printf("\n%d",spc);

     while(str1[i]!=' ')
     {
        str2[spc + 1]=str1[i];
        i--;
        spc++;
     }
     str2[i]=' ';
     int j=i-1,k=0;
     while(j>=0)
     {
        str2[k]=str1[j];
        k++,j--;
     }
     str2[size-1]='\0';
     printf("\nreverse sentence is: %s",str2);
}