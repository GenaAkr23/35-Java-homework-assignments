
public class RelationalOperators {

	public static void main(String[] args) {
		
		// >  : більше ніж          5>3
		// <  : менше ніж           7<15
		// == : дорівнює            2==2
		// != : не дорівнює         3!=5
		// >= : більше або дорівнює 4>=1
		// <= : менше або дорівнює  9<=9
		
		int chislo = 7;
		// більше
		if (chislo>5){
			System.out.println("> : Число більше ніж 5");
		} else {
			System.out.println("> : Число НЕ більше ніж 5");
		}
		
		// менше
		if (chislo<11){
			System.out.println("< : Число менше ніж 11");
		} else {
			System.out.println("< : Число НЕ менше ніж 11");
		}
		
		// дорівнює
		if (chislo == 10){
			System.out.println("== : Число дорівнює 10");
		} else {
			System.out.println("== : Число НЕ дорівнює 10");
		}
		
		// НЕ дорівнює (оператор перевірки нерівності)
		// повертає TRUE (істину) якщо об`єкти неоднакові, і FALSE - якшо однакові
		if (chislo != 9){
			System.out.println("!= : Число НЕ дорівнює 9");
		} else {
			System.out.println("!= : Число  дорівнює 9");
		}
		
		// більше/рівно
		if (chislo >= 8){
			System.out.println(">= : Число  більше-або-дорівнює 8");
		} else {
			System.out.println(">= : Число НЕ більше-або-дорівнює 8");
		}
		
		// менше/рівно
		if (chislo <= 20){
			System.out.println("<= : Число  менше-або-дорівнює 20");
		} else {
			System.out.println("<= : Число НЕ менше-або-дорівнює 20");
		}
	}

}
