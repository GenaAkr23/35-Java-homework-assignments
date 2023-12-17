import javax.swing.JOptionPane;
public class DodavannyaDvoxChisel {
	public static void main(String[] args) {
		  String pershe = JOptionPane.showInputDialog("Введіть будь-яке перше число");
		  String druge = JOptionPane.showInputDialog("Введіть будь-яке друге число");
		  
		  Double a = Double.parseDouble(pershe);
		  Double b = Double.parseDouble(druge);
		  
		  JOptionPane.showMessageDialog(null, a+b, "Результат додавання", JOptionPane.PLAIN_MESSAGE);
		 }
}
