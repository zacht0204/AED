package cleanersa;

import java.awt.EventQueue;

import javax.swing.JDialog;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Toolkit;

public class AcercadeTienda extends JDialog implements ActionListener {
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblGeraldineBustamante;
	private JLabel lblJuanaBustamante;
	private JLabel lblAutores;
	private JButton btnCerrar;
	private JLabel lblMaribelIbaez;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercadeTienda dialog = new AcercadeTienda();
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
	public AcercadeTienda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AcercadeTienda.class.getResource("/imagenes/favicon.png")));
		setTitle("Acerca de Digesma S.A.");
		getContentPane().setBackground(new Color(255, 228, 225));
		//gui
		setBounds(100, 100, 500, 400);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Cleaner  v. 1.0");
		lblTienda.setForeground(new Color(255, 255, 255));
		lblTienda.setFont(new Font("Narkisim", Font.BOLD, 25));
		lblTienda.setBounds(161, 11, 210, 50);
		getContentPane().add(lblTienda);
		
		separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(0, 52, 484, 16);
		getContentPane().add(separator);
		
		lblGeraldineBustamante = new JLabel("Diego Pacheco");
		lblGeraldineBustamante.setForeground(new Color(255, 255, 255));
		lblGeraldineBustamante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		lblGeraldineBustamante.setBounds(245, 127, 155, 23);
		getContentPane().add(lblGeraldineBustamante);
		
		lblJuanaBustamante = new JLabel("Geraldine  Bustamante");
		lblJuanaBustamante.setForeground(new Color(255, 255, 255));
		lblJuanaBustamante.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		lblJuanaBustamante.setBounds(218, 153, 182, 23);
		getContentPane().add(lblJuanaBustamante);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setForeground(new Color(255, 255, 255));
		lblAutores.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAutores.setBounds(254, 72, 64, 50);
		getContentPane().add(lblAutores);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(AcercadeTienda.class.getResource("/imagenes/Salida2.png")));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCerrar.setBounds(250, 249, 121, 32);
		getContentPane().add(btnCerrar);
		
		lblMaribelIbaez = new JLabel("Maribel Iba\u00F1ez");
		lblMaribelIbaez.setForeground(new Color(255, 255, 255));
		lblMaribelIbaez.setFont(new Font("Monotype Corsiva", Font.PLAIN, 20));
		lblMaribelIbaez.setBounds(245, 179, 155, 23);
		getContentPane().add(lblMaribelIbaez);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AcercadeTienda.class.getResource("/imagenes/cleanerv1.0.png")));
		lblNewLabel.setBounds(-16, -38, 500, 400);
		getContentPane().add(lblNewLabel);

	}
	public void actionPerformed(ActionEvent arg0) {
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
	
	}


