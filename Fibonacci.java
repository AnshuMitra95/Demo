//Print fibonacci Series    0,1,1,2,3,5,8,13,.........................upto n terms
import  java.util.*;
class Fibonacci
{
  public static void main(String arg[])
  {
    int f=0,s=1,t,n;
	System.out.println("Enter number");
	Scanner ob=new Scanner(System.in);
	n=ob.nextInt();
	System.out.println("Fibonacci series :");
	for(int i=0;i<n;i++)
	  {
        if(i<=1)
           t=i;
        else
          {
		      t=f+s;
			  f=s;
			  s=t;
		  }		
	    System.out.print("  "+t);
	   }
   }
}   