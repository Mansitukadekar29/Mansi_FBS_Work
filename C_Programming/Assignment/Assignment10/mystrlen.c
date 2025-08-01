#include<stdio.h>
int mystrlen(char*);
void main()
{
	char str[]="Mansi";
	char str1[]="Tukadekar";
	
	int len1=mystrlen(str);
	int len2=mystrlen(str1);
	printf("The length of '%s' is %d",str,len1);
	printf("\nThe length of '%s' is %d",str1,len2);
}
int mystrlen(char* str)
{
	int length=0;
	while(str[length]!='\0')
	{
		length++;
	}
	return length;
}

//output:The length of 'Mansi' is 5
//The length of 'Tukadekar' is 9