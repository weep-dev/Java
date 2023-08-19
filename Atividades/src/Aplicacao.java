import java.util.ArrayList;
import java.util.List;


public class Aplicacao {
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.insereNoInicio(4);
		lista.insereNoInicio(7);
		lista.insereNoInicio(9);
		lista.insereNoInicio(2);
		lista.imprime();
		
		
		
		
		System.out.print("O maior numero é: ");
		System.out.println(lista.getMaior());
		System.out.print("O menor numero é: ");
		System.out.println(lista.getMenor());
		
		List<Pessoa> lista2 = new ArrayList<>(); 
		Pessoa p = new Pessoa ("Maria");
		Pessoa p2 = new Pessoa ("Joao");
		Pessoa p3 = new Pessoa ("Lucas");
		lista2.add(p);
		lista2.add(p2);
		lista2.add(p3);
		for(int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
		
		
		
		
		
	}
}