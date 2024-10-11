package fr.fms;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class panelCustomer {
	private JTextField fieldLastName;
	private JTextField fieldFirstName;
	private JTextField fieldMail;

	public panelCustomer() {

		JFrame frame = new JFrame("F.M.S Bank");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setSize(588, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame frameCreateCustomer = new JFrame("Nouveau Client");
		frameCreateCustomer.setSize(500, 320);
		frameCreateCustomer.getContentPane().setLayout(null);

		JLabel labelLastName = new JLabel("Nom");
		labelLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelLastName.setBounds(115, 103, 45, 13);
		frameCreateCustomer.getContentPane().add(labelLastName);

		JLabel labelFirstName = new JLabel("Prénom");
		labelFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelFirstName.setBounds(115, 126, 77, 31);
		frameCreateCustomer.getContentPane().add(labelFirstName);

		fieldLastName = new JTextField();
		fieldLastName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		fieldLastName.setBounds(195, 102, 150, 19);
		frameCreateCustomer.getContentPane().add(fieldLastName);
		fieldLastName.setColumns(10);

		fieldFirstName = new JTextField();
		fieldFirstName.setBounds(195, 134, 150, 19);
		frameCreateCustomer.getContentPane().add(fieldFirstName);
		fieldFirstName.setColumns(10);

		JLabel labelMail = new JLabel("Mail");
		labelMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelMail.setBounds(115, 167, 45, 13);
		frameCreateCustomer.getContentPane().add(labelMail);

		fieldMail = new JTextField();
		fieldMail.setBounds(195, 166, 150, 19);
		frameCreateCustomer.getContentPane().add(fieldMail);
		fieldMail.setColumns(10);

		JLabel labelTitle = new JLabel("Créer un client");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelTitle.setBounds(143, 62, 187, 31);
		frameCreateCustomer.getContentPane().add(labelTitle);

		JPanel panel = new JPanel();
		panel.setBounds(115, 210, 264, 31);
		frameCreateCustomer.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JButton buttonCancel = new JButton("Annuler");
		buttonCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(buttonCancel);

		JButton buttonCreate = new JButton("Créer");
		buttonCreate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(buttonCreate);

		frameCreateCustomer.setVisible(true);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new panelCustomer();
	}
}
