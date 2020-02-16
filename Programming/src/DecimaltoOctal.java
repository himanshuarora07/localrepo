
public class DecimaltoOctal {
public static void main(String[] args) {
	
	
	int num=13;
	int bin=0;
	int i=1;
	while(num!=0)
	{
		int rem=num%8;
		num=num/8;
		bin=bin+(i*rem);
		i=i*10;
	}
	
	System.out.println(bin);
}
}
