import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
      int min;
      int m=gcd(n1,n2);
     int k=gcd(m,n3);
      System.out.println(k);
	}
  public static int gcd(int n1, int n2)
  {
    int min;
    int a=0;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if(n1%min==0 && n2%min==0)
      {
        a=min;
        break;
      }
      min--;
    }
    return a; 
 }
}