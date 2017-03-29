
public class HeapMaximoT {
	private int n;
	private int tamanhoMax;
	private int vetor[];
	
	public void subir(int i){
		int j = (i-1)/3;
		
		if(j >= 1){
			if(vetor[j] < vetor[i]){
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				subir(j);
			}
		}
	}
	
	public void descer(int i){
		int j = (i+1) * 3;
		
		if(j <= n){
			if(vetor[j+1] > vetor[j] && j+1 <= n){
				j++;
			}
			
			if(vetor[j] > vetor[i]){
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
	}
	
	public void inserir(int prioridade){
		if(n+1 <= tamanhoMax){
			vetor[n+1] = prioridade;
			n++;
			subir(n);
		}
	}
	
	public int remover(int i){
		if(n >= 1){
			int aux;
			aux = vetor[i];
			vetor[i] = vetor[n];
			vetor[n] = aux;
			n--;
			descer(i);
			return aux;
		}
		
		return 0;
	}
}
