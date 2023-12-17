import java.util.Scanner;

public class LogichniOperatory2 {

	public static void main(String[] args) {
		System.out.println("Введіть свій вік: ");
		Scanner s = new Scanner (System.in);
		int vik = s.nextInt();
		
		if (vik > 120){
			System.out.println("Щось вам підозріло багато років");
		}
	}

}
