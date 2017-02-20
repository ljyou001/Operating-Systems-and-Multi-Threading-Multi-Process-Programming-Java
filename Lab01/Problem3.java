public class Problem3 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello Baby!");
		ProcessBuilder PBuild1 = new ProcessBuilder("notepad","cs_baby.txt");
		Process p1 = PBuild1.start();
		ProcessBuilder PBuild2 = new ProcessBuilder("notepad", "is_baby.txt");
		Process p2 = PBuild2.start();
		p1.waitFor();
		p2.waitFor();
		System.out.println("Good Bye Baby!");
	}
}
