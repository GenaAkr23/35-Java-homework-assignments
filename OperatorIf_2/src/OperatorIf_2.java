
public class OperatorIf_2 {
	
	public static void main(String [] args)
	{
		int tsina_tavria = 10000;
		int tsina_audi = 50000;
		int tsina_ferrari = 200000;
		
		int zarplata = 500000;
		
		if (zarplata >= tsina_tavria) // якщо (...), то {...}
		{
			System.out.println("Я можу купити Таврію");
		}
		else if (zarplata >= tsina_audi) // якщо (...), то {...}
		{
			System.out.println("Я можу купити Audi");
		}
		else if (zarplata >= tsina_ferrari) // якщо (...), то {...}
		{
			System.out.println("Я можу купити Ferrari");
		}
		else // в будь-якому іншому випадку {...}
		{
			System.out.println("Я буду їздити на автобусі");
		}
	}
	
	
}
