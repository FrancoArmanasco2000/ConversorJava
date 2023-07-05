package Alura;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<String> lista;
	JLabel l1;
	JButton next;
	JToggleButton oscuro;
	boolean modo = false;
	
	public VentanaPrincipal() {
		this.getContentPane().setLayout(null);
		this.setSize(400,250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Menu principal");
		this.getContentPane().setBackground(Color.WHITE);
		this.iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		l1 = new JLabel("Seleccionar sistema de conversion");
		l1.setBounds(90, 60, 200, 10);
		l1.setForeground(Color.BLACK);
		
		oscuro = new JToggleButton("Modo oscuro");
		oscuro.setBounds(10, 10, 110, 25);
		oscuro.addActionListener(this);
		oscuro.setBackground(Color.WHITE);
		oscuro.setForeground(Color.BLACK);
		
		
		lista = new JComboBox<String>();
		lista.setBounds(115,90,148,20);
		lista.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione","Divisas","Temperaturas"}));
		lista.setBackground(Color.WHITE);
		lista.setForeground(Color.BLACK);
		
		next = new JButton("Siguiente");
		next.setBounds(146, 130, 88, 25);
		next.addActionListener(this);
		next.setBackground(Color.WHITE);
		next.setForeground(Color.BLACK);
		
	
		this.add(oscuro);
		this.add(next);
		this.add(lista);
		this.add(l1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
			if(lista.getSelectedItem()=="Divisas") {
				this.setVisible(false);
				MenuMoneda mm = new MenuMoneda(modo);
				mm.setVisible(true);
			}else if(lista.getSelectedItem()=="Temperaturas"){
				this.setVisible(false);
				MenuTemperatura mt = new MenuTemperatura(modo);
				mt.setVisible(true);
			}
		}
		
		if(e.getSource()==oscuro) {
			if(oscuro.isSelected()) {
				next.setBackground(Color.GRAY);
				next.setForeground(Color.WHITE);
				
				lista.setBackground(Color.GRAY);
				lista.setForeground(Color.WHITE);
				
				l1.setForeground(Color.WHITE);
				
				oscuro.setBackground(Color.GRAY);
				oscuro.setForeground(Color.WHITE);
				oscuro.setText("Modo claro");
				
				this.getContentPane().setBackground(Color.DARK_GRAY);
				this.modo = true;
			} else {
				next.setBackground(Color.WHITE);
				next.setForeground(Color.BLACK);
				
				lista.setBackground(Color.WHITE);
				lista.setForeground(Color.BLACK);
				
				l1.setForeground(Color.BLACK);
				
				oscuro.setBackground(Color.WHITE);
				oscuro.setForeground(Color.BLACK);
				oscuro.setText("Modo oscuro");
				
				this.getContentPane().setBackground(Color.WHITE);
				this.modo = false;
			}
			
		}

	}

	
	
	
	
}
