package Atribuicao;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = a;
		System.out.println(a+" "+b);
		
		Meu oA = new Meu(5);
		Meu oB = oA;
		System.out.println(oA+" "+oB);
		oA.setNum(4);
		System.out.println(oA+" "+oB);
		oA = new Meu(8);
		System.out.println(oA+" "+oB);
	}

}
