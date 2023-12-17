
public class Komposycija {

	      public static void main(String[] args) {
		  Data dn = new Data (1,1,2001);
		  Address a = new Address ("Україна","Львівська", "м. Золочів", "вул. Небесної Сотні", 18, 2);
		  Client c = new Client ("Педро", dn, a);
		  System.out.printf("%s", c);

	}

}
