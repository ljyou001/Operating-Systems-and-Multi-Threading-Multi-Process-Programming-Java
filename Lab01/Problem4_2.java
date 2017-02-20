import java.util.Date;

public class Problem4_2 
{
	public static void main(String[] args) throws Exception
	{
		long begTime = new Date().getTime();
		ProcessBuilder[] program = new ProcessBuilder[100];
		Process[] pr = new Process[100];
		for(int i = 0; i < 100; i++)
		{
			program[i] = new ProcessBuilder("java","-cp","D:/COMP/bin","Prandom");
			program[i].inheritIO();
			pr[i] = program[i].start();
			pr[i].waitFor();
		}
		double timeElapsed = (new Date().getTime() - begTime) * 0.001;
		System.out.printf("Time elapsed = %f secs\n", timeElapsed);
	}
}
