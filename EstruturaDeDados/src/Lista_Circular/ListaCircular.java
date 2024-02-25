package Lista_Circular;

public class ListaCircular<T> {
	private No<T> noCabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() {
		this.cauda = null;
		this.noCabeca = null;
		this.tamanhoLista = 0;
	}

	public int size() {
		return this.tamanhoLista;
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("Erro");
		}
		
		if(index == 0) {
			return this.cauda;
		}
		
		No<T> noAux = this.cauda;
		
		for(int i = 0; (i < index) && (noAux != null); i++) {
			noAux = noAux.getProximoNo();
		}
		
		return noAux;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void remove(int index) {
		if(index >= this.tamanhoLista) {
			throw new IndexOutOfBoundsException("Erro");
		}
		
		No<T> noAux = this.cauda;
		if(index == 0){
			this.cauda = this.cauda.getProximoNo();
			this.noCabeca.setProximoNo(this.cauda);
		}else {
			if(index == 1) {
				this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
			}else {
				for(int i = 0; i < index-1; i++) {
					noAux = noAux.getProximoNo();
				}
				noAux.setProximoNo(noAux.getProximoNo().getProximoNo());
			}
		}
		this.tamanhoLista--;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<T>(conteudo);
		if(this.tamanhoLista == 0) {
			this.noCabeca = novoNo;
			this.cauda = this.noCabeca;
			this.noCabeca.setProximoNo(cauda);
		}else {
			novoNo.setProximoNo(this.cauda);
			this.noCabeca.setProximoNo(novoNo);
			this.cauda = novoNo;
		}
		this.tamanhoLista++;
	}
	
	public String toString() {
		String ret = "";
		
		No<T> noAux = this.cauda;
		for(int i = 0; i < this.size(); i++) {
			ret += "Conteudo: " + noAux.getConteudo()+"\n";
			noAux = noAux.getProximoNo();
		}
		ret += this.size() != 0 ? "(inicio)" : "[vazio]";
		
		return ret;
	}
}
