#include<stdio.h>
typedef struct Product
{
    int id;
    char name[50];
    int quantity;
    int price;
   
}Product;
void main()
{
Product arr[1];
int i=0;
   printf("Enter the Product id:");
   scanf("%d",&arr[i].id);

  printf("Enter the Product name:");
  scanf("%s",&arr[i].name); 
  
  printf("Enter the Product quantity:");
  scanf("%d",&arr[i].quantity);
  
   printf("Enter the Product price:");
  scanf("%d",&arr[i].price);

 printf("Product deatails are follows:");
  printf("\nid=  %d\n",arr[i].id);
  printf("name= %s\n",arr[i].name);
  printf("quantity= %dml\n",arr[i].quantity);
  printf("price= %d\n",arr[i].price);
  
}


//output:Enter the Product id:101
//Enter the Product name:facewash
//Enter the Product quantity:250
//Enter the Product price:520
//Product deatails are follows:
//id=  101
//name= facewash
//quantity= 250ml
//price= 520