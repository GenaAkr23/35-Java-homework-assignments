import java.util.Scanner;

public class DomashneeZadanie {

	public static void main(String[] args) {
		System.out.println("Введить свій номер:");
		Scanner skan = new Scanner(System.in);
		int id = skan.nextInt();
		System.out.println("Ваша скідка%: " + ((id > 500 && id < 1000) ? 7 : 5));

	}

}
