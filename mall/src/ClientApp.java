import java.util.Scanner;

public class ClientApp {
	public static void main(String[] args) {
		Mall m = new Mall();
		Scanner s = new Scanner(System.in);
		while (true) {
			String input = s.next();
			if (input.toLowerCase().equals("x")) {
				break;// ÷’÷π≥Ã–Ú
			}
			switch (input) {
			case "t":
				m.tick();
				break;
			case "e":
				m.enter();
				break;
			case "d":
				m.display();
				break;
			default:
				break;
			}
		}
	}
}
