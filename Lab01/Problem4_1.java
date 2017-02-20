import java.util.*;
public class Problem4_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		long begTime = new Date().getTime();
		Grandom[] t = new Grandom[100];
		for (int i = 0; i < 100; i++)
		{
			t[i] = new Grandom();
			t[i].start();
			t[i].join();
		}
		double timeElapsed = (new Date().getTime() - begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}

class Grandom extends Thread
{
	public void run()
	{
		GenRandom();
	}
	static void GenRandom()
	{
		int i, n;
		double mean=0;
		Random ran = new Random();
		for (i=1; i<=1000; i++)
		{
			n = ran.nextInt(6) + 1;
			mean = mean + n;
		}
		System.out.printf("Mean random number = %f\n", mean/1000);
	}
}
