package Arvore.model;

import Arvore.ArvoreBinaria;

public class Main {
	public static void main(String[] args) {
		ArvoreBinaria<Obj> arv = new ArvoreBinaria<Obj>();
		arv.inserir(new Obj(13));
		arv.inserir(new Obj(10));
		arv.inserir(new Obj(25));
		arv.inserir(new Obj(2));
		arv.inserir(new Obj(12));
		arv.inserir(new Obj(20));
		arv.inserir(new Obj(31));
		arv.inserir(new Obj(29));
		
		arv.exibirInOrdem();
		arv.exibirPosOrdem();
		arv.exibirPreOrdem();
	}
}
