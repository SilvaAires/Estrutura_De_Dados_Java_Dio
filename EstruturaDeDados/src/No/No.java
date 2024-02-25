package No;

public class No<T>{ //Tipo genetico = T
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return this.conteudo+"";
	}
}
