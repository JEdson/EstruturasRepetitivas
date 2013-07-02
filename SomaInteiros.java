import java.util.Scanner;


public class SomaInteiros {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int N, soma=0;
		Scanner LerS = new Scanner(System.in);
		System.out.println("limite superior do intervalo? ");
		N = LerS.nextInt();
		for (int I=1; I<=N; I++)
			soma+=I;
		System.out.printf("Total da adição dos %d inteiros=%d ", N,soma);
	
	}

}
