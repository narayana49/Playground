import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long i=0,val,r=0;
        val=n;
      while(i<2)
      {
        r=n%10;
        n=n/10;
        i++;
      }
        System.out.println(r);
	}
}