
public class LogichniOperatory {

	public static void main(String[] args) {
		
		int zoloto = 1, sriblo = 2, bronza = 1;
		System.out.println("Загальна кількість медалей:" + (zoloto+sriblo+bronza));
		
		// чи має наша збірна всі три види медалей (золото, срібло, бронза)
		if (zoloto > 0 && sriblo > 0 && bronza > 0)
		{
			System.out.println("У вас є медалі всіх трьох типів");
		}
		// чи має наша збірна хоча б одну медаль
		if (zoloto > 0 || sriblo > 0 || bronza > 0)
		{
			System.out.println("У вас як мінімум одна медаль");
		}
	}	
}