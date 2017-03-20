package src.br.ufc.quixada.eda.listaprioridades;

import java.util.List;

/**
 * Implementa a lista de prioridade usando Heap Maximo.
 * @author fabio
 *
 */
public class HeapMaximo {
	private int nMaximo = 0;
	private int vetor[] = null;
	private int n = 0;
	
	public HeapMaximo(int Nmaximo){
		nMaximo = Nmaximo;
		vetor = new int[Nmaximo];
	}
	
	private void subir(int i){
		int aux = i/2;
		
		if(aux >= 1){
			if(vetor[aux] < vetor[i]){
				int aux1 = vetor[aux];
				vetor[aux] = vetor[i];
				vetor[i] = aux1;	
				subir(aux);
			}
		}
	}
	
	private void descer(int i){
		int aux = i*2;
		
		if(aux <= n){
			if(vetor[aux+1] > vetor[aux] && aux+1 <= n){
				aux++;
				if(vetor[aux] > vetor[i]){
					int aux1 = vetor[aux];
					vetor[aux] = vetor[i];
					vetor[i] = aux1;
					descer(aux);
				}
			}
		}
	}
	
	public void contruir(List<Integer> entrada){
		for(int i = n/2; i >= 1; i--){
			descer(i);
		}
	}
	
	public int getMaximaPrioridade(){
		return vetor[0];
	}
	
	public int remove(){
		int aux = 0;
		if(n >= 1){
			aux = vetor[0];
			vetor[0] = vetor[n-1];
			vetor[n-1] = aux;
			n--;
			descer(0);
		}
		return aux;
	}	
	
	public void inserir(int prioridade){
		if(n+1 <= nMaximo){
			vetor[n+1] = prioridade;
			n++;
			subir(n);
		}
	}
	
	public void alterarPrioridade(int prioridade, int novaPrioridade){		
		if(n < 0){
			for(int i = 0; i < n; i++){
				if(vetor[i] < novaPrioridade){
					vetor[i] = novaPrioridade;
					subir(i);
				}
				
				else{
					vetor[i] = novaPrioridade;
					descer(i);
				}
			}
		}
	}	
}
