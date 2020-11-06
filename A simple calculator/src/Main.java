import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] ops = scanner.nextLine().split(" ");
        Long firstOperand = Long.parseLong(ops[0]);
        String operation = ops[1];
        Long secondOperand = Long.parseLong(ops[2]);
        switch (operation) {
            case "+":
                System.out.println(firstOperand + secondOperand);
                break;
            case "-":
                System.out.println(firstOperand - secondOperand);
                break;
            case "*":
                System.out.println(firstOperand * secondOperand);
                break;
            case "/":
                if (secondOperand != 0) {
                    System.out.println(firstOperand / secondOperand);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}