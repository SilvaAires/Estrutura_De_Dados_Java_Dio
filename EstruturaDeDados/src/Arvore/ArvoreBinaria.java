package Arvore;

public class ArvoreBinaria<T extends Comparable<T>> {
	private No<T> raiz;
	
	public ArvoreBinaria(){
		this.raiz = null;
	}
	
	private No<T> inserir(No<T> atual, No<T> novoNo){
		if(atual == null) {
			return novoNo;
		}else {
			if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
				atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
			}else {
				atual.setNoDit(inserir(atual.getNoDit(), novoNo));
			}
		}
		return atual;
	}
	
	public void inserir(T conteudo) {
		No<T> novoNo = new No<T>(conteudo);
		this.raiz = this.inserir(this.raiz, novoNo);
	}
	
	public void exibirInOrdem() {
		System.out.println("\nExibindo InOrdem");
		this.exibirInOrdem(this.raiz);
	}
	
	private void exibirInOrdem(No<T> atual) {
		if(atual != null){
			this.exibirInOrdem(atual.getNoEsq());
			System.out.println(atual.getConteudo() + "\n------\n");
			this.exibirInOrdem(atual.getNoDit());
		}
	}
	
	public void exibirPosOrdem() {
		System.out.println("\nExibindo InOrdem");
		this.exibirPosOrdem(this.raiz);
	}
	
	private void exibirPosOrdem(No<T> atual) {
		if(atual != null){
			this.exibirPosOrdem(atual.getNoEsq());
			this.exibirPosOrdem(atual.getNoDit());
			System.out.println(atual.getConteudo() + "\n------\n");
		}
	}
	
	public void exibirPreOrdem() {
		System.out.println("\nExibindo InOrdem");
		this.exibirPreOrdem(this.raiz);
	}
	
	private void exibirPreOrdem(No<T> atual) {
		if(atual != null){
			System.out.println(atual.getConteudo() + "\n------\n");
			this.exibirPreOrdem(atual.getNoEsq());
			this.exibirPreOrdem(atual.getNoDit());
		}
	}
	
	public void remover(T conteudo) {
		try {
			No<T> atual = this.raiz; 
			No<T> pai = null; 
			No<T> filho = null; 
			No<T> temp = null; 
			
			while(atual != null && !atual.getConteudo().equals(conteudo)) {
				pai = atual;
				if(conteudo.compareTo(atual.getConteudo()) < 0) {
					atual = atual.getNoEsq();
				}else {
					atual = atual.getNoDit();
				}
			}
			
			if(atual == null) {
				System.out.println("Erro");
			}
			
			if(pai == null) {
				if(atual.getNoDit() == null) {
					this.raiz = atual.getNoEsq();
				}else if(atual.getNoEsq() == null) {
					this.raiz = atual.getNoDit();
				}else {
					for(temp = atual, filho = atual.getNoEsq();
							filho.getNoDit() != null;
							temp = filho, filho = filho.getNoEsq()) {
						if(filho != atual.getNoEsq()) {
							temp.setNoDit(filho.getNoEsq());
							filho.setNoEsq(raiz.getNoEsq());
						}
					}
					filho.setNoDit(raiz.getNoDit());
					raiz = filho;
				}
			}else if(atual.getNoDit()== null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoEsq());
				}else {
					pai.setNoDit(atual.getNoEsq());
				}
			}else if(atual.getNoEsq()== null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoDit());
				}else {
					pai.setNoDit(atual.getNoDit());
				}
			}else {
				for(temp = atual, filho = atual.getNoEsq(); filho.getNoDit() != null; temp = filho, filho = filho.getNoDit()) {
					if(filho != atual.getNoEsq()) {
						temp.setNoDit(filho.getNoEsq());
						filho.setNoEsq(atual.getNoEsq());
					}
					filho.setNoDit(atual.getNoDit());
					if(pai.getNoEsq() == atual) {
						pai.setNoEsq(filho);
					}else {
						pai.setNoDit(filho);
					}
				}
			}
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
