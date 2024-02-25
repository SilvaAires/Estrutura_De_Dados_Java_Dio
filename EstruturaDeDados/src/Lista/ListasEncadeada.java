package Lista;

public class ListasEncadeada<T> {
	private No<T> referenciaEntrada;

	public ListasEncadeada() {
		this.referenciaEntrada = null;
	}
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true : false;
	}
	
	public int size() {
		int tamanhoLista = 0;
		
		No<T> referenciaAux = referenciaEntrada;
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		
		return tamanhoLista;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<T>(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAux = referenciaEntrada;
		for(int i = 0; i < this.size()-1; i++) {
			noAux = noAux.getProximoNo();
		}
		noAux.setProximoNo(novoNo);
	}
	
	private No<T> getNo(int index){
		valida(index);
		
		No<T> noAuxliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxliar;
			noAuxliar = noAuxliar.getProximoNo();
		}
		return noRetorno;
	}
	
	private void valida(int index) {
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Não existe o indice!");
		}
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}
	
	public String toString() {
		String retorno = "";
		No<T> noAux = referenciaEntrada;
		for(int i = 0; i<this.size(); i++) {
			retorno += "Conteudo: " + noAux.getConteudo()+"\n";
			noAux = noAux.getProximoNo();
		}
		retorno += "null";
		return retorno;
	}
}
