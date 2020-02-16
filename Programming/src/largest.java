
public class largest {
	
	public static void main(String[] args) {
		int num1= 3;
		int num2= 10;
		int num3= 12;
		
		
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("largest number is " + num1);
		}
		else if(num2>num1 && num2> num3)
		{
			System.out.println("largest number is " + num2);
		}
		else
		{
			System.out.println("largest number is " + num3);
		}
	}

}
