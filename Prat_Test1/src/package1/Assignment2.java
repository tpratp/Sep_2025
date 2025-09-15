package package1;

public class Assignment2

{
	// (((((10+3)+2)*4)-4)/2)
	
	public int sum (int a,int b)
	{
		int c = a+b;
		System.out.println("Addition is : " +c);
		return c;
		}


	public int sub (int a1,int b1)
	{
	int c1 = a1-b1;
	System.out.println("Substraction is :" +c1);
	return c1;
	}


	public int mul (int a2,int b2)
	{
	int c2 = a2*b2;
	System.out.println("Multiplication is :" +c2);
	return c2;
	}


	public int div (int a3,int b3)
	{
	int c3 = a3/b3;
	System.out.println("Division is :" +c3);
	return c3;
	}

	public static void main(String[] args) 
	{
		Assignment1 ass1=new Assignment1();
		int result1 = ass1.sum(10, 3);
		int result2 = ass1.sum(result1, 2);
		int result3 = ass1.mul(result2, 4);
		int result4 = ass1.sub(result3, 4);
		int result5 = ass1.div(result4, 2);
		
		System.out.println("Final Result is : " +result5);
	}
}
