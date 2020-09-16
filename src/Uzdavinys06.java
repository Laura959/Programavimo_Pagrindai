import java.util.Scanner;

public class Uzdavinys06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite, kiek dienu praejo nuo metu pradzios: ");
		int dienos = reader.nextInt();
		int sav = dienos / 7;
		System.out.println("--------------------------------------------------");
		System.out.println("Ivesta: " + dienos + " dienu");
		System.out.println("Nuo metu pradzios praejo: " + sav + " savaites");
		reader.close();
	}

}
