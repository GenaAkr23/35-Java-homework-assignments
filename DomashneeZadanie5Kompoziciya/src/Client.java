
public class Client {
	 private String imja;
	 private Data dataNar;
	 private Address adresa;
	 
	 public Client(String i, Data dn, Address a)
	 {
	  this.imja = i;
	  this.dataNar = dn;
	  this.adresa = a;
	 }
	 public String toString()
	 {
	  return String.format("Клієнт %s\nДата народження %s\nАдреса проживання: %s", imja, dataNar, adresa);
	 }
}
