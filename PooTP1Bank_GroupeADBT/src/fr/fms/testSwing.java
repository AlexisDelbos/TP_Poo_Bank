package fr.fms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class testSwing {
	private JTextField textWelcome;
	private JTextPane textArea;
	private JTextField fieldLastName;
	private JTextField fieldFirstName;
	private JTextField fieldMail;

	public testSwing() {

		JFrame frame = new JFrame("F.M.S Bank");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setSize(588, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(new BorderLayout());

		// Le panel du bas contenant les boutons
		JPanel panelButtons = new JPanel();
		frame.getContentPane().add(panelButtons, BorderLayout.SOUTH);

		JButton createC = new JButton("Créer client");
		createC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frameCreateCustomer = new JFrame("Nouveau Client");
				frameCreateCustomer.setSize(500, 320);
				frameCreateCustomer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

				frameCreateCustomer.getContentPane().setLayout(new GridBagLayout());
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.insets = new Insets(5, 5, 5, 5); // Marges

				JLabel labelLastName = new JLabel("Nom");
				labelLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
				gbc.gridx = 0;
				gbc.gridy = 0;
				gbc.anchor = GridBagConstraints.EAST;
				frameCreateCustomer.getContentPane().add(labelLastName, gbc);

				fieldLastName = new JTextField();
				gbc.gridx = 1;
				gbc.fill = GridBagConstraints.HORIZONTAL; // Le champ s'étend horizontalement
				frameCreateCustomer.getContentPane().add(fieldLastName, gbc);

				JLabel labelFirstName = new JLabel("Prénom");
				labelFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
				gbc.gridx = 0;
				gbc.gridy = 1;
				gbc.fill = GridBagConstraints.NONE;
				frameCreateCustomer.getContentPane().add(labelFirstName, gbc);

				fieldFirstName = new JTextField();
				gbc.gridx = 1;
				gbc.fill = GridBagConstraints.HORIZONTAL;
				frameCreateCustomer.getContentPane().add(fieldFirstName, gbc);

				JLabel labelMail = new JLabel("Mail");
				labelMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
				gbc.gridx = 0;
				gbc.gridy = 2;
				frameCreateCustomer.getContentPane().add(labelMail, gbc);

				fieldMail = new JTextField();
				gbc.gridx = 1;
				gbc.fill = GridBagConstraints.HORIZONTAL;
				frameCreateCustomer.getContentPane().add(fieldMail, gbc);

				JButton buttonCreate = new JButton("Créer");
				gbc.gridx = 1;
				gbc.gridy = 3;
				gbc.anchor = GridBagConstraints.CENTER;
				frameCreateCustomer.getContentPane().add(buttonCreate, gbc);

				frameCreateCustomer.setVisible(true);
			}
		});
		panelButtons.add(createC);

		JButton createAccount = new JButton("Créer compte");
		panelButtons.add(createAccount);

		JButton doOperation = new JButton("Faire des opérations");
		panelButtons.add(doOperation);

		textWelcome = new JTextField();
		textWelcome.setBackground(new Color(255, 128, 192));
		textWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		textWelcome.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 26));
		textWelcome.setText("Bienvenue chez F.M.S Bank");

		frame.getContentPane().add(textWelcome, BorderLayout.NORTH);

		textArea = new JTextPane();
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.ORANGE);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 5));
		textArea.setText(
				".................................................--.................................................\r\n"
						+ "...............................................+%@@%+...............................................\r\n"
						+ "............................................:#@@@@@@@@#-............................................\r\n"
						+ "..........................................=@@@@@@@@@@@@@@=..........................................\r\n"
						+ ".......................................:*@@@@@@@@@@@@@@@@@@#:.......................................\r\n"
						+ ".....................................=%@@@@@@@@@@@@@@@@@@@@@@%=.....................................\r\n"
						+ "..................................:*@@@@@@@@@@@@@@@@@@@@@@@@@@@@*-..................................\r\n"
						+ "................................-%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%=................................\r\n"
						+ ".............................:*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#:.............................\r\n"
						+ ".. ........................:#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%-...........................\r\n"
						+ "........................:=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@+:........................\r\n"
						+ "......................-#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#-......................\r\n"
						+ "....................+%@@@@@@@@@@@%%%%@@@@@@@%@@@@@@%@@@@%%@@%@@@@%%@@@@@@@@@@@%+....................\r\n"
						+ ".................:*@@@@@@@@@@@@@#.=*+:-%@@@*.:%@@@=.+@@@--@#.*@@-:#@@@@@@@@@@@@@@#-.................\r\n"
						+ "...............=%@@@@@@@@@@@@@@@#.@@@@.*@@@.--+@@@--.-@@--@#.*#.-@@@@@@@@@@@@@@@@@@%+...............\r\n"
						+ ".... ........*@@@@@@@@@@@@@@@@@@#.....=%@@:-@+.@@@--@:-%--@#...-@@@@@@@@@@@@@@@@@@@@@@#:............\r\n"
						+ "..........-%@@@@@@@@@@@@@@@@@@@@#.@@@@-=@*......@@--@@=-:-@#.*@::#@@@@@@@@@@@@@@@@@@@@@@%-..........\r\n"
						+ ".......:+@@@@@@@@@@@@@@@@@@@@@@@#.=**=:*%:-@@@%.+@--@@@=.-@#.*@@+.+@@@@@@@@@@@@@@@@@@@@@@@@*:.......\r\n"
						+ "......:%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-......\r\n"
						+ "......:%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-......\r\n"
						+ "......:%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-......\r\n"
						+ ".......=%@%%@@@@@%%@@@%%@@%%%@@@%@@@@%%%%@@@%%@@@%%%@@%%@@@@%%@%%%%%%@@%%@@@%%%@@@%%%@@%%%%%+.......\r\n"
						+ "....................................................................................................\r\n"
						+ ".............:----===---==........-==--====---........---===---==-:.......===--===----:.............\r\n"
						+ ".............=@@@@@@@@@@@@.......-@@@@@@@@@@@@:......:@@@@@@@@@@@@=.......@@@@@@@@@@@@=.............\r\n"
						+ ".............:-#@@@@@@@@*=........-#@@@@@@@@#-........-*@@@@@@@@#-........-+@@@@@@@@#=:.............\r\n"
						+ "...............+@@@@@@@@=..........*@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=  ........+@@@@@@@@*.. .......+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........*@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@*..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........*@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........*@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........*@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@*..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........*@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ "...............+@@@@@@@@=..........+@@@@@@@@+..........+@@@@@@@@*..........-@@@@@@@@*...............\r\n"
						+ ".............:+#@@@@@@@@#+.......:+#@@@@@@@@#+........+#@@@@@@@@%+:.......+*@@@@@@@@%+:.............\r\n"
						+ ".............=@@@@@@@@@@@@.......-@@@@@@@@@@@@:......:@@@@@@@@@@@@=.......@@@@@@@@@@@@=.............\r\n"
						+ "....................................................................................................\r\n"
						+ "....................................................................................................\r\n"
						+ "........:%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%-........\r\n"
						+ "........-%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-........\r\n"
						+ "........:%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%:........\r\n"
						+ "....................................................................................................\r\n"
						+ "....:#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#-....\r\n"
						+ "....+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*....\r\n"
						+ "....+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*....\r\n"
						+ ".....==========================================================================================.....");

		// Centrer le texte
		StyledDocument doc = textArea.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);

		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new testSwing();
	}
}
