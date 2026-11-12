package ariketak;

public class ArrayakAlderantziz {

	private Integer[] balioak = {1, 2, 3, 4, 5, 6, 7};
	
	public ArrayakAlderantziz() {
		alderantzizInprimatu();
	}
	
	private void alderantzizInprimatu() {
		for (int i = balioak.length - 1; i >= 0; i--) {
			IO.println(balioak[i]);
		}
	}
	
	public static void main(String[] args) {
		new ArrayakAlderantziz();

	}

}
