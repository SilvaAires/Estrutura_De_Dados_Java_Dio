package Map;

import java.util.Objects;

public class Carro {
	private String marca;

	public Carro(String marca) {
		this.marca = marca;
	}
	
	public Carro() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + "]";
	}
	
}
