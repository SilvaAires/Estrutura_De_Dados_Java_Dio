package Pilha;

public class Pilha {
	private No refernciaNo;

	public Pilha() {
		this.refernciaNo = null;
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPop = this.refernciaNo;
			this.refernciaNo = this.refernciaNo.getRefNo();
			return noPop;
		}
		return null;
	}
	
	public void push(No novoNo) {
		No refAux = refernciaNo;
		refernciaNo = novoNo;
		refernciaNo.setRefNo(refAux);
	}
	
	public No top() {
		return this.refernciaNo;
	}
	
	public boolean isEmpty() {
		if(refernciaNo == null) {
			return true;
		}else {
			return false;
		}
		//return refernciaNo == null? true : false; 
	}

	@Override
	public String toString() {
		String stringRe = "-----------\n";
		stringRe +="  Pilha\n";
		stringRe += "-----------\n";
		
		while(true) {
			No noAux = refernciaNo;
			if(noAux != null) {
				stringRe += "[No{dado="+noAux.getDado()+"}]\n";
				noAux = refernciaNo.getRefNo();
			}else {
				System.out.println("Erro");
				break;
			}
		}
		stringRe += "===========\n";
		return stringRe;
	}
	
}
