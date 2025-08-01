#include<stdio.h>
void main()
{
    float s1,s2,s3,s4,s5,per,sum;
    printf("Enter the sub marks:\n");
    scanf("%f%f%f%f%f",&s1,&s2,&s3,&s4,&s5);
    sum=s1+s2+s3+s4+s5;
    per=sum/500*100;
    printf("The percentage of students:%.2f%%",per);
}

//Output:Enter the sub marks:
//90 80 70 60 50
//The percentage of students:70.00%



// #include<stdio.h>
// void main()
// {
//     int math=100,sci=90,his=85,eng=66,hin=68,tmar,sub=500;

//     tmar=math+sci+his+eng+hin;
//     printf("print the total marks of sub:%d",tmar);
    
//     float per=tmar*100.0/sub;
//     printf("\n the percentage of student:%.2f%%",per);

// }

//Output:print the total marks of sub:409 
// the percentage of student:81.80%