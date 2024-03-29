package Lista_Duplamente;

public class No<T> {
	private T conteudo;
	private No<T> noProximo;
	private No<T> noAnterior;
	
	public No(T conteudo){
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getNoProximo() {
		return noProximo;
	}

	public void setNoProximo(No<T> noProximo) {
		this.noProximo = noProximo;
	}

	public No<T> getNoAnterior() {
		return noAnterior;
	}

	public void setNoAnterior(No<T> noAnterior) {
		this.noAnterior = noAnterior;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
}
