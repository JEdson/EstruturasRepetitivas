import java.util.Scanner;


public class NunerosImpares03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B;
		Scanner LerS = new Scanner(System.in);
		do{
			System.out.print("Limite inferior: ");
			A=LerS.nextInt();
			System.out.print("Limite superior: ");
			B=LerS.nextInt();}
			while (A>B);
			if (A%2==0)
				A++;
			for (int Impar=A; Impar<=B; Impar+=2)
				System.out.printf(String.format("numero: = %d\n\n",Impar));
		
	}

}
