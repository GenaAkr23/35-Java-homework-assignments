import java.util.Calendar;
import java.util.GregorianCalendar;
public class DomashneZavdanya7Ychenika {
	public static void main(String[] args) {

		switch (getWeek()){
		case PONEDILOK:
			System.out.println("Тільки перший день тижня, налаштуйтесь на працю...");
			break;
		case VIVTOROK:
			System.out.println("Другий день тижня... А як добре було на вихідних");
			break;
		case SEREDA:
			System.out.println("Екватор тижня! Ще трішки попрацювати");
			break;
		case CHETVER:
			System.out.println("Скільки роботи, але завтра п'ятниця - мабуть, відкладу її на понеділок");
			break;
		case PJATNYCJA:
			System.out.println("Дотягнути б до вечора. П'ятниця - розвратниця");
			break;
		case SUBOTA:
			System.out.println("Болить голова... Йдем на пиво");
			break;
		case NEDILJA:
			System.out.println("Треба виспатись... Завтра на роботу");
			break;
		default:
			System.out.println("Невідомо, що робиться в цей день)");
		}
	}

	public static Week getWeek(){
		GregorianCalendar newCal = new GregorianCalendar( );
		int day = newCal.get( Calendar.DAY_OF_WEEK )-1; //  так зрозумів, що по цьому календарі - перший день тижня - неділя
		switch(day){
		case 1:
			return Week.PONEDILOK;
		case 2:
			return Week.VIVTOROK;
		case 3:
			return Week.SEREDA;
		case 4:
			return Week.CHETVER;
		case 5:
			return Week.PJATNYCJA;
		case 6:
			return Week.SUBOTA;
		case 7:
			return Week.NEDILJA;
		default:
			return Week.NEVIDOMYJ;
		}

	}
}
