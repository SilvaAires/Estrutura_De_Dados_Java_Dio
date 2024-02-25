package Fila;

public class Fila<T> {
	private No<T> refNoEntrada;

	public Fila() {
		this.refNoEntrada = null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> Primeiro = refNoEntrada;
			No<T> noAux = refNoEntrada;
			while(true) {
				if(Primeiro.getRefNo() != null) {
					noAux = Primeiro;
					Primeiro = Primeiro.getRefNo();
				}else {
					noAux.setRefNo(null);
					break;
				}
			}
			return (T) Primeiro.getObject();
		}
		return null;
	}
	
	
	public T first() {
		if(!this.isEmpty()) {
			No<T> Primeiro = refNoEntrada;
			while(true) {
				if(Primeiro.getRefNo() != null) {
					Primeiro = Primeiro.getRefNo();
				}else {
					break;
				}
			}
			return (T) Primeiro.getObject();
		}
		return null;
	}
	
	public void enqueue(T onj) {
		No<T> novoNO = new No<T>(onj);
		novoNO.setRefNo(refNoEntrada);
		refNoEntrada = novoNO;
	}
	
	public boolean isEmpty() {
		return refNoEntrada == null? true : false;
	}

	@Override
	public String toString() {
		String retorno ="";
		No aux = refNoEntrada;
		if(refNoEntrada != null) {
			while(true) {
				retorno += "\n"+ aux.getObject()+"\n";
				if(aux.getRefNo() != null) {
					aux = aux.getRefNo(); 
				}else {
					break;
				}
			}
		}else {
			retorno = "null";
		}
		return retorno;
	}
}
