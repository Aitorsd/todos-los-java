package businesslogic;

public class Begizta {

	public void egikaritu() {
		for (Integer n = 0; n < 10; ++n) {
			for (Integer m = 0; m < 10; ++m)
				IO.println(n + " x " + m + " = " + n * m);
			IO.println("---");
		}
	}

	public void bitartean() {
		// 0..n egitura

		for (Integer i = 0; i < 10; ++i)
			;
		Integer i = 0;
		while (i < 10)
			IO.print(i++);

		// 1..n egitura
		i = 0;
		do {
			IO.print(i++);
		} while (i < 10);

	}

	public static void main(String[] args) {
		new Begizta().bitartean();
	}

}
