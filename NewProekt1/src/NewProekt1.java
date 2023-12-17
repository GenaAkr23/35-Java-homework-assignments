import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewProekt1 {
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewProekt1 window = new NewProekt1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NewProekt1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCountry = new JLabel("Країна");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCountry.setBounds(49, 43, 46, 14);
		frame.getContentPane().add(lblCountry);

		JLabel lblFlag = new JLabel("");
		lblFlag.setBounds(119, 72, 217, 109);
		frame.getContentPane().add(lblFlag);

		JComboBox cbxCountry = new JComboBox();
		
		cbxCountry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String val = cbxCountry.getSelectedItem().toString();
				countryComboBoxChanger(val, lblFlag);
				
			}
		});

		String[] countries = new String[] {"-Виберіть-", "Бельгія", "Британія", "Іспанія", "Україна"};
		for (int i = 0; i < countries.length; i++) {
			cbxCountry.addItem(countries[i]);
		}
		cbxCountry.setBounds(119, 41, 217, 20);
		frame.getContentPane().add(cbxCountry);
	}

	private void countryComboBoxChanger(String val, JLabel lblFlag) {
		switch (val) {
			case "-Виберіть-":
				setImageToLabel(lblFlag, "blark.png");
				break;
			case "Бельгія":
				setImageToLabel(lblFlag, "belgium.png");
				break;
			case "Британія":
				setImageToLabel(lblFlag, "britan.png");
				break;
			case "Іспанія":
				setImageToLabel(lblFlag, "ispan.png");
				break;
			case "Україна":
				setImageToLabel(lblFlag, "ukraunian.png");
				break;
		}
	}

	private void setImageToLabel(JLabel lbl, String imgName) {
		java.net.URL imgUrl = this.getClass().getResource("img/" + imgName);
		Icon imag = new ImageIcon(imgUrl);
		lbl.setIcon(imag);
	}
}

