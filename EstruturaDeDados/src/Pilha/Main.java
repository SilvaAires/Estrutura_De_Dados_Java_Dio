package Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push(new No(1));
		pilha.push(new No(12));
		pilha.push(new No(122));
		
		System.out.println(pilha.toString());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}

}
