package no.hvl.dat100;
import java.util.Scanner;
public class O3 {
	public static void main(String[] args) {
		Scanner objekt = new Scanner(System.in);
		System.out.println("Skriv inn eit tal:");
		String tal = objekt.nextLine();
		int n=Integer.valueOf(tal);
		int fakultet=1;
		if(n>0) {
			while(n>0){
				fakultet=fakultet*(n);
				n=n-1;
			}
		}
		else {
			System.out.print("ugyldig tall");
		}
		System.out.print(fakultet);
		
	}

}
