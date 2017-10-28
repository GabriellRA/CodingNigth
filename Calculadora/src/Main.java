import calc.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String cmd = getCommand(in);
		
		while(!cmd.equals("exit")){
		 switch (cmd) {
		       case "calculadora": doCalc(in);
		           break;
		        case "tranformer": doTrans();
		            break;
		         default: System.out.println("Comando errado. Por favor insira um comando correto");
		         break;
		        }
		 System.out.println();
		 cmd = getCommand(in);
		}
	}
	private static String getCommand(Scanner in) {
	String input;
	
	input = in.next();
	return input;
}
	
	private static void doCalc(Scanner in){
		int x,y, result;
		String op;
		op = in.next();
		
		
		
		if(op.equals("neg")){
			x = in.nextInt();
			Calculadora calc = new Calculadora(op, x);
			result = calc.getResultado();
			System.out.println(result);
		}
		else{
			x = in.nextInt();
			y = in.nextInt();
			System.out.println(op);
			Calculadora calc = new Calculadora(op, x, y);
			result = calc.getResultado();
			System.out.println(result);
	
		}
			
	}
	
	private static void doTrans(){
		
	}

}
