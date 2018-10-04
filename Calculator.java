public class Calculator
{
  private int result;

public void add(int a ,int b){
  this.result = a+b;
}

public void takeAway(int a,int b){
this.result = a-b;
}

public void division(int a, int b){
this.result = a/b;
}

public void multiply(int a, int b){
this.result = a*b;
}

public int getResult(){
return this.result;
}

public void cleanResult(){
this.result = 0;
}

}