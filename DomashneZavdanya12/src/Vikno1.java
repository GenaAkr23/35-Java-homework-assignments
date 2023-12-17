import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Vikno1 extends JFrame{

	public Vikno1(){
		super("Друга вікона програма");
		setLayout(new FlowLayout());
		JLabel Ps;
		Ps = new JLabel("Перша строка, ");
		add(Ps);
		JLabel Ds;
		Ds = new JLabel("друга строка");
		add(Ds);
	}
}
