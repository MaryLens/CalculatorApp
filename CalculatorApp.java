import java.util.Scanner;

// MAIN CLASS
public class CalculatorApp {

	public static void main(String[] args) {
		UI.renderMenu();
		int i = 0;
		while (i != 1) {
			int a = UI.scanInt();
			char op = UI.scanOp();
			int b = UI.scanInt();
			int r = 0;
			switch (op) {
			case '+': r = Arithmetics.add(a, b); 
			i++;
			UI.renderResult(a, op, b, r);
			break;
			case '-': r = Arithmetics.sub(a, b); 
			i++;
			UI.renderResult(a, op, b, r);
			break;
			case '*': r = Arithmetics.mul(a, b); 
			i++;
			UI.renderResult(a, op, b, r);
			break;
			case '/': r = Arithmetics.div(a, b); 
			i++;
			UI.renderResult(a, op, b, r);
			break;
			default : System.out.println("      Wrong operation, please, try again.");
			}
		}

	}

}

// SECONDARY CLASSES
class Arithmetics {
	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}
}

class UI {
	static void renderMenu() {
		System.out.println("|--------------------------------------------|");
		System.out.println("|                 CALCULATOR                 |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|               insert numbers               |");
		System.out.println("|               and choose ops:              |");
		System.out.println("|                  +,-,*,/                   |");
		System.out.println("|--------------------------------------------|");
	}

	static int scanInt() {
		Scanner in = new Scanner(System.in);
		System.out.print("                 Enter value: ");
		int value = in.nextInt();
		return value;
	}

	static char scanOp() {
		Scanner in = new Scanner(System.in);
		System.out.print("               Choose operation \n" + "                   (+,-,*,/): ");
		char op = in.next().charAt(0);
		return op;
	}

	static void renderResult(int a, char op, int b, int r) {
		System.out.println("                 " + a + " " + op + " " + b + " = " + r);
		System.out.println("|--------------------------------------------|");
	}
}
