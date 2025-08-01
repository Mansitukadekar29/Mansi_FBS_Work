#include <stdio.h>
#include <string.h>
void reverse(char *str, int start, int end)
 {
    while(start<end) {
        char temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        start++;
        end--;
    }
}

void main() 
{

    char str[]="firstbit Solutions";
    int i=0,start=0;

    while(str[i]!='\0') 
    {
        if(str[i]==' ' || str[i+1]=='\0')
        {
            int end=(str[i]==' ')? i-1:i;//ternary operator
            reverse(str,start,end);
            start=i+1;
        }
            i++;
    }

    printf("%s\n",str);
}