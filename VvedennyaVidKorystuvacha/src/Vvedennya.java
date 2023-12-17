import java.util.Scanner;

public class Vvedennya {

	public static void main(String[] args) {
		
		System.out.println("Введіть рік свого народження");
		Scanner mijSkaner = new Scanner(System.in);
		
		int vik = 2023 - mijSkaner.nextInt();
		
		System.out.print("Ваш вік: ");
		System.out.print(vik);
		System.out.print(" років");
		
	}

}
