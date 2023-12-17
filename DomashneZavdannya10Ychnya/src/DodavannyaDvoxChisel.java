import javax.swing.JOptionPane;
public class DodavannyaDvoxChisel {
	public static void main(String[] args) {

		String chusloA = JOptionPane.showInputDialog("Bведіть перше ціле число");
		int a = Integer.parseInt(chusloA);
		String chusloB = JOptionPane.showInputDialog("Введіть друге ціле число");
		int b = Integer.parseInt(chusloB);
		//String dodavanya = String.format("Програма, котра додає два числа %s та %s", a,b);

		//JOptionPane.showMessageDialog(null, dodavanya, "Результат додавання двох чисел. Нажмить: Ок", JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog(null, a+b, "Результат додавання двох чисел", JOptionPane.INFORMATION_MESSAGE );

	}
}
