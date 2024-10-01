package no.hvl.dat100;

public class O3 {
	public static void main(String[] args) {
		int n=5;
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
