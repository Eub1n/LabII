package questao2;
import java.util.Random;
public class Main {

   public static void preencherVetores(int[] vetorA, int[] vetorB, int[] vetorC, int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			vetorA[i] = i + 1;
			vetorB[i] = vetorB.length - (i);
			vetorC[i] = r.nextInt(1000);
   	}
   }

	
	public static void main(String[] args) {
		int[] vetorA = new int[100000];
		int[] vetorB = new int[100000];
		int[] vetorC = new int[100000];
     preencherVetores(vetorA, vetorB, vetorC, 100000);
      
      
      
		//Bubble normal
      Timer timerBubbleA = new Timer();
		TypesOfSorts.BBSortClassico(vetorA);
		String tBubbleA = timerBubbleA.getTotalTime();
      
      Timer timerBubbleB = new Timer();
		TypesOfSorts.BBSortClassico(vetorB);
		String tBubbleB = timerBubbleB.getTotalTime();
      
      Timer timerBubbleC = new Timer();
		TypesOfSorts.BBSortClassico(vetorC);
		String tBubbleC = timerBubbleC.getTotalTime();
      
      //Bubble adaptado1
      Timer timerBubbleAdapt1A = new Timer();
		TypesOfSorts.BBSortAdapt1(vetorA);
		String tBubbleAdapt1A = timerBubbleAdapt1A.getTotalTime();
      
      Timer timerBubbleAdapt1B = new Timer();
		TypesOfSorts.BBSortAdapt1(vetorB);
		String tBubbleAdapt1B = timerBubbleAdapt1B.getTotalTime();
      
      Timer timerBubbleAdapt1C = new Timer();
		TypesOfSorts.BBSortAdapt1(vetorC);
		String tBubbleAdapt1C = timerBubbleAdapt1C.getTotalTime();
      
      //Bubble adaptado2
      Timer timerBubbleAdapt2A = new Timer();
		TypesOfSorts.BBSortAdapt2(vetorA);
		String tBubbleAdapt2A = timerBubbleAdapt2A.getTotalTime();
      
      Timer timerBubbleAdapt2B = new Timer();
		TypesOfSorts.BBSortAdapt2(vetorB);
		String tBubbleAdapt2B = timerBubbleAdapt2B.getTotalTime();
      
      Timer timerBubbleAdapt2C = new Timer();
		TypesOfSorts.BBSortAdapt2(vetorC);
		String tBubbleAdapt2C = timerBubbleAdapt2C.getTotalTime();
     
      //Insercao
      Timer timerInsercaoA = new Timer();
		TypesOfSorts.Insercao(vetorA);
		String tInsercaoA = timerInsercaoA.getTotalTime();
      
      Timer timerInsercaoB = new Timer();
		TypesOfSorts.Insercao(vetorB);
		String tInsercaoB = timerInsercaoB.getTotalTime();
      
      Timer timerInsercaoC = new Timer();
		TypesOfSorts.Insercao(vetorC);
		String tInsercaoC = timerInsercaoC.getTotalTime();
  
      
      //Selecao
      Timer timerSelecaoA = new Timer();
		TypesOfSorts.Selecao(vetorA);
		String tSelecaoA = timerSelecaoA.getTotalTime();
      
      Timer timerSelecaoB = new Timer();
		TypesOfSorts.Selecao(vetorB);
		String tSelecaoB = timerSelecaoB.getTotalTime();
      
      Timer timerSelecaoC = new Timer();
		TypesOfSorts.Selecao(vetorC);
		String tSelecaoC = timerSelecaoC.getTotalTime();

      //Merge
      Timer timerMergeA = new Timer();
		TypesOfSorts.chamaMergeSort(vetorA);
		String tMergeA = timerMergeA.getTotalTime();
      
      Timer timerMergeB = new Timer();
		TypesOfSorts.chamaMergeSort(vetorB);
		String tMergeB = timerMergeB.getTotalTime();
      
      Timer timerMergeC = new Timer();
		TypesOfSorts.chamaMergeSort(vetorC);
		String tMergeC = timerMergeC.getTotalTime();

		//Shell
      Timer timerShellA = new Timer();
		TypesOfSorts.ShellSort(vetorA);
		String tShellA = timerShellA.getTotalTime();
      
      Timer timerShellB = new Timer();
		TypesOfSorts.ShellSort(vetorB);
		String tShellB = timerShellB.getTotalTime();
      
      Timer timerShellC = new Timer();
		TypesOfSorts.ShellSort(vetorC);
		String tShellC = timerShellC.getTotalTime();
      
      /*
      //Quick
      Timer timerQuickA = new Timer();
		TypesOfSorts.chamaQuicksort(vetorA);
		String tQuickA = timerQuickA.getTotalTime();
      
      Timer timerQuickB = new Timer();
		TypesOfSorts.chamaQuicksort(vetorB);
		String tQuickB = timerQuickB.getTotalTime();
      
      Timer timerQuickC = new Timer();
		TypesOfSorts.chamaQuicksort(vetorC);
		String tQuickC = timerQuickC.getTotalTime();
*/
      
		// Imprime os resultados 
      
		System.out.println("Tempo Bubble:");
		System.out.println("Crescente: " + tBubbleA);
		System.out.println("Decrescente: " + tBubbleB);
		System.out.println("Aleatorio: " + tBubbleC);
		System.out.println();
      System.out.println("Tempo BubbleAdapt1:");
		System.out.println("Crescente: " + tBubbleAdapt1A);
		System.out.println("Decrescente: " + tBubbleAdapt1B);
		System.out.println("Aleatorio: " + tBubbleAdapt1C);
		System.out.println();
      System.out.println("Tempo BubbleAdapt2:");
		System.out.println("Crescente: " + tBubbleAdapt2A);
		System.out.println("Decrescente: " + tBubbleAdapt2B);
		System.out.println("Aleatorio: " + tBubbleAdapt2C);
		System.out.println();
      System.out.println("Tempo Insercao:");
		System.out.println("Crescente: " + tInsercaoA);
		System.out.println("Decrescente: " + tInsercaoB);
		System.out.println("Aleatorio: " + tInsercaoC);
		System.out.println();
      System.out.println("Tempo Selecao:");
		System.out.println("Crescente: " + tSelecaoA);
		System.out.println("Decrescente: " + tSelecaoB);
		System.out.println("Aleatorio: " + tSelecaoC);
		System.out.println();  
      System.out.println("Tempo Merge:");
		System.out.println("Crescente: " + tMergeA);
		System.out.println("Decrescente: " + tMergeB);
		System.out.println("Aleatorio: " + tMergeC);
		System.out.println();
      System.out.println("Tempo Shell:");
		System.out.println("Crescente: " + tShellA);
		System.out.println("Decrescente: " + tShellB);
		System.out.println("Aleatorio: " + tShellC);
		System.out.println();
/*
      System.out.println("Tempo Quick:");
		System.out.println("Crescente: " + tQuickA);
		System.out.println("Decrescente: " + tQuickB);
		System.out.println("Aleatorio: " + tQuickC);
		System.out.println();
*/
	}
}
