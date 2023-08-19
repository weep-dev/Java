
public class Lista {
	
	NoLista inicio;
	public Lista() {
		this.inicio = null;
	}
	public void insereNoInicio(int v) {
		if(this.inicio == null)
			this.inicio = new NoLista(v);
		else {
			NoLista novo = new NoLista(v);
			novo.next = this.inicio;
			this.inicio = novo;
		}
	}
	public void insereNoFim(int v) {
		if(this.inicio == null)
			this.inicio = new NoLista(v);
		else {
			NoLista no = this.inicio;

			while(no.next != null)
				no = no.next;
			no.next = new NoLista(v);
		}
	}
	public void imprime() {
		NoLista no = this.inicio;
		while(no != null) {
			System.out.println(no.valor);
			no = no.next;
		}
	}
	public void remove(int v) {
		NoLista atual = this.inicio;
		NoLista anterior = null;
		while(atual != null && atual.valor != v) {
			anterior = atual;
			atual = atual.next;
		}
		if(atual != null) {
			if(anterior == null)
				this.inicio = atual.next;
			else
				anterior.next = atual.next;

		}
	}
	public int getMaior() {
		NoLista atual = this.inicio;
		int maior = this.inicio.valor;
		while(atual.next != null) {
			atual = atual.next;
			if (maior < atual.valor) {
				maior = atual.valor;
		}
		
		}
		return maior;
	
	}
	public int getMenor() {
		NoLista atual = this.inicio;
		int menor = this.inicio.valor;
		while(atual.next != null) {
			atual = atual.next;
			if (menor > atual.valor) {
				menor = atual.valor;
		}
		
		}
		return menor;
	}
}