import java.util.Scanner;
public class locker {
	public int books;
	private int lockerNum;
	private String studentName;
	private byte numBooks;
	private int combinationLock;
	public void putBook() {
	    books++;
	}
	public boolean removeBook(){
		if(books>=0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public boolean openLocker(){
		for(int i=0;i<3;i++)
		{
			System.out.println("Input the first number of the locker combination");
			Scanner keyboard = new Scanner(System.in);
			String input = ""+keyboard.nextInt();
		}
		return true;
	}
	
}
