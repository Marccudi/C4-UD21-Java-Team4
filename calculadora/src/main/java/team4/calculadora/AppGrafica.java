package team4.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

//import team4.tm04.Funciones;

import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AppGrafica {

	private JFrame frmMoneda;
	
	private static JLabel moneda1;
	private static JLabel moneda2;
	
	private JComboBox selecMoneda1;
	private JComboBox selecMoneda2;
	private JLabel simbolo1;
	private JLabel simbolo2;

	/**
	 * Create the application.
	 */
	public AppGrafica() {
		initialize();
		frmMoneda.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMoneda = new JFrame();
		frmMoneda.setTitle("Moneda");
		frmMoneda.setBounds(100, 100, 542, 423);
		frmMoneda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton ButtonDel = new JButton("Del");
		ButtonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=moneda1.getText();
				if(num.length()==1) {
					moneda1.setText("0");
				}else {
					moneda1.setText(num.substring(0, num.length()-1));
				}
				cambio();
				
			}
		});
		ButtonDel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ButtonDel.setBackground(Color.LIGHT_GRAY);
		
		JButton ButtonCE = new JButton("CE");
		
		ButtonCE.setFont(new Font("Tahoma", Font.PLAIN, 26));
		ButtonCE.setBackground(Color.LIGHT_GRAY);
		
		JButton Button9 = new JButton("9");
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button9.setBackground(Color.WHITE);
		
		JButton Button6 = new JButton("6");
		Button6.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button6.setBackground(Color.WHITE);
		
		JButton Button3 = new JButton("3");
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button3.setBackground(Color.WHITE);
		
		JButton ButtonComa = new JButton(",");
		ButtonComa.setBackground(Color.WHITE);
		ButtonComa.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JButton Button8 = new JButton("8");
		Button8.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button8.setBackground(Color.WHITE);
		
		JButton Button7 = new JButton("7");
		Button7.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button7.setBackground(Color.WHITE);
		
		JButton Button5 = new JButton("5");
		Button5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button5.setBackground(Color.WHITE);
		
		JButton Button2 = new JButton("2");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button2.setBackground(Color.WHITE);
		
		JButton Button0 = new JButton("0");
		Button0.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button0.setBackground(Color.WHITE);
		
		JButton Button4 = new JButton("4");
		Button4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button4.setBackground(Color.WHITE);
		
		JButton Button1 = new JButton("1");
		
		Button1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Button1.setBackground(Color.WHITE);
		
		JPanel panelMon1 = new JPanel();
		
		JPanel panelMon2 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmMoneda.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelMon1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
							.addComponent(Button7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelMon2, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Button4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(ButtonCE, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ButtonDel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Button8, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Button9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Button5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Button6, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Button2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Button3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(368, Short.MAX_VALUE)
					.addComponent(Button0, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ButtonComa, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(ButtonDel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(ButtonCE, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Button9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button7, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Button6, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button5, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(Button3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addComponent(Button2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(Button0, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addComponent(ButtonComa, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
								.addComponent(Button1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panelMon1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panelMon2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		selecMoneda2 = new JComboBox();
		
		moneda2 = new JLabel("0");
		moneda2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		simbolo2 = new JLabel("$");
		simbolo2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panelMon2 = new GroupLayout(panelMon2);
		gl_panelMon2.setHorizontalGroup(
			gl_panelMon2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMon2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelMon2.createParallelGroup(Alignment.LEADING)
						.addComponent(moneda2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addGroup(gl_panelMon2.createSequentialGroup()
							.addComponent(selecMoneda2, 0, 183, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panelMon2.createSequentialGroup()
							.addComponent(simbolo2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panelMon2.setVerticalGroup(
			gl_panelMon2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelMon2.createSequentialGroup()
					.addContainerGap()
					.addComponent(moneda2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(simbolo2)
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addComponent(selecMoneda2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelMon2.setLayout(gl_panelMon2);
		
		selecMoneda1 = new JComboBox();
		rellenaCombobox(selecMoneda1);
		rellenaCombobox(selecMoneda2);
		
		moneda1 = new JLabel("0");
		moneda1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		simbolo1 = new JLabel("$");
		simbolo1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panelMon1 = new GroupLayout(panelMon1);
		gl_panelMon1.setHorizontalGroup(
			gl_panelMon1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelMon1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelMon1.createParallelGroup(Alignment.TRAILING)
						.addComponent(moneda1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panelMon1.createSequentialGroup()
							.addComponent(selecMoneda1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panelMon1.createSequentialGroup()
							.addComponent(simbolo1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panelMon1.setVerticalGroup(
			gl_panelMon1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelMon1.createSequentialGroup()
					.addContainerGap()
					.addComponent(moneda1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(simbolo1)
					.addGap(27)
					.addComponent(selecMoneda1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelMon1.setLayout(gl_panelMon1);
		frmMoneda.getContentPane().setLayout(groupLayout);
		
		//CE
		ButtonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moneda1.setText("0");
				cambio();
			}
		});
		
		
		//Botones numero
		Button1.addActionListener(e -> botonNum("1"));
		Button2.addActionListener(e -> botonNum("2"));
		Button3.addActionListener(e -> botonNum("3"));
		Button4.addActionListener(e -> botonNum("4"));
		Button5.addActionListener(e -> botonNum("5"));
		Button6.addActionListener(e -> botonNum("6"));
		Button7.addActionListener(e -> botonNum("7"));
		Button8.addActionListener(e -> botonNum("8"));
		Button9.addActionListener(e -> botonNum("9"));
		Button0.addActionListener(e -> botonNum("0"));
		ButtonComa.addActionListener(e -> botonNum("."));

		// ComboBoxes listeners
		selecMoneda1.addActionListener(e -> selecMoneda(e));
		selecMoneda2.addActionListener(e -> selecMoneda(e));
	}
	
	private void botonNum(String n) {
		if(moneda1.getText()=="0") {
			moneda1.setText(n);
			cambio();
		}else {
			if (moneda1.getText().length()>11) {
				//FALTA
			} else {
				String moneda=moneda1.getText();
				moneda+= n;
				moneda1.setText(moneda);	
				cambio();
			}
		}	
	}
	
	public static void rellenaCombobox(JComboBox<Divisa> combo) {

        Metodos.generarDivisas();
        ArrayList<Divisa> arrayList = Metodos.devolverDivisas();

        if (arrayList != null && arrayList.size() > 0) {
            for (Divisa divisa : arrayList) {
                combo.addItem(divisa);
            }
        }
    }
	
	public void selecMoneda(ActionEvent e) {
		Divisa d;
        if(e.getSource() == selecMoneda1) {
        	d = (Divisa) selecMoneda1.getSelectedItem();
            simbolo1.setText(d.simbolo);
            cambio();
        } else if(e.getSource() == selecMoneda2) {
        	d = (Divisa) selecMoneda2.getSelectedItem();
            simbolo2.setText(d.simbolo);
            cambio();
        }
        
    }

	public void cambio() {
		Divisa d1;
		Divisa d2;
		d1 = (Divisa) selecMoneda1.getSelectedItem();
		d2 = (Divisa) selecMoneda2.getSelectedItem();
		moneda2.setText(""+Metodos.cambio(Double.parseDouble(moneda1.getText()), d1.getId(), d2.getId()));
	}
	
}
