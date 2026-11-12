package ariketak;

import java.util.Scanner;

public class BakoitiaAlaBikoitia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int bakoiti = 0;
		int bikoiti = 0;

		IO.println("Idatzi 10 zenbaki");

		for (int i = 1; i <= 10; i++) {
			int zenbakia = scanner.nextInt();
			
			if (zenbakia % 2 == 0) {
                bikoiti++;
            } else {
                bakoiti++;
            }
		}
		
		IO.println("Zenbaki bakoitiak: " + bakoiti);
		IO.println("Zenbaki bikoitiak: " + bikoiti);

	}
}
