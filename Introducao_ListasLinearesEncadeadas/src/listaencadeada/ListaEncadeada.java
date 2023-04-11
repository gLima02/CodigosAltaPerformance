package listaencadeada;

public class ListaEncadeada {
	public static void main(String[] args) {
		no lista = new no();
		lista.dado = 1;
		lista.prox = null;
		
		no novo = new no();
		novo.dado = 2;
		novo.prox = null;
		
		lista.prox = novo;
		
		no novo2 = new no();
		novo2.dado = 3;
		novo2.prox = lista;
		
		lista = novo2;
		//var auxiliar para exibir os dados seguintes sem mover a lista
		no aux = lista;
		while(aux!= null) {
			System.out.println("aux.dado: " + aux.dado + "\t prox: " + aux.prox);
			aux = aux.prox;
		}
		
		/*
		//melhor visualizacao: 
		System.out.println("lista: " + lista);
		System.out.println("novo: " + novo);
		
		System.out.println("\nlista.dado: "+lista.dado +"\t prox: " + lista.prox);
		System.out.println("novo.dado: " + novo.dado + "\t prox:  " + novo.prox);
		*/
	}
}
