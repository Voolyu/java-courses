


public class ArgRunner {
	
	private int first;
	private int second;
	
	public void Runner(){
		setFirst((int)(Math.random()*10));
		System.out.println("Your first argumet is " + first);
		setSecond((int)(Math.random()*10));
		System.out.println("Your second argumet is " + second);
		}
	public void setFirst(int first) {
		this.first = first;
	}

	public int getFirst() {
		return first;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getSecond() {
		return second;
	}
	}
		
 

