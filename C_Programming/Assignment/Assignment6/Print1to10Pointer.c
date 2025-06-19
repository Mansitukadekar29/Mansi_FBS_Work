#include<stdio.h>
void isprint(int* i);
void main()
{
    int i;
    printf("\nEnter the no:") ;
    scanf("%d",&i);
    isprint(&i);
}
void isprint(int* i)
{
    while((*i)<=10)
    {
        printf("\n %d",(*i));
    
    (*i)++;
    }
}

//output:Enter the no:1

//  1
//  2
//  3
//  4
//  5
//  6
//  7
//  8
//  9
//  10