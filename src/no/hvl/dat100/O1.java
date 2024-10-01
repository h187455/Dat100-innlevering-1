package no.hvl.dat100;
import java.util.Scanner;
public class O1 {
	
	public static void main(String[] args) {
		Scanner objekt = new Scanner(System.in);
		System.out.println("Skriv inn eit tal:");
		String tal = objekt.nextLine();
		int bruttoinntekt=Integer.valueOf(tal);
		if(bruttoinntekt>208051 && bruttoinntekt<292850) {
			System.out.print(bruttoinntekt*0.017);
		}
		if(bruttoinntekt>292850 && bruttoinntekt<670000) {
			System.out.print(bruttoinntekt*0.04);
		}
		if(bruttoinntekt>670000 && bruttoinntekt<970000) {
			System.out.print(bruttoinntekt*0.136);
		}
		if(bruttoinntekt>970000 && bruttoinntekt<1350000) {
			System.out.print(bruttoinntekt*0.166);
		}
		if(bruttoinntekt>1350000) {
			System.out.print(bruttoinntekt*0.176);
		}
		if(bruttoinntekt<208051) {
			System.out.print("ingen trinnskatt");
		}
	}
	

}
