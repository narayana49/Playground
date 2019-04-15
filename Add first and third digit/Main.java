import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int first_digit=n;
      while(first_digit>10)
      {
        first_digit=first_digit/10;
      }
      int last_digit=n%10;
      int sum=first_digit+last_digit;
      System.out.println(sum);
	}
}