import java.util.Scanner;

public class Kalculator {
	public static void main (String [] args)
	{
		Scanner vidKorystuvacha = new Scanner (System.in);		
		double chislo1, chislo2, rezultat;
		String diya;
		
		System.out.println("Введіть перше число ...");
		chislo1 = Double.parseDouble(vidKorystuvacha.nextLine());
		
		System.out.println("Введіть друге число ...");
		chislo2 = Double.parseDouble(vidKorystuvacha.nextLine());
		
		System.out.println("Введіть дію (+-*/):");
		diya = vidKorystuvacha.nextLine();
		
		if (diya.equals("/") && chislo2 == 0)
		{
			System.out.println("Ай-ай, на нуль ділити не можна");
			return;
		}
		
		// if (chislo1 == 1)
		if (diya.equals("+") || diya.equals("додавання"))
		{
			rezultat = chislo1 + chislo2;
		}
		else if (diya.equals("-") || diya.equals("віднімання"))
		{
			rezultat = chislo1 - chislo2;
		}
		else if (diya.equals("*") || diya.equals("множення"))
		{
			rezultat = chislo1 * chislo2;
		}
		else if (diya.equals("/") || diya.equals("ділення"))
		{
			rezultat = chislo1 / chislo2;
		}
		else
		{
			rezultat = 0;
		}
		
		System.out.println("Результат: " + rezultat);
		
	}	
}
