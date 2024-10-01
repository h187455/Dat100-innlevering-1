package no.hvl.dat100;

public class O2 {
	public static void main(String[] args) {
		int poeng=99;
		if(poeng<=100 && poeng>=90) {
			System.out.print("A");
		}
		if(poeng<90 && poeng>=80) {
			System.out.print("B");
		}
		if(poeng<80 && poeng>=60) {
			System.out.print("C");
		}
		if(poeng<60 && poeng>=50) {
			System.out.print("D");
		}
		if(poeng<50 && poeng>=40) {
			System.out.print("E");
		}
		if(poeng<40 && poeng>=0) {
			System.out.print("F");
		}
		if(poeng>100 || poeng<0) {
			System.out.print("ugyldig poengsum");
		}
	}

}
