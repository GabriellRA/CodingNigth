import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
        System.out.println("Enter a command");
        Scanner in = new Scanner(System.in);
    
        switch () {
            case 1:  in = "add";
                add();
                break;
            case 2:  in = "sub";
                break;
            case 3:  in = "mul";
                break;
            case 4:  in = "div";
                break;
            case 5:  in = "mod";
                break;
            case 6:  in = "neg";
                break;
            case 7:  in = "lt";
                break;
            case 8:  in = "gt";
                break;
        }
    }
}
