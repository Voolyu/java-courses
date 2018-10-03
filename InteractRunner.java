import java.util.Scanner;

public class InteractRunner{

public static void main (String [] args){
Scanner reader = new Scanner(System.in);
try{
Calculator calc = new Calculator();
String exit = "no";
while(!exit.equals("yes")){
System.out.println("Enter first argumet please");
int first = Integer.valueOf(reader.next());
System.out.println("Enter second argumet please");
int second = Integer.valueOf(reader.next());
calc.add(first, second);
System.out.println("Result :" + calc.getResult());
calc.cleanResult();
System.out.println("Exit yes/no");
exit = reader.next();
}
}finally{
reader.close();
}

}  // main
}  // class