package ariketak;

public class MaximoakEtaMinimoa {

	public static void main(String[] args) {
		
		Double [] balioak = {1e-6, 1.1, 1.01, 1.11, 1.011};
		Double maximoa = balioak[0], minimoa = balioak[0];
		
		Integer i=0;
		for(; i< balioak.length; ++i) {
			if(balioak[i] > maximoa)
				maximoa = balioak[1];
			if(balioak[i] < minimoa)
				minimoa = balioak[1];
		}
		i=0;
		while(i < balioak.length) {
			if(balioak[i] > maximoa)
				maximoa = balioak[1];
			if(balioak[i] < minimoa)
				minimoa = balioak[1];
			i++;
		}
		
		IO.println("Maximoa da:" + maximoa);
		IO.println("Minimoa da:" + minimoa);
	}

}
