package src.br.ufc.quixada.eda.listaprioridades;

import java.util.List;

/**
 * Implementa a lista de prioridade usando vetor ordenado.
 * Reparem que aqui voc� devem utilizar obrigat�riamente o quickSort 
 * para realizar a ordena��o, quando for necess�rio.
 * @author fabio
 *
 */
public class LPMaximaOrdenada {
	private int nMaximo = 0;
	private int vetor[] = null;
	private int n = 0;
	
	public LPMaximaOrdenada(int Nmaximo){
		nMaximo = Nmaximo;
		vetor = new int[Nmaximo];
	}
	
	public void contruir(List<Integer> entrada){
		for(int i = 0; i < entrada.size(); i++){
			vetor[i] = entrada.get(i);
		}
		
		n = entrada.size();
		quickSort(0, n-1);
	}
	
	public int getMaximaPrioridade(){
		return vetor[0];
	}
	
	public int remove(){
		if(n > 0){
			return vetor[--n];
		}
		
		return 0;
	}	
	
	public void inserir(int prioridade){
		if(n + 1 < nMaximo){
			vetor[n] = prioridade;
			n++;
		}
		
		quickSort(vetor[0], vetor[n-1]);
	}
	
	public void alterarPrioridade(int prioridade, int novaPrioridade){
		for(int i = 0; i < n; i++){
			if(vetor[i] == prioridade){
				vetor[i] = novaPrioridade;
				break;
			}
		}
		quickSort(vetor[0], vetor[n-1]);
	}
	
	private void quickSort(int ini, int fim){
		if(ini < fim){
			int meio = particiona(ini, fim);
			quickSort(ini, meio-1);
			quickSort(meio+1, fim);
		}

	}
	
	private int particiona(int p, int r){		
		int pivo = vetor[p];
		int inicio = p + 1;
		int fim = r;
		
		while(inicio <= fim){
			if(vetor[inicio] <= pivo){
				inicio++;
			}
			
			else if(pivo < vetor[fim]){
				fim--;
			}
			
			else{
				int troca = vetor[inicio];
				vetor[inicio] = vetor[fim];
				vetor[fim] = troca;
				inicio++;
				fim--;
			}
		}
		vetor[p] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}
}
