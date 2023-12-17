import java.time.DayOfWeek;
import java.time.LocalDateTime;
public class DomashneZavdanya6Ychenika {
	public static void main(String[] args) {
		  
		switch (get_DenTyzhnya()) {

		case MONDAY:
		 System.out.println("Блін... Уже понеділок...");
		 break;

		case TUESDAY:
		 System.out.println("Блін... Уже вівторок ... ");
		 break;

		case WEDNESDAY:
		 System.out.println("Блін... Уже середа... ");
		 break;
		 
		case THURSDAY:
		 System.out.println("Блін... Уже четвер... ");
		 break;
		 
		case FRIDAY:
		 System.out.println("Блін... Уже пятниця... ");
		 break;
		 
		case SATURDAY:
		 System.out.println("Блін... Уже субота... ");
		 break;

		case SUNDAY:
		 System.out.println(" Блін... Уже  неділя... ");
		 break;

		default:
		 System.out.println(" не дамся вузвідати! ");
		 break;
		}
	}
	
	public static Zz58_1_DZ_Enum get_DenTyzhnya()
	{
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek dow =now.getDayOfWeek();

		switch (dow) {

		case MONDAY:
			return Zz58_1_DZ_Enum.MONDAY;

		case TUESDAY: 
			return Zz58_1_DZ_Enum.TUESDAY;

		case WEDNESDAY:
			return Zz58_1_DZ_Enum.WEDNESDAY;

		case THURSDAY:
			return Zz58_1_DZ_Enum.THURSDAY;

		case FRIDAY:
			return Zz58_1_DZ_Enum.FRIDAY;

		case SATURDAY:
			return Zz58_1_DZ_Enum.SATURDAY;

		case SUNDAY:
			return Zz58_1_DZ_Enum.SUNDAY;

		default:
			return Zz58_1_DZ_Enum.NEVIDOMO;

		}

	}

}
