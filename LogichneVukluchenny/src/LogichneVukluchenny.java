

public class LogichneVukluchenny {

	public static void main(String[] args) {

		int a = 5, b = 10;
		if (a == 5 ^ b == 10)
		{
			System.out.println("так");
		}
		else
		{
			System.out.println("ні");
		}
		{
			System.out.println(!(5 > 4));
		}
			// a && b - логічне "і" - обидва елементи повинні бути істиною
		// a & b -  логічне "і" - обидва елементи повинні бути істиною
		// a || b - логічне або - хоча б один елемент повинен бути істиною
		// a | b  - логічне або - хоча б один елемент повинен бути істиною
		// a ^ b  - логічне двійкове виключення
		//		(один з елементів має бути істиною, і один має бути брехнею
		// !a     - логічне НЕ, або ж "інверсія"
		//      (перетворює булеве значення справа від себе на протилежне)
	}
	

}