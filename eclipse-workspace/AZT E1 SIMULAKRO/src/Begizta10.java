
public class Begizta10 {

	public static void main(String[] args) {
		double rand = Math.random() * 10;

		for (int i = 0; i < 10; i++) {
			IO.println(rand);
			if (rand % 2 == 0)
				IO.println("Bakoitia");
			else
				IO.println("Bikoitia");
		}
	}

}
