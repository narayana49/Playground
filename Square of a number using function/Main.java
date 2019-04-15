import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
     int n=square(num);
      System.out.println(n);
	} 
public static int square(int num) 
{
return num * num;
}
}