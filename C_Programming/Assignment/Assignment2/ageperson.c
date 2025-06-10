#include<stdio.h>
 void main()
 {
     int age;
     printf("Enter the age:");
     scanf("%d",&age);
     if(age<12)
     {
         printf("\nChild");
    
     }
     else if(age >= 12 && age <=19 )
     {
         printf("Teenager");
     }
     else if(age >=20 && age <=59)
     {
        printf("Adult");
     }
     else if(age >= 60)
     {
        printf("senior");
     }
     else
     {
        printf("Invalid value");
     }
 }

 //output:Enter the age:15
//Teenager
// Enter the age:56
// Adult