package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class Listarmodelo extends JDialog implements ActionListener {
	private JButton btnCerrar;
	private JComboBox<String> cboModelo;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JComboBox<String> cbo;
	private JLabel lblNewLabel;
	private Object Listarmodelo;
	private Listarmodelo dialog;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listarmodelo dialog = new Listarmodelo();
					//Esta linea de codigo sirve para mostrar la GUI al centro de la pantalla
					dialog.setLocationRelativeTo(null);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Listarmodelo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Listarmodelo.class.getResource("/imagenes/favicon.png")));
		getContentPane().setBackground(new Color(255, 228, 225));
		setTitle("Listado");
		//tamaño de la gui
		setBounds(100, 100, 700, 600);
		getContentPane().setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(Listarmodelo.class.getResource("/imagenes/Salida2.png")));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCerrar.setBounds(413, 444, 130, 41);
		getContentPane().add(btnCerrar);
		
		JLabel lblModelo = new JLabel("Modelo de Papel");
		lblModelo.setForeground(Color.WHITE);
		lblModelo.setFont(new Font("Cambria", Font.BOLD, 13));
		lblModelo.setBounds(243, 26, 158, 14);
		getContentPane().add(lblModelo);
		
		JScrollPane scp = new JScrollPane();
		scp.setBounds(242, 60, 411, 380);
		getContentPane().add(scp);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Cambria", Font.PLAIN, 15));
		txtS.setBackground(new Color(70, 130, 180));
		txtS.setForeground(Color.WHITE);
		scp.setViewportView(txtS);
		
		btnNewButton_1 = new JButton("Listar");
		btnNewButton_1.setIcon(new ImageIcon(Listarmodelo.class.getResource("/imagenes/listado.png")));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(542, 17, 111, 32);
		getContentPane().add(btnNewButton_1);
		
		cbo = new JComboBox<String>();
		cbo.setFont(new Font("Cambria", Font.BOLD, 13));
		cbo.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Confort", "Secreto", "Carmin", "P\u00E9talo", "Panda"}));
		cbo.setBounds(394, 22, 111, 23);
		getContentPane().add(cbo);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Listarmodelo.class.getResource("/imagenes/listarmodelo.png")));
		lblNewLabel.setBounds(-11, -31, 705, 606);
		getContentPane().add(lblNewLabel);
		
		

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
			//THIS es para cerrar la ventana actual con la que se esta trabajando
			this.dispose();
				Tienda Tienda = new Tienda();
				Tienda.setLocationRelativeTo(null);
				Tienda.setVisible(true);}
	
	
	protected void actionPerformedBtnNewButton_1(ActionEvent arg0) {
		
		//DECLARACION DE VARIABLES
		int categoria;
		//LECUTRA DE DATOS 
		categoria=cbo.getSelectedIndex();
		
		//DENTRO DEL SWITCH INDICAMOS QUE IMPRIMA LO SOLICITADO 
		switch (categoria){
		case 0:
			txtS.setText("            	CONFORT" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad0 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas0 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño0 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio0 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock0 + "\n" + "\n" );
			txtS.append("            	SECRETO" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad1 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas1 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño1 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio1 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock1 + "\n" + "\n" );
			txtS.append("            	CARMIN" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad2 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas2 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño2 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio2 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock2 + "\n" + "\n" );
			txtS.append("            	PÉTALO" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad3 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas3 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño3 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio3 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock3 + "\n" + "\n" );
			txtS.append("            	PANDA" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad4 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas4 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño4 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio4 + "\n" );
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock4 + "\n" + "\n" );
			break;
			
			//APARTIR DE AQUI QUE IMPRIMA UNO POR UNO EL MODELO SOLICITADO	
		case 1:
			txtS.setText("            	CONFORT" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad0 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas0 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño0 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio0 + "\n");
			txtS.append("Stock disponible" +  "\t"+ ""+ ": " + Tienda.stock0 + "\n" + "\n" );
			break;
			
		case 2:
			txtS.setText("            	SECRETO" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad1 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas1 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño1 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio1 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock1 + "\n" + "\n" );
			break;
			
		case 3:
			txtS.setText("            	CARMIN" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad2 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas2 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño2 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio2 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock2 + "\n" + "\n" );
			break;
			
		case 4:
			txtS.setText("            	PÉTALO" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad3 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas3 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño3 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio3 + "\n");
			txtS.append("Stock disponible" +  "\t"+ "" + ": "+ Tienda.stock3 + "\n" + "\n" );
			break;
					
		default:
			
			txtS.setText("            	PANDA" + "\n" + "\n");
			txtS.append("Suavidad" + "\t"+ "\t" +": " + Tienda.suavidad4 + "\n");
			txtS.append("Cantidad hojas"+ "\t"+ "\t" + ": " +  Tienda.hojas4 + "\n");
			txtS.append("Tamaño de papel"+ "\t" + ": " + Tienda.tamaño4 + "\n");
			txtS.append("Precio"+ "\t" + "\t"+ ": " + Tienda.precio4 + "\n");
			txtS.append("Stock disponible" +  "\t"+ ""+ ": " + Tienda.stock4 + "\n" + "\n" );
			break;
			
	}		
	}
}