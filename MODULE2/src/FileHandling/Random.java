package FileHandling;
import java.util.*;


class EvenThread extends Thread
{

	public void run(int n)
	{
		
	int square=n*n;
	System.out.println("Square of "+n+" ="+square);
	}
}
class OddThread extends Thread
{	public void run(int n)
	{
	 int cube=n*n*n;
	 System.out.println("cube of "+n +" = "+cube);
	}
}
class RandThread extends Thread
{
public void run()
	{ 
//create random number and check odd/even
	for(int i=0;i<=10;i++)
	{	
	int min = 1;  
	int max = 50;  
	
    int b = (int)(Math.random()*(max-min+1)+min); 
    try
   	{  
            Thread.sleep(1000);  
            }
            catch(Exception e)
            {System.out.println(e);
   	}  
	
	//System.out.print(b+"\n"); 
	
	if(b%2==0)
	{
		EvenThread e =new EvenThread();
		e.run(b);
		e.start();
	}else
	{
		OddThread o =new OddThread();
		o.run(b);
		o.start();
	}
	
	
		
	}}
	
}


public class Random{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		{
			RandThread r = new RandThread();
			r.start();
			}

	}

}