package Alura;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuMoneda extends JFrame implements ActionListener{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<String> seleccionA;
	JComboBox<String> seleccionB;
	JButton convertir;
	JLabel txt;
	JLabel txt2;
	JFormattedTextField numero;
	private boolean modo;

	public MenuMoneda(boolean modo) {
		this.getContentPane().setLayout(null);
		this.setSize(400,250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Conversor de divisas");
		this.modo = modo;
		this.iniciarComponentes();
		
	}
	
	private void iniciarComponentes() {
		
		txt2 = new JLabel("a");
		txt2.setBounds(188, 36, 10, 23);
		
		seleccionA = new JComboBox<String>();
		seleccionA.setBounds(70, 36, 95, 20);
		seleccionA.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione","Peso Argentino","Dolar","Euro","Libra","Yen","Won"}));
		
		
		seleccionB = new JComboBox<String>();
		seleccionB.setBounds(220, 36, 95, 20);
		seleccionB.setModel(new DefaultComboBoxModel<>(new String[] {"Seleccione","Peso Argentino","Dolar","Euro","Libra","Yen","Won"}));
		
		txt = new JLabel("Ingrese un monto:");
		txt.setBounds(95, 90, 200, 23);
		
		
		numero = new JFormattedTextField();
		numero.setBounds(205, 90, 80, 23);
		
		convertir = new JButton("Convertir");
		convertir.setBounds(150, 140, 88, 25);
		convertir.addActionListener(this);
		
		
		this.add(txt2);
		this.add(seleccionB);
		this.add(seleccionA);
		this.add(numero);
		this.add(txt);
		this.add(convertir);
		
		if(this.modo) {
			convertir.setBackground(Color.GRAY);
			convertir.setForeground(Color.WHITE);
			
			seleccionB.setBackground(Color.GRAY);
			seleccionB.setForeground(Color.WHITE);
			
			seleccionA.setBackground(Color.GRAY);
			seleccionA.setForeground(Color.WHITE);
			
			txt.setForeground(Color.WHITE);
			txt2.setForeground(Color.WHITE);
			this.getContentPane().setBackground(Color.DARK_GRAY);
		} else {
			convertir.setBackground(Color.WHITE);
			convertir.setForeground(Color.BLACK);
			
			seleccionB.setBackground(Color.WHITE);
			seleccionB.setForeground(Color.BLACK);
			
			seleccionA.setBackground(Color.WHITE);
			seleccionA.setForeground(Color.BLACK);
			
			txt.setForeground(Color.BLACK);
			txt2.setForeground(Color.BLACK);
			this.getContentPane().setBackground(Color.WHITE);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Money divisa;
		Moneda tipo = Moneda.Default;

		
		
		if(e.getSource()==convertir) {
			
			if(seleccionB.getSelectedItem()=="Dolar") {
				tipo=Moneda.Dolar;
			}else if(seleccionB.getSelectedItem()=="Euro") {
				tipo=Moneda.Euro;
			}else if(seleccionB.getSelectedItem()=="Peso Argentino") {
				tipo=Moneda.PesoArgentino;
			}else if(seleccionB.getSelectedItem()=="Yen") {
				tipo=Moneda.YenJapones;
			}else if(seleccionB.getSelectedItem()=="Won") {
				tipo=Moneda.Won;
			}else if(seleccionB.getSelectedItem()=="Libra") {
				tipo=Moneda.LibrasEsterlinas;
			}
			
			
			try {
			
				if(seleccionA.getSelectedItem()=="Peso Argentino") {
					divisa = new Money(Moneda.PesoArgentino);
					JOptionPane.showMessageDialog(null,divisa.pesoArgentinoAOtro(tipo, Double.parseDouble(numero.getText())));
					this.continuar();
				}else if(seleccionA.getSelectedItem()=="Dolar") {
					divisa = new Money(Moneda.Dolar);
					JOptionPane.showMessageDialog(null,divisa.dolarAOtro(tipo, Double.parseDouble(numero.getText())));
					this.continuar();
				}else if(seleccionA.getSelectedItem()=="Euro") {
					divisa = new Money(Moneda.Euro);
					JOptionPane.showMessageDialog(null,divisa.euroAOtro(tipo, Double.parseDouble(numero.getText())));
					this.continuar();
				}else if(seleccionA.getSelectedItem()=="Libra") {
					divisa = new Money(Moneda.LibrasEsterlinas);
					JOptionPane.showMessageDialog(null,divisa.librasAOtro(tipo, Double.parseDouble(numero.getText())));
					this.continuar();
				}else if(seleccionA.getSelectedItem()=="Yen") {
					divisa = new Money(Moneda.Won);
					JOptionPane.showMessageDialog(null,divisa.yenAOtro(tipo, Double.parseDouble(numero.getText())));
					this.continuar();
				}else if(seleccionA.getSelectedItem()=="Won") {
					divisa = new Money(Moneda.YenJapones);
					JOptionPane.showMessageDialog(null,divisa.wonAOtro(tipo, Double.parseDouble(numero.getText())));
					this.continuar();
				}
			} catch (Exception d) {
				JOptionPane.showMessageDialog(null, "Ingresa un valor numerico!","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private void continuar() {
		int val = JOptionPane.showConfirmDialog(null, "Desea continuar?","",JOptionPane.YES_NO_OPTION);
		if(val == 1) {
			this.setVisible(false);
			JOptionPane.showMessageDialog(null,"Programa terminado");
		}
	}
}
