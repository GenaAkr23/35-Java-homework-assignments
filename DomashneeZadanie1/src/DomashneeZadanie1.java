
public class DomashneeZadanie1 {

	public static void main(String [] args)
	{
		int tsena_telefon = 300;
		int tsena_noutbook = 1000;
		int tsena_televizor = 700;
		
		int doxod = 1000;
		
		if (doxod == tsena_telefon)
		{
			System.out.println("Можу купити телефон");
		}
		else if (doxod == tsena_noutbook)
		{
			System.out.println("Можу купити ноутбук");
		}
		else if (doxod == tsena_televizor)
		{
			System.out.println("Можу купити телевизор");
		}
		else
		{
			System.out.println("Буду вчитись и накопичивати");
		}
	}
}
