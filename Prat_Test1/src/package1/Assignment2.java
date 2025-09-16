package package1;

public class Assignment2 {
	
	//(((((10*3)+2)*4)-4)/2)
	
	public int mul (int a,int b)
	{
		int c = a*b;
		System.out.println("Multiplication is : " +c);
		return c;
		}


	public int sum (int a1,int b1)
	{
	int c1 = a1+b1;
	System.out.println("Addition is :" +c1);
	return c1;
	}


	public int sub (int a2,int b2)
	{
	int c2 = a2-b2;
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
		Assignment2 ass2=new Assignment2();
		int result1 = ass2.mul(10,3);
		int result2 = ass2.sum(result1, 2);
		int result3 = ass2.mul(result2, 4);
		int result4 = ass2.sub(result3, 4);
		int result5 = ass2.div(result4, 2);
		
		System.out.println("Final Result is : " +result5);
	}

}
