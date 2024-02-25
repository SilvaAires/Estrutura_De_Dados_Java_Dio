package Arvore;

public class No<T extends Comparable<T>> {
	private T conteudo;
	private No<T> noEsq;
	private No<T> noDit;
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.noDit = null;
		this.noEsq = null;
	}
	
	public No(){
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(No<T> noEsq) {
		this.noEsq = noEsq;
	}

	public No<T> getNoDit() {
		return noDit;
	}

	public void setNoDit(No<T> noDit) {
		this.noDit = noDit;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
}
