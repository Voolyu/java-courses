import java.util.Scanner;


public class Runner {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		try{
		Calculator calc = new Calculator();
		String exit = "no";
		while(!exit.equals("yes")){
			int first = calc.getResult();
			int second = 0;
			System.out.println("Please choose operation +,-,* or /");
			String operation = sc.next();
			while(true){
				if(operation.equals("+") || operation.equals("-")|| operation.equals("*")|| operation.equals("/")){
					break;
				}else{
				System.out.println("Please choose one of them operations +,-,* or /");
				 operation = sc.next();
				}
			}
		System.out.println("Interact or Arg? int/arg");
		String ans = sc.next();
		while(true){
			if(ans.equals("arg") || ans.equals("int")){
				break;
			}else{
			System.out.println("Choose on of them Interact or Arg? int/arg ");
			ans = sc.next();
		}
		}
		
		if(ans.equals("int")){
			InteractRunner ir = new InteractRunner();
			ir.Interact();
			first = ir.getFirst();
			second = ir.getSecond();
		}else if(ans.equals("arg")){
			ArgRunner ar = new ArgRunner();
			ar.Runner();
			first = ar.getFirst();
			second = ar.getSecond();
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
		System.out.println("Want to clean ressult? yes/no");
		String clean = sc.next();
		if(clean.equals("yes")){
		calc.cleanResult();
		}
		System.out.println("Exit yes/no");
		exit = sc.next();
		
		
		}
		}finally{
		sc.close();
		}

		} 
}

