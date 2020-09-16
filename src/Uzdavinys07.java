import java.util.Scanner;

public class Uzdavinys07 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite saldainiu skaiciu: ");
		int m = reader.nextInt();
		System.out.println("Iveskite devintoku skaiciu: ");
		int n = reader.nextInt();
		int s = m / n;
		int k = m % n;
		System.out.println("--------------------------------------------------");
		System.out.println("Kiekvienas devintokas gavo po: " + s + " saldaini/ius.");
		System.out.println("Mokytojai liko: " + k + " saldainiai/iu.");
		reader.close();
		
	}

}
