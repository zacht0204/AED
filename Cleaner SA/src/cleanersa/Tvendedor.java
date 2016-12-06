package cleanersa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.Timer;


public class Tvendedor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JLabel label;
	private JMenu mnCerrarSesin;
	private JMenuItem mntmCerrarSesin;
	private Calendar calendario;
	// Calendario
	private JLabel lblCalendario;
	private int dia, mes,año, hora, minutos, segundos;
	private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					//Esta linea de codigo sirve para mostrar la GUI al centro de la pantalla
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tvendedor() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tvendedor.class.getResource("/imagenes/favicon.png")));
		setResizable(false);
		setTitle("DIGESMA S.A. - [Vendedor]");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(176, 196, 222));
		setJMenuBar(menuBar);
		
		mnCerrarSesin = new JMenu("Archivo");
		mnCerrarSesin.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnCerrarSesin.setForeground(new Color(70, 130, 180));
		mnCerrarSesin.addActionListener(this);
		mnCerrarSesin.setIcon(new ImageIcon(Tvendedor.class.getResource("/imagenes/archivo.png")));
		menuBar.add(mnCerrarSesin);
		
		mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmCerrarSesin.setForeground(new Color(70, 130, 180));
		mntmCerrarSesin.addActionListener(this);
		mnCerrarSesin.add(mntmCerrarSesin);
		
		mnVentas = new JMenu("Ventas");
		mnVentas.setBackground(new Color(135, 206, 250));
		mnVentas.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnVentas.setForeground(new Color(70, 130, 180));
		mnVentas.setIcon(new ImageIcon(Tvendedor.class.getResource("/imagenes/money_bag.png")));
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setForeground(new Color(70, 130, 180));
		mntmVender.setBackground(new Color(176, 196, 222));
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.setForeground(new Color(70, 130, 180));
		mntmGenerarReportes.setBackground(new Color(176, 196, 222));
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCalendario = new JLabel("\r\n");
		lblCalendario.setForeground(Color.WHITE);
		lblCalendario.setBounds(773, 0, 121, 55);
		reloj();
		contentPane.add(lblCalendario);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Tvendedor.class.getResource("/imagenes/paravendedor.png")));
		label.setBounds(0, -46, 906, 633);
		contentPane.add(label);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmCerrarSesin) {
			actionPerformedMntmCerrarSesin(arg0);}
		
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);}
		
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);}
	}
	private void reloj() {
		calendario = new GregorianCalendar();
		segundos = calendario.get(Calendar.SECOND);

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent ae) {
				java.util.Date actual = new java.util.Date();
				calendario.setTime(actual);
				dia = calendario.get(Calendar.DAY_OF_MONTH);
				mes = (calendario.get(Calendar.MONTH) + 1);
				año = calendario.get(Calendar.YEAR);
				hora = calendario.get(Calendar.HOUR_OF_DAY);
				minutos = calendario.get(Calendar.MINUTE);
				segundos = calendario.get(Calendar.SECOND);
				String hour = String.format("%02d : %02d : %02d", hora,
						minutos, segundos);
				String date = String
						.format("%02d / %02d / %02d", dia, mes, año);
				lblCalendario.setText("<html><center>" + date + "<br>" + hour);
			}
		});
		timer.start();
	}
	
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		this.dispose();
		Vender2 dialog = new Vender2();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);}
	
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		this.dispose();
		GenerarReportes2 dialog = new GenerarReportes2();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);}
	
	protected void actionPerformedMntmCerrarSesin(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"Ha culminado sus ventas,Hasta pronto");
		//THIS es para cerrar la ventana actual con la que se esta trabajando
		this.dispose();
			Login frame = new Login();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);}
}
