import java.time.DayOfWeek;
import java.time.LocalDateTime;;
public class DomashneZavdannyaEnum1 {

	public static void main(String[] args) {
		switch (getDniTyjnya()){
		case RDNI:
			System.out.println("Ви сегодня працюєте");
			break;
		case VDNI:
			System.out.println("Ви сегодня на відпочінку");
			break;
		default:
			System.out.println("Я не знаю, що це за день");
			break;
		}

	}
	
	public static DniTyjnya getDniTyjnya()
	{
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek dt = now.getDayOfWeek();
		switch(dt){
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			return DniTyjnya.RDNI;
		case SATURDAY:
		case SUNDAY:
			return DniTyjnya.VDNI;
		default:
			return DniTyjnya.NEMADNYA;
		}
		
	}

}
