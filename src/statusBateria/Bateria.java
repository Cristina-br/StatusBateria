package statusBateria;

public class Bateria {
	
	private int n;
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getBattery(int[] eventos) {
		int bateria = 50;
		
		for (int i = 0; i < eventos.length; i++) {
			bateria += eventos[i];
			if (bateria > 100) {
				bateria = 100;
			}
			if (bateria < 0) {
				bateria = 0;
			}
		}
		
			this.n = bateria;
			return bateria;
	}

}
