/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class q1 {
   static void multiple(int a, int b, int x)
    {       
	   if (b < 0)
        {
            if (a == 1 && x == 1)
                System.out.println("1");
            	
            else
                System.out.println("0");
            	
        }
	   else {
         int mul = (int)Math.pow(a, b);
         int ans = mul / x;
        int ans1 = x * ans;
        int ans2 = x * (ans + 1);
        System.out.println(((mul - ans1)<= (ans2 - mul))? ans1 : ans2);
   } 
    }
    static public void main (String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=ip.nextInt();
        	b[i]=ip.nextInt();
        	x[i]=ip.nextInt();
            
    }
        for(int i=0;i<n;i++)
        {
        	multiple(a[i], b[i], x[i]);
        }
        ip.close();
    }
}
