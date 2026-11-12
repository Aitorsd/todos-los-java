package ariketak;

public class ArrayBatuketa {

	private Integer[] zerrenda = { 5, 11, 7, 1, 20 };
	private Integer batura;

	public ArrayBatuketa() {
		abiarazi();
		kalkulatuBatura();
		inprimatuEmaitza();
	}

	private void abiarazi() {
		batura = 0;
	}

	private void kalkulatuBatura() {
		for (Integer i = 0; i < zerrenda.length; ++i) {
			batura = batura + zerrenda[i];
		}
	}

	private void inprimatuEmaitza() {
		IO.println("Elementu guztien batura: " + batura);
	}

	public static void main(String[] args) {
		new ArrayBatuketa();
	}
}