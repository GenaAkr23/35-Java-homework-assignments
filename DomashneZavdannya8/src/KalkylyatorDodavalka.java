import javax.swing.JOptionPane;
public class KalkylyatorDodavalka {

	public static void main(String[] args) {
		
		String chislo1 = JOptionPane.showInputDialog("Введіть перше чісло");
		double c1 = Double.parseDouble(chislo1);
		String chislo2 = JOptionPane.showInputDialog("Введіть друге чісло");
		double c2 = Double.parseDouble(chislo2);
		
		//String rezultat = String.format("Результат додавання: %s %s", c1+c2, chislo1, chislo2);
		JOptionPane.showMessageDialog(null, c1+c2, "Сума чисел", JOptionPane.PLAIN_MESSAGE);
	}

}
