import java.util.Date;
class T1 extends Thread
{
	public void run()
	{
		call();
	}
	public static void call() 
	{
		double sum = 0.0;
		for (int i=1; i<= Program1_2.N; i++) sum += 1.0 / Math.pow(i, 1.0/3);
		System.out.printf("F1 = %f\n", sum);
	}
}
class T2 extends Thread
{
	public void run()
	{
		call();
	}
	public static void call() 
	{
		double sum = 0.0;
		for (int x=1; x<= Program1_2.N; x++) sum += 1.0 / Math.pow(x, 1.0/4);
		System.out.printf("F2 = %f\n", sum);
	}
}
public class Program1_2 extends Thread
{
	public static final int N = 100000000;
	public static void main(String[] args) throws InterruptedException 
	{
		long begTime = new Date().getTime();
		T1 f1 = new T1();
		T2 f2 = new T2();
		f1.start();
		f2.start();
		f1.join();
		f2.join();
		double timeElapsed = (new Date().getTime() - begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}
