#include<stdio.h>
#include <string.h>
#include<stdlib.h>
typedef struct Book
{
	int Bid;
	char Bname[50];
	char Bauthorname[50];
	int Bprice;
	float Brating;
	char Bcategory[50];
}Book;
void storeBook(Book* ,int );
void displayBook(Book* ,int);
int searchBookById(Book*,int,int);
void displayOne(Book*);
void searchBookByName(Book*,int );
void searchBookByAuthor(Book*,int);
void searchBookByCategory(Book* ,int);
void updateBookPrice(Book*,int);
void updateBookRating(Book*,int);
//void displayBook(Book*);
void removeBook(Book* ,int*);
void sortByPriceHighToLow(Book* ,int);
void sortByPriceLowToHigh(Book* ,int);
void sortByRatingHighToLow(Book* ,int);
void sortByRatingLowToHigh(Book* ,int);


void main()
{
	int size;
	printf("Enter the size:");
	scanf("%d",&size);
	Book Barr[size];//can store books
	int choice;
	
	do
	{
		printf("\n            LIBRARY           ");
		printf("\n**********BOOK MANAGEMENT SYSTEM**********\n");
		printf("1: Add Book\n");
		printf("2: Display All Books \n");
		printf("3: Search by ID \n");
		printf("4: Search by Name \n");
		printf("5: Search by Author \n");
		printf("6: Search by Category \n");
		printf("7: Update Book Price \n");
		printf("8: Update Book Rating \n");
		printf("9: Remove Book \n");
		printf("10: Sort by Price (High to low)\n");
		printf("11: Sort by Price (Low to High)\n");
		printf("12: Sort by Rating (High to Low)\n");
		printf("13: Sort by Rating (Low to High)\n");
		printf("14: Exit\n");
		
		printf("\nEnter your choice>>");
		scanf("%d",&choice);
		
		switch(choice)
		{
			   case 1:
				  printf("\nEnter Book Details:");
	              storeBook(Barr,size);
	              break;
	            
	            case 2:
	            	printf("\nBook Details is as follows: ");
	                displayBook(Barr,size);
	                break;
	            	
				case 3:
					{
					
					int Bid;
	                 printf("\nEnter the Bid user want to search:");
                   	 scanf("%d",&Bid);
	
	                  int index=searchBookById(Barr,size,Bid);
	
	                  if(index==-1)
	                  printf("Book not found");
                   	  else
	                   displayOne(&Barr[index]);
	               }
	                 break;
	               
	            case 4:
	            	searchBookByName(Barr,size);
	            	break;
	            	
	            case 5:
	            	searchBookByAuthor(Barr,size);
	            	break;
	            	
	            case 6:
	            	searchBookByCategory(Barr,size);
	            	break;
	            	
	            case 7:	
	               updateBookPrice(Barr,size);
	               break;
	               
	            case 8: 
	                updateBookRating(Barr,size);
	                break;
	                
	            case 9: 
				    removeBook(Barr,&size);
                    display(Barr,size); 
					break;
					
				case 10:
				    sortByPriceHighToLow(Barr,size);
					break;
					
				case 11:
				   sortByPriceLowToHigh(Barr,size);
				   break;
				   
				case 12: 
				   sortByRatingHighToLow(Barr,size); 
				   break;
				   
				 case 13:
				   sortByRatingLowToHigh(Barr,size);  
				   break;
				   
				  case 14:
				  printf("Exiting program.\n");
				  exit(14);
				  //break;
				  
				  default:
				  printf("Invalid choice.\n");  		 
					
					
	            }
	}
	while(1);
	

}
void storeBook(Book* ptr,int size)
{
	for(int i=0;i<size;i++)
	{
    	printf("\nEnter the id:");
		 scanf("%d",&ptr[i].Bid);
	    	printf("Enter the book name:");
			//scanf("%s",ptr[i].Bname);
			fflush(stdin);
			gets(ptr[i].Bname);
			printf("Enter the Book AuthorName:");
				//scanf("%s",&ptr[i].Bauthorname);
				fflush(stdin);
			   gets(ptr[i].Bauthorname);
				printf("Enter the Book Category:");
				  //scanf("%s",&ptr[i].Bcategory);
				  fflush(stdin);
		     	gets(ptr[i].Bcategory);
				printf("Enter the price of Book:");
					scanf("%d",&ptr[i].Bprice);
					printf("Rating given by user:");
						scanf("%f",&ptr[i].Brating);
	}
}
void displayBook(Book* ptr,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("\nBid=        %d\n",ptr[i].Bid);
		printf("Bname=      %s\n",ptr[i].Bname);
		printf("Bauthorname=%s\n",ptr[i].Bauthorname);
		printf("Bcategory=  %s\n",ptr[i].Bcategory);
		printf("Bprice=    %d\n",ptr[i].Bprice);
		printf("Brating=   %.1f\n",ptr[i].Brating);
	}
	
}

int searchBookById(Book* ptr,int size,int Bid)
{
//	printf("\nEnter the ID you want to search:");
//	scanf("%d",&Bid);
	for(int i=0;i<size;i++)
	{
		if(ptr[i].Bid==Bid) 
		{
			
		return i;
		}
	}
	return -1;
}


void displayOne(Book* s)
{
	printf("\nBid =       %d\n",s->Bid);
	printf("Bname =       %s\n",s->Bname);
	printf("Bauthername = %s\n",s->Bauthorname);
	printf("Bcategory=    %s\n",s->Bcategory);
	printf("Bprice =      %d\n",s->Bprice);
	printf("Brating =     %.1f\n",s->Brating);
}


void searchBookByName(Book* Bname,int size)
{

 char Bsearchname[50] ;
 printf("\nEnter the Book Name user want to search:");
 scanf("%s",Bsearchname);
 //int flag=0;
 for(int i=0;i<size;i++)
 {
 	
 	if(strcmp(Bname[i].Bname,Bsearchname)==0)
 	{
 		printf("\nBook Details:\n");
 		printf("\nBid=      %d\n",Bname[i].Bid);
		printf("Bname=      %s\n",Bname[i].Bname);
		printf("Bauthorname=%s\n",Bname[i].Bauthorname);
		printf("Bcategory=  %s\n",Bname[i].Bcategory);
		printf("Bprice=     %d\n",Bname[i].Bprice);
		printf("Brating=    %.1f\n",Bname[i].Brating);
		//displayOne(&Bname[i]);
//		flag=1;
//		break;
	 }
 }
// if(flag==0)
// printf("Book not found");
}
 
 void searchBookByAuthor(Book* Bauthor,int size)
 {
 	char Bauthorname[50];
 	printf("\nEnter the Book Author Name user want to search:");
 	scanf("%s",Bauthorname);
 	int flag=0;
 	
 	for(int i=0;i<size;i++)
 	{
 		
 	   if(strcmp(Bauthor[i].Bauthorname,Bauthorname)==0)
 	   {
		
		printf("\nBook Details:\n");
 		printf("\nBid=      %d\n",Bauthor[i].Bid);
		printf("Bname=      %s\n",Bauthor[i].Bname);
		printf("Bauthorname=%s\n",Bauthor[i].Bauthorname);
		printf("Bcategory=  %s\n",Bauthor[i].Bcategory);
		printf("Bprice=     %d\n",Bauthor[i].Bprice);
		printf("Brating=    %.1f\n",Bauthor[i].Brating);
		flag=1;	
		//displayOne(&Bauthor[i]);			
		}
   }
 if(flag==0)
 printf("Author not found");
}

void searchBookByCategory(Book* book,int size)
 {
 	char Bcategory[50];
 	printf("\nEnter the Book category Name user want to search:");
 	scanf("%s",Bcategory);
 	int flag=0;
 	for(int i=0;i<size;i++)
 	{
 		
 	   if(strcmp(book[i].Bcategory,Bcategory)==0)
 	   {
		
		printf("\nBook Details:\n");
 		printf("\nBid=      %d\n",book[i].Bid);
		printf("Bname=      %s\n",book[i].Bname);
		printf("Bauthorname=%s\n",book[i].Bauthorname);
		printf("Bcategory=   %s\n",book[i].Bcategory);
		printf("Bprice=     %d\n",book[i].Bprice);
		printf("Brating=    %.1f\n",book[i].Brating);
		flag=1;
		
		//displayOne(&Bcategory[i]);	
		}
   }
   if(flag==0)
   printf("\nCategory not found");
}

