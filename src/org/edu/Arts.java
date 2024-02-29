package org.edu;

public class Arts extends Education {

	
	
	private void bSc() {
		System.out.println("bSc..70%");
	}	

	
	private void bEd() {
		System.out.println("Bed.....80%");
	}
	private void bA() {
	System.out.println("bA...90%");
	}
	private void bBA() {
	System.out.println("bBA....92%");
	}
	public void ug() {
		System.out.println("ug....95");
	}
	public void pg() {
	System.out.println("pg....97");
	}
	public static void main(String[] args) {
		
		
		Arts a=new Arts();
		
		a.bSc();
		a.bEd();
		a.bA();
		a.bBA();
		a.ug();
		a.pg();
		
		
		
	}
	
	
	
	
	
}
