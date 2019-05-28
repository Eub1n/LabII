
public class Main {
	
	public static void main(String[] args) {
		int[] vetorA = new int[100000];
		int[] vetorB = new int[100000];
		int[] vetorC = new int[100000];
      TypesOfSorts.preencherVetores(vetorA, vetorB, vetorC, 100000);
		
     /* Timer timerBubbleA = new Timer();
		TypesOfSorts.BBSortClassico(vetorA);
		String tBubbleA = timerBubbleA.getTotalTime();
      
      Timer timerBubbleB = new Timer();
		TypesOfSorts.BBSortClassico(vetorB);
		String tBubbleB = timerBubbleB.getTotalTime();
      
      Timer timerBubbleC = new Timer();
		TypesOfSorts.BBSortClassico(vetorC);
		String tBubbleC = timerBubbleC.getTotalTime();
      
      Timer timerBubbleAdapt1A = new Timer();
		TypesOfSorts.BBSortAdapt1(vetorA);
		String tBubbleAdapt1A = timerBubbleAdapt1A.getTotalTime();
      
      Timer timerBubbleAdapt1B = new Timer();
		TypesOfSorts.BBSortAdapt1(vetorB);
		String tBubbleAdapt1B = timerBubbleAdapt1B.getTotalTime();
      
      Timer timerBubbleAdapt1C = new Timer();
		TypesOfSorts.BBSortAdapt1(vetorC);
		String tBubbleAdapt1C = timerBubbleAdapt1C.getTotalTime();
      */
      Timer timerBubbleAdapt1A = new Timer();
		TypesOfSorts.BBSortAdapt2(vetorA);
		String tBubbleAdapt1A = timerBubbleAdapt1A.getTotalTime();
      
      Timer timerBubbleAdapt1B = new Timer();
		TypesOfSorts.BBSortAdapt2(vetorB);
		String tBubbleAdapt1B = timerBubbleAdapt1B.getTotalTime();
      
      Timer timerBubbleAdapt1C = new Timer();
		TypesOfSorts.BBSortAdapt2(vetorC);
		String tBubbleAdapt1C = timerBubbleAdapt1C.getTotalTime();

		
		// Imprime os resultados
		/*System.out.println("Tempo Bubble:");
		System.out.println("Crescente: " + tBubbleA);
		System.out.println("Decrescente: " + tBubbleB);
		System.out.println("Aleatorio: " + tBubbleC);
		System.out.println();*/
      System.out.println("Tempo BubbleAdapt1:");
		System.out.println("Crescente: " + tBubbleAdapt1A);
		System.out.println("Decrescente: " + tBubbleAdapt1B);
		System.out.println("Aleatorio: " + tBubbleAdapt1C);
		System.out.println();

		/*System.out.println("Tempo Insert:");
		System.out.println("Crescente: " + tempoInsertCres);
		System.out.println("Decrescente: " + tempoInsertDecr);
		System.out.println("Aleatorio: " + tempoInsertRand);
		System.out.println();
		System.out.println("Tempo Selection:");
		System.out.println("Crescente: " + tempoSelectionCres);
		System.out.println("Decrescente: " + tempoSelectionDecr);
		System.out.println("Aleatorio: " + tempoSelectionRand);
		System.out.println();
		System.out.println("TempoMerge:");
		System.out.println("Crescente: " + tempoMergeCres);
		System.out.println("Decrescente: " + tempoMergeDecr);
		System.out.println("Aleatorio: " + tempoMergeRand);
		System.out.println();
		System.out.println("Tempo Quick:");
		System.out.println("Crescente: " + tempoQuickCres);
		System.out.println("Decrescente: " + tempoQuickDecr);
		System.out.println("Aleatorio: " + tempoQuickRand);
		System.out.println();
		System.out.println("Tempo Shell:");
		System.out.println("Crescente: " + tempoShellCres);
		System.out.println("Decrescente: " + tempoShellDecr);
		System.out.println("Aleatorio: " + tempoShellRand);
		System.out.println();*/
	}
}
