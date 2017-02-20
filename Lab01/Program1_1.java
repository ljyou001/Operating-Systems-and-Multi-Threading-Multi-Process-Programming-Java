import java.util.Date;
public class Program1_1 
{
	public static final int N = 100000000;
	public static void main(String[] args) 
	{
		long begTime = new Date().getTime();
		F1 f1 = new F1();
		F2 f2 = new F2();
		f1.call();
		f2.call();
		double timeElapsed = (new Date().getTime() - begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}

class F1 
{
	public void call() 
	{
		double sum = 0.0;
		for (int i=1; i<= Program1_1.N; i++) sum += 1.0 / Math.pow(i, 1.0/3);
		System.out.printf("F1 = %f\n", sum);
	}
}
class F2 {
	public void call() 
	{
		double sum = 0.0;
		for (int x=1; x<= Program1_1.N; x++) sum += 1.0 / Math.pow(x, 1.0/4);
		System.out.printf("F2 = %f\n", sum);
	}
}