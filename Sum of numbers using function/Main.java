import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m=sum(n);
      System.out.println(m);
	}
  public static int sum(int n)
  {
    int sum=0;
    for(int i=0; i<=n; i++)
    { 
      sum=sum+i;
    }
        return  sum;
  }
} 

