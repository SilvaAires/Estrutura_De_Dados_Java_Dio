package Atribuicao;

public class Meu {
	Integer num;

	public Meu(Integer num) {
		this.num = num;
	}
	
	public Meu() {
	}
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return this.num.toString();
	}
	
}
