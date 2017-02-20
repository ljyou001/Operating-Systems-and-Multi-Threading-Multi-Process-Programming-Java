import java.util.Date;

public class Program2_1 
{
	
	public static void main(String[] args) 
	{
		long begTime = new Date().getTime();
		
		double sum = 0;
		for (int i = 1; i <= 500000000; i++ )
		{
			sum += 1/(Math.sqrt(i));
		}
		System.out.println(sum);
		
		double timeElapsed = (new Date().getTime() - begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}

}
