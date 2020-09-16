import java.util.Scanner;

public class Uzdavinys10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite, kuria valanda prasides filmas: ");
		int h = reader.nextInt();
		System.out.println("Iveskite, kuria minute prasides filmas: ");
		int min = reader.nextInt();
		System.out.println("Iveskite, kiek valandu truks filmas ");
		int h1 = reader.nextInt();
		System.out.println("Iveskite, kiek minuciu truks filmas ");
		int min1 = reader.nextInt();
		int a = h*60 + min;
		int b = h1*60 + min1;
		int ph = (a + b + 30)/60;
		int pmin = (a + b + 30)%60;
		System.out.println("--------------------------------------------------");
		System.out.println("Ivesta: Filmo pradzia " + h + ":" + min + ", trukme " + h1 + ":" + min1 + ".");
		System.out.println("Gauta: Filmas pasibaigs " + ph + ":" + pmin + ".");
		reader.close();

	}

}
