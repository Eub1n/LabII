package questao2;
import java.util.Random;

public final class TypesOfSorts {

public static void preencherVetores(int[] vetorA, int[] vetorB, int[] vetorC, int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = vetorB.length - (i);
			vetorC[i] = r.nextInt(1000);
		}
	}


	public static void BBSortClassico(int[] vetor) {
		int i, j, aux;
		for (i = 0; i < vetor.length - 1; i++)
			for (j = 0; j < vetor.length - 1; j++)
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux; 
				}
	}

	public static void BBSortAdapt1(int[] vetor) {
		int i, aux = 0;
		boolean HouveTroca = true;
		while (HouveTroca) {
			HouveTroca = false;
			for (i = 0; i < vetor.length - 1; i++)
				if (vetor[i] > vetor[i + 1]) {
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					HouveTroca = true;
				}
		}
	}

	public static void BBSortAdapt2(int[] vetor) {
		int i, j, aux, cont;
		cont = vetor.length - 1;
		for (i = 0; i < vetor.length - 1; i++) {
			for (j = 0; j < cont; j++)
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			cont--;
		}
	}

	public static void Selecao(int[] vetor) {
		int i, j, min, aux;
		for (i = 0; i < vetor.length - 1; i++) {
			min = i;
			for (j = i + 1; j < vetor.length; j++)
				if (vetor[j] < vetor[min])
					min = j;
			aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
		}
	}

	public static void Insercao(int[] vetor) {
		int i, j, v;
		for (i = 1; i < vetor.length; i++) {
			v = vetor[i];
			j = i;
			while ((j > 0) && (vetor[j - 1] > v)) {
				vetor[j] = vetor[j - 1];
				j--;
			}
			vetor[j] = v;
		}
	}

	public static void Quicksort(int v[], int esquerda, int direita) {
		int e = esquerda,d = direita,pivo = v[(e + d) % 2],troca;
		while (e <= d) {
			while (v[e] < pivo) {
				e = e + 1;
			}
			while (v[d] > pivo) {
				d = d - 1;
			}
			if (e <= d) {
				troca = v[e];
				v[e] = v[d];
				v[d] = troca;
				e = e + 1;
				d = d - 1;
			}
		}
		if (d > esquerda)
			Quicksort(v, esquerda, d);
		if (e < direita)
			Quicksort(v, e, direita);
	}
   

	
	public static void Mergesort(int v[], int inicio, int fim) {
		int meio;
		if (inicio < fim) { 
			meio = (inicio + fim) / 2; 
			Mergesort(v, inicio, meio); 
			Mergesort(v, meio + 1, fim); 
			Merge(v, inicio, meio, fim); 
		}
	}
   
   public static void Merge(int v[], int inicio, int meio, int fim) {
		int i, p1, p2;
		int aux[] = new int[fim + 1];

		p1 = inicio; 
		p2 = meio + 1; 
		i = inicio; 
		while (p1 <= meio && p2 <= fim) { 
			if (v[p1] <= v[p2])
				aux[i++] = v[p1++]; 
			else
				aux[i++] = v[p2++];
		}
		while (p1 <= meio)
			aux[i++] = v[p1++]; 
		while (p2 <= fim)
			aux[i++] = v[p2++];

		for (i = inicio; i <= fim; i++)
			v[i] = aux[i]; 
	}
	
	public static void shellSort ( int [ ] v )
    {  
       int i , j , x = 1, value ;
       do {
          x = 3 * x + 1;
       } while ( x < v.length );
       do {
          x = x / 3;
          for ( i = x; i < v.length; i++) {
             value = v [ i ];
             j = i - x;
             while (j >= 0 && value < v [ j ]) {
                v [ j + x ] = v [ j ];
                j = j - x;
             }
             v [ j + x ] = value;
          }
    } while ( x > 1 );
   }
}