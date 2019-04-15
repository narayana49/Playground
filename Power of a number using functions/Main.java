import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int p=sc.nextInt();
      int power;
    int  r=calpower(n,p);
 
     System.out.println(r);
 
    }
 
  public static int calpower(int n1,int p1)
  {
 
     int r1=1;
 
     if(n1>=0&&p1==0)
     
        r1 =1;
 
     else if(n1==0&&p1>=1)
 
        r1=0;
     else
 
       for(int i=1;i<=p1;i++)
       
         r1=r1 *n1;
 
     return r1;
 
    }
 
}