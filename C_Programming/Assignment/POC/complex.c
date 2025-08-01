#include<stdio.h>
#include<string.h>
struct Complex
{
	int real;
	int img;
};
struct Complex addComplex(struct Complex ,struct Complex);
void display(struct Complex);
void main()
{
	struct Complex c1,c2,c3;
	c1.real=11;
	c1.img=22;
	display(c1);
	
	c2.real=33;
	c2.img=44;
	display(c2);

	c3=addComplex(c1,c2);
	display(c3);
}
struct Complex addComplex(struct Complex c1,struct Complex c2)
{
	struct Complex temp;
	
	temp.real=	c1.real+c2.real;
	temp.img=c1.img+c2.img;
	
	return temp;
}

void display(struct Complex c)
{
	printf("\n %d + %di",c.real,c.img);//i use for the imaginary
}


//output:11 + 22i
//  33 + 44i
//  44 + 66i