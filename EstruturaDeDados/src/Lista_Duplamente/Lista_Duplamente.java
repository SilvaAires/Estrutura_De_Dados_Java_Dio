 package Lista_Duplamente;

public class Lista_Duplamente<T> {
	private No<T> primeiroNo;
	private No<T> ultimoNo;
	
	private int tamanhoLista = 0;
	
	public Lista_Duplamente(){
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	private No<T> getNo(int index){
		No<T> noAux = primeiroNo;
		
		for(int i = 0; (i < index) && (noAux != null); i++) {
			noAux = noAux.getNoProximo();
		}
		return noAux;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<T>(conteudo);
		novoNo.setNoProximo(null);
		novoNo.setNoAnterior(ultimoNo);
		if(primeiroNo == null) {
			primeiroNo = novoNo; 
		}
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		ultimoNo = novoNo;
		this.tamanhoLista++;
	}
	
	public void addIndex(int index, T elemento) {
		No<T> noAux = getNo(index);
		No<T> novoNo = new No<T>(elemento);
		
		novoNo.setNoProximo(noAux);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoAnterior(noAux.getNoAnterior());
			novoNo.getNoProximo().setNoAnterior(novoNo);
		}else {
			novoNo.setNoAnterior(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoAnterior().setNoProximo(novoNo);
		}
		this.tamanhoLista++;
	}
	
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo != null) {
				primeiroNo.setNoAnterior(null);
			}
		}else {
			No<T> noAux = getNo(index);
			noAux.getNoAnterior().setNoProximo(noAux.getNoProximo());
			if(noAux != ultimoNo) {
				noAux.getNoProximo().setNoAnterior(noAux.getNoAnterior());
			}else {
				ultimoNo = noAux;
			}
		}
		
		this.tamanhoLista--;
	}
	
	public String toString() {
		String ret = "";
		
		No<T> noAux = primeiroNo;
		for(int i = 0; i < size(); i++) {
			ret += "Conteudo: " + noAux.getConteudo() + "\n";
			noAux = noAux.getNoProximo();
		}
		ret += "null"; 
		return ret;
	}
}
