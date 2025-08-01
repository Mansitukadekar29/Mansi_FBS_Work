#include<stdio.h>
void main()
{
    int sage,fage,i;
    printf("Enter the age of father:");
    scanf("%d",&fage);
    printf("Enter the age of son:");
    scanf("%d",&sage);
    
//      for(i=0;fage!=2*sage;i++)
//      {
//      fage++;
//      sage++;
    
//      }

//      printf("After the %d yrs fathers age will be twice of son's age i.e fage=%d and sage=%d",i,fage,sage);
//  }


 //output:Enter the age of father:45
// Enter the age of son:20
// After the 5 yrs fathers age will be twice of son's age i.e fage=50 and sage=25

int countage=0;
while(fage!=2*sage)
{
    fage++;
    sage++;
    countage++;
}
printf("After the %d yrs fathers age will be twice of son's age i.e fage=%d and sage=%d",countage,fage,sage);
}


//output:Enter the age of father:45
// Enter the age of son:20
// After the 5 yrs fathers age will be twice of son's age i.e fage=50 and sage=25
 



