import java.util.*;
class Digits
{
public static int digSum(int num)
{
	if(num==0)
		return 0 ;
	else
		return (num%10+digSum(num/10));
	
}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int num=Integer.parseInt(str);
	System.out.print(digSum(num));
}
}
