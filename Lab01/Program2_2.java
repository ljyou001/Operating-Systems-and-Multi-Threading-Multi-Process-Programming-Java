import java.util.Date;

public class Program2_2 
{
	public static void main(String[] args) throws InterruptedException 
	{

			long begTime = new Date().getTime();
			
			Comp t1 = new Comp();
			Comp t2 = new Comp();
			Comp t3 = new Comp();
			Comp t4 = new Comp();
			
			t1.start = 1;
			t1.end = 125000000;
			t2.start = 125000001;
			t2.end = 250000000;
			t3.start = 250000001;
			t3.end = 375000000;
			t4.start = 375000001;
			t4.end = 500000000;
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			
			System.out.println(t1.sum+t2.sum+t3.sum+t4.sum);
			
			double timeElapsed = (new Date().getTime() - begTime) * 0.001;
			System.out.printf("Time elapsed = %f secs\n", timeElapsed);
		
	}

}

class Comp extends Thread
{
	int start, end;
	double sum = 0 ;
	public void run()
	{
		call();
	}
	public void call()
	{
		
		for (int i = start; i <= end; i++ )
		{
			sum += 1/(Math.sqrt(i));
		}
	}
}
