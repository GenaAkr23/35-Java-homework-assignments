
public class Address {
	 String kraina;
	 String oblast;
	 String nasPunkt;
	 String vulycja;
	 int budynok;
	 int kvartyra;
	 
	 public Address (String kr, String o, String np, String v, int b, int kv)
	 {
	  this.kraina = kr;
	  this.oblast = o;
	  this.nasPunkt = np;
	  this.vulycja = v;
	  this.budynok = b;
	  this.kvartyra = kv;
	 }
	 
	 public String toString ()
	 {
	 return String.format("%s, %s область, %s, %s, %s/%s", kraina, oblast, nasPunkt, vulycja, budynok, kvartyra);
	 }
}
