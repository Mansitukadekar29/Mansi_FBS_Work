#include <stdio.h>
void Prime(int*);
void main()
{
    int a[6];
    printf("Enter the numbers:");
    for(int i=0;i<6;i++) 
    {
        scanf("%d", &a[i]);
    }
    Prime(a);

    
}
void Prime(int a[])
{
    for(int i=0;i<6;i++) 
    {
        int num=a[i];
        int flag=0;
        if(num<2) 
        {
            flag=1;
        } 
        else
        {

            for(int j=2;j<num;j++)
             {
                if(num%j==0)
                 {
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0) 
        {
            //printf("The prime number is:%d\n",num);
            printf("%d ",num);
        }
    }

}

//output:Enter the numbers:3 4 5 6 7 8 9
//3 5 7
