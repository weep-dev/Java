import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = entrada.nextInt();
			
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print("O array na posicao ");
			System.out.print(i);
			System.out.print(" Vale: ");
			System.out.println(array[i]);
		}
		
		int maior = array[0];
		int menor = array[0];
		
		for(int k = 1; k < array.length; k++) {
		
			if(array[k] > maior) {
				maior = array[k];
			}
			if(array[k] < menor) {
				menor = array[k];
			}
		}
		
		System.out.println("O maior elemento é "+ maior);
		System.out.println("O menor elemento é "+ menor);
		
		
		
	
		
	}

}
