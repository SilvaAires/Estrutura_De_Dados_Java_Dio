package Map;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String , String> al = new HashMap<>();
		al.put("Nome", "J");
		al.put("Nota", "17");
		al.put("Turma", "17");
		al.put("Idade", "17");
		
		System.out.println(al);
		
		System.out.println(al.keySet());
		System.out.println(al.values());
		
		List<Map<String , String>> la = new ArrayList<>();
		
		la.add(al);
		Map<String , String> al1 = new HashMap<>();
		al1.put("Nome", "Jf");
		al1.put("Nota", "171");
		al1.put("Turma", "171");
		al1.put("Idade", "171");
		la.add(al);
		System.out.println(la);
	}
}
