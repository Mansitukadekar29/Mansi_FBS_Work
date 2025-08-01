#include<stdio.h>
void main()
{
    printf("%s\n",__func__);//main
    printf("%s\n",__FILE__);//fileName//C:\FirstBitSolution\POC\inbuiltmacros.c
    printf("%d\n",__LINE__);//6
    printf("Date: %s\n", __DATE__);//Date: May 28 2025
    printf("Time: %s\n", __TIME__);//Time: 17:17:52

    #ifdef __STDC__
    printf("ANSI C compiler\n");
    #endif//ANSI C compiler
    


}
