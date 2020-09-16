import java.util.Scanner;

public class Uzdavinys11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite, kiek valandu rodo laikrodis: ");
		int h = reader.nextInt();
		System.out.println("Iveskite, kiek minuciu rodo laikrodis: ");
		int m = reader.nextInt();
		System.out.println("Iveskite, kiek sekundziu rodo laikrodis: ");
		int s = reader.nextInt();
		int sekundes5 = (h*60*60)+(m*60)+s+5;
	    int atsh = sekundes5/60/60;
	    int atsm = sekundes5/60;
	    int t = sekundes5 - (atsh*60*60);
	    int atsm1 = t/60;
	    int atss = sekundes5 - (atsh*60*60) - (atsm1*60);
		System.out.println("--------------------------------------------------");
		System.out.println("Ivesta: " + h + ":" + m + ":" + s);
		System.out.println("Po penkiu sekundziu laikrodis rodys: " + atsh + ":" + atsm1 + ":" + atss);
		reader.close();

	}

}
