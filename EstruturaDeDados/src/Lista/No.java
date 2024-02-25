package Lista;

public class No<T> {
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo, No<T> proximoNo) {
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}

	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}
	
	public No() {
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return this.proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return this.conteudo + "";
	}
	
	public String toStringLista() {
		String ret =  this.conteudo + " ";
		if(this.proximoNo != null) {
			ret += "---> " + this.proximoNo.toString();
		}else {
			ret += "---> null"; 
		}
		return ret;
	}
	
}
