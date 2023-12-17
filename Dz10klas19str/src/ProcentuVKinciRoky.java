
public class ProcentuVKinciRoky {

	public static void main(String[] args) {
		int Vklad = 2000;//сума вклада
		int ddr = 245;//днів до кінця року
		double p = 0.11;// % в день від 40% річних
		System.out.print("Отримає за 245 днів: ");
		System.out.println(245*(2000*0.11) +" грн");
		System.out.print("Отримає за 245 днів: ");
		System.out.print(ddr*(Vklad*p) +" грн");
		for(int w = 0; w<246; w++) {
			System.out.print("Отримає в "+ w +" день: ");
			System.out.println((2000*0.11) +" грн");
		}
		System.out.print("Отримає за 245 днів: ");
		System.out.println(ddr*(Vklad*p) +" грн");
	}
}