void display(Book* book,int size)
{
    for(int i=0;i<size;i++)
	{
		
        printf("\nBook Details:\n");
 		printf("\nBid=      %d\n",book[i].Bid);
		printf("Bname=      %s\n",book[i].Bname);
		printf("Bauthorname=%s\n",book[i].Bauthorname);
		printf("Bcategory=   %s\n",book[i].Bcategory);
		printf("Bprice=     %d\n",book[i].Bprice);
		printf("Brating=    %.1f\n",book[i].Brating);
    }
}


void updateBookPrice(Book* book,int size)
{
      int id;
	 printf("Enter Book id to update price:\n");
     scanf("%d",&id);	
  
  for(int i=0;i<size;i++)
  {
  	if(book[i].Bid==id) 
	  {
	  	displayOne(&book[i]);
            printf("\nEnter new price:");
            scanf("%d",&book[i].Bprice);
            printf("Book price are updated");
            displayOne(&book[i]);
            break;
     }
  }
  
}

void updateBookRating(Book* book,int size)
{
	int id;
	printf("\nEnter Book id to update Rating:\n");
	scanf("%d",&id);
	
	for(int i=0;i<size;i++)
	{
		if(book[i].Bid==id)
		{
			 displayOne(&book[i]);
			printf("\nEnter new rating:");
			scanf("%f",&book[i].Brating);
			printf("Book rating are updated");
			displayOne(&book[i]);
			break;
		}
	}
}


void removeBook(Book* book,int* size)
{
   int Bid;
   printf("\nEnter the Book id you want to remove:");
   scanf("%d",&Bid);
	 
	 for(int i=0;i<(*size);i++)
	 {
//	 	int i;
	 	if(book[i].Bid==Bid)
	 	{

	 		book[i].Bid=book[i+1].Bid;
	 		strcpy(book[i+1].Bname,book[i].Bname);
	 		strcpy(book[i+1].Bauthorname,book[i].Bauthorname);
	 		strcpy(book[i+1].Bcategory,book[i].Bcategory);
	 		book[i].Bprice=book[i+1].Bprice;
	 		book[i].Brating=book[i+1].Brating;
	 		printf("Book with id %d removed succeessfully\n",Bid);
	 			
		}
	 }
	 (*size)--;

}

void sortByPriceHighToLow(Book* ptr,int size)
{
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(ptr[i].Bprice<ptr[j].Bprice)
			{
				Book temp;
				temp=ptr[j];
				ptr[j]=ptr[i];
				ptr[i]=temp;
			}
		}
	}
	printf("Books are sorted by price with the highest to lowest");
	display(ptr,size);
}

void sortByPriceLowToHigh(Book* ptr,int size)
{
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(ptr[i].Bprice>ptr[j].Bprice)
			{
				Book temp;
				temp=ptr[i];
				ptr[i]=ptr[j];
				ptr[j]=temp;
			}
		}
	}
	printf("Books are sorted by price with the lowest to highest");
	display(ptr,size);
}

void sortByRatingHighToLow(Book* ptr,int size)
{
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(ptr[i].Brating<ptr[j].Brating)
			{
				Book temp;
				temp=ptr[j];
				ptr[j]=ptr[i];
				ptr[i]=temp;
			}
		}
	}
	printf("Books are sorted by rating with the highest to lowest");
	display(ptr,size);
}


void sortByRatingLowToHigh(Book* ptr,int size)
{
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(ptr[i].Brating>ptr[j].Brating)
			{
				Book temp;
				temp=ptr[i];
				ptr[i]=ptr[j];
				ptr[j]=temp;
			}
		}
	}
	printf("Books are sorted by rating with the lowest to highest");
	display(ptr,size);
}