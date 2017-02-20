import java.util.Random;

public class Prandom 
{
	public static void main(String[] args) 
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
