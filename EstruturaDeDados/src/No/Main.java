package No;

public class Main {
	public static void main(String[] args) {
		No<String> n1 = new No<String>("Conteudo no 1");
		No<String> n2 = new No<String>("Conteudo no 2");
		n1.setProximoNo(n2);
		
		No<String> n3 = new No<String>("Conteudo no 3");
		n2.setProximoNo(n3);
		
		No<String> n4 = new No<String>("Conteudo no 4");
		n3.setProximoNo(n4);
		
		System.out.println(n1);
		System.out.println(n1.getProximoNo());
		System.out.println(n1.getProximoNo().getProximoNo());
		System.out.println(n1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(n1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}
}
