import javax.swing.JOptionPane;
public class KalkulyatorGUI {
	public static void main(String[] args) {
		String d1 = JOptionPane.showInputDialog("Введіть перше число:");
		double c1 = Double.parseDouble(d1);
		String d2 = JOptionPane.showInputDialog("Введіть друге число:");
		double c2 = Double.parseDouble(d2);
		String dija = JOptionPane.showInputDialog("Введіть дію (+-*/)...");
		double rez = 0;

		if(dija.equals("/") && c2==0) {
			String pomylka = String.format("Ай-ай, ділити на нуль не можна!");
			JOptionPane.showMessageDialog(null, pomylka, "ПОМИЛКА!", JOptionPane.PLAIN_MESSAGE);
			return;
		}
		if(dija.equals("+")) {
			rez = c1 + c2;
		} else if(dija.equals("-")) {
			rez = c1 - c2;
		} else if(dija.equals("*")) {
			rez = c1 * c2;
		} else if(dija.equals("/")) {
			rez = c1 / c2;
		}
		String rezultat = String.format("Результат обрахунку: %s", rez);
		JOptionPane.showMessageDialog(null, rezultat, "РЕЗУЛЬТАТ", JOptionPane.PLAIN_MESSAGE);
	}
}
