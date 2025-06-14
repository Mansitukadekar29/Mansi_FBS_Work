#include <stdio.h>

void main() {
    int start, end, sum = 0, current;
    printf("Enter the start of the range: ");
    scanf("%d", &start);
    printf("Enter the end of the range: ");
    scanf("%d", &end);
    current = start;
    while (current <= end) {
        sum =sum+ current;  
        current++;      
    }
    printf("Sum of numbers from %d to %d is: %d\n", start, end, sum);

    
}

//output:Enter the start of the range: 2
//Enter the end of the range: 45
//Sum of numbers from 2 to 45 is: 1034