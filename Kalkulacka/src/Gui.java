import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame {

	private JLabel vysledekLab;
	private JButton sectiBut1;
	private JButton odectiBut;
	private JButton vynasobBut;
	private JButton vydelBut;
	private JTextField cislo1Field;
	private JTextField cislo2Field;
	private JPanel panel1;
	private JPanel panel2;

	public Gui() {
		super("Kalkulaèka");
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		Color barva = new Color(100, 85, 245);

		panel1 = new JPanel();
		panel1.setBackground(Color.RED);
		add(panel1);

		panel2 = new JPanel();
		panel2.setBackground(barva);
		add(panel2);

		cislo1Field = new JTextField("", 8);
		add(cislo1Field);
		panel1.add(cislo1Field);

		cislo2Field = new JTextField("", 8);
		add(cislo2Field);
		panel1.add(cislo2Field);

		sectiBut1 = new JButton("Seèti");
		panel1.add(sectiBut1);
		sectiBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double prvniCislo = Double.parseDouble(cislo1Field.getText());
				double druheCislo = Double.parseDouble(cislo2Field.getText());
				double vysledek = prvniCislo + druheCislo;
				vysledekLab.setText("Výsledek je: " + vysledek);
			};
		});
		odectiBut = new JButton("Odeèti");
		panel1.add(odectiBut);
		odectiBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double prvniCislo = Double.parseDouble(cislo1Field.getText());
				double druheCislo = Double.parseDouble(cislo2Field.getText());
				double vysledek = prvniCislo - druheCislo;
				vysledekLab.setText("Výsledek je: " + vysledek);
			};
		});
		vynasobBut = new JButton("Vynýsobit");
		panel1.add(vynasobBut);
		vynasobBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double prvniCislo = Double.parseDouble(cislo1Field.getText());
				double druheCislo = Double.parseDouble(cislo2Field.getText());				double vysledek = prvniCislo * druheCislo;
				vysledekLab.setText("Výsledek je: " + vysledek);
			};
		});
		vydelBut = new JButton("Vydìl");
		panel1.add(vydelBut);
		vydelBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double prvniCislo = Double.parseDouble(cislo1Field.getText());
				double druheCislo = Double.parseDouble(cislo2Field.getText());
				double vysledek = prvniCislo / druheCislo;
				vysledekLab.setText("Výsledek je: " + vysledek);
			};
		});

		vysledekLab = new JLabel("Výsledek je: ");
		panel2.add(vysledekLab);

	}

	public static void main(String[] args) {
		Gui window = new Gui();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(600, 350);
		window.setLocationRelativeTo(null);
	}
}