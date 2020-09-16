import java.util.Scanner;

public class Uzdavinys09 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite, kuria valanda pakils lektuvas: ");
		int h = reader.nextInt();
		System.out.println("Iveskite, kuria minute pakils lektuvas: ");
		int min = reader.nextInt();
		System.out.println("Iveskite, skrydzio trukme (minutemis): ");
		int truk = reader.nextInt();
		int a = h*60 + min;
		int h1 = (a + truk)/60;
		int min1 = (a + truk)%60;
		System.out.println("--------------------------------------------------");
		System.out.println("Ivesta: h = " + h + ", min = " + min + ", truk = " + truk + ",");
		System.out.println("Lektuvas nusileis " + h1 + " val, " + min1 + " min");
		reader.close();
	}

}
