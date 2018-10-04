import java.util.Scanner;

public class InteractRunner{
	private int first;
	private int second;

//public static void main (String [] args){
	public void Interact(){
Scanner reader = new Scanner(System.in);
//try{
/*Calculator calc = new Calculator();
String exit = "no";
while(!exit.equals("yes")){
System.out.println("Please choose operation +,-,* or /");
String operation = reader.next();
int first = calc.getResult();
int second = 0;
if(calc.getResult() ==0){
*/
System.out.println("Enter first argumet please");
setFirst(Integer.valueOf(reader.next()));
System.out.println("Enter second argumet please");
 setSecond(Integer.valueOf(reader.next()));
 //reader.close();
//}
/*else{
	System.out.println("Enter argumet please");
	 second = Integer.valueOf(reader.next());
}
if(operation.equals("+")){
calc.add(first, second);
}else if (operation.equals("-")){
calc.takeAway(first, second);
}else if (operation.equals("*")){
calc.multiply(first, second);
}else if(operation.equals("/")){
calc.division(first, second);
} 
System.out.println("Result :" + calc.getResult());
System.out.println("Exit yes/no");
exit = reader.next();
System.out.println("Want to clean ressult? yes/no");
String clean = reader.next();
if(clean.equals("yes")){
calc.cleanResult();
}
*/
//}

//}finally{

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
//}  

