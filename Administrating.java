import java.util.*;


public class Administrating {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String isExit = "no"; 
		while(!isExit.equals("yes")){
			
			Worker work = new Worker();
			work.ask();
			System.out.println("Do you want exit the program? yes/no ");
			String checkExit = sc.next();
			
			if(checkExit.equals("yes")){
			   isExit = "yes";
			}
		}
		

	}

	
}

