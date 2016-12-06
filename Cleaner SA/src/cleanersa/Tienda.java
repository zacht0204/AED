package cleanersa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Timer;

public class Tienda extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarModelo;
	private JMenuItem mntmModificarModelo;
	private JMenuItem mntmListarModelo;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuento;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfiguraarPremioSorpresa;
	private JMenuItem mntmAcercadeTienda;
	private Calendar calendario;

	// PRIMER MODELO DE PAPEL
	public static String modelo0 = "Confort";
	public static String suavidad0 = "Poco suave";
	public static int hojas0 = 300;
	public static String tamaño0 = "10 cm x 10 cm";
	public static double precio0 = 2.00;
	public static int stock0 = 1000;

	// SEGUNDO MODELO DE PAPEL
	public static String modelo1 = "Secreto";
	public static String suavidad1 = "Suave";
	public static int hojas1 = 500;
	public static String tamaño1 = "10.2 cm x 10.2 cm";
	public static double precio1 = 2.80;
	public static int stock1 = 1000;

	// TERCER MODELO DE PAPEL
	public static String modelo2 = "Carmin";
	public static String suavidad2 = "Muy suave";
	public static int hojas2 = 600;
	public static String tamaño2 = "10.5 cm x 11.0 cm";
	public static double precio2 = 3.20;
	public static int stock2 = 1000;

	// CUARTO MODELO DE PAPEL
	public static String modelo3 = "Petalo";
	public static String suavidad3 = "Super suave";
	public static int hojas3 = 600;
	public static String tamaño3 = "10.5 cm x 11.0 cm";
	public static double precio3 = 4.00;
	public static int stock3 = 1000;

	// QUINTO MODELO DE PAPEL
	public static String modelo4 = "Panda";
	public static String suavidad4 = "Super suave";
	public static int hojas4 = 500;
	public static String tamaño4 = "11.0 cm x 11.0 cm";
	public static double precio4 = 3.60;
	public static int stock4 = 1000;

	// PORCENTAJE PARA EL CALCULAR EL DESCUENTO
	public static double porcentaje1 = 5.0;
	public static double porcentaje2 = 6.5;
	public static double porcentaje3 = 8.0;
	public static double porcentaje4 = 9.5;

	// Cantidad óptima de paquetes vendidos
	public static int cantidadOptimaPaquetes = 50;

	// Cantidad mínima de paquetes adquiridos para obtener el obsequio
	public static int cantidadMinimaPaquetes = 6;

	// Obsequio
	public static String obsequio = "Un lapicero";

	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;

	// Premio sorpresa
	public static String premioSorpresa = "Un chocolate";

	// Cantidad de ventas de cada papel Higienico
	public static int cantV0 = 0, cantV1 = 0, cantV2 = 0, cantV3 = 0,
			cantV4 = 0;
	// Cantidad de paquetes vendidos de cada Higienico
	public static int cantpaq0 = 0, cantpaq1 = 0, cantpaq2 = 0, cantpaq3 = 0,
			cantpaq4 = 0;
	// Cantidad de stock disponible
	public static int stockActual0 = 0, stockActual1 = 0, stockActual2 = 0,
			stockActual3 = 0, stockActual4 = 0;
	// Cantidad total de importe a pagar por modelo de papel
	public static double totalIP0 = 0, totalIP1 = 0, totalIP2 = 0,
			totalIP3 = 0, totalIP4 = 0;
	// cantidad total de importe a pagar
	public static double cantTotalIP = totalIP0 + totalIP1 + totalIP2
			+ totalIP3 + totalIP4;
	// Numero de clientes
	public static int NumeroCliente = 0;
	private JPanel contentPane;
	private JLabel lblNewLabel;

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
					// Esta linea de codigo sirve para mostrar la GUI al centro
					// de la pantalla
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
	public Tienda() {
		setResizable(false);
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Tienda.class.getResource("/imagenes/favicon.png")));
		setTitle("DIGESMA S.A.");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// TAMAÑO DE GUI
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(176, 196, 222));
		menuBar.setBounds(0, 0, 894, 41);
		contentPane.add(menuBar);

		mnArchivo = new JMenu("Archivo");
		mnArchivo.setBackground(new Color(70, 130, 180));
		mnArchivo.setForeground(new Color(70, 130, 180));
		mnArchivo.setIcon(new ImageIcon(Tienda.class
				.getResource("/imagenes/archivo.png")));
		mnArchivo.setFont(new Font("Cambria", Font.BOLD, 14));
		menuBar.add(mnArchivo);

		mntmSalir = new JMenuItem("Cerrar sesi\u00F3n");
		mntmSalir.setForeground(new Color(70, 130, 180));
		mntmSalir.setBackground(new Color(176, 196, 222));
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				InputEvent.CTRL_MASK));
		mntmSalir.addActionListener(this);
		mntmSalir.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnArchivo.add(mntmSalir);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setBackground(new Color(65, 105, 225));
		mnMantenimiento.setForeground(new Color(70, 130, 180));
		mnMantenimiento.setIcon(new ImageIcon(Tienda.class
				.getResource("/imagenes/toolbox.png")));
		mnMantenimiento.setFont(new Font("Cambria", Font.BOLD, 14));
		menuBar.add(mnMantenimiento);

		mntmConsultarModelo = new JMenuItem("Consultar Modelo");
		mntmConsultarModelo.setForeground(new Color(70, 130, 180));
		mntmConsultarModelo.setBackground(new Color(176, 196, 222));
		mntmConsultarModelo.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mntmConsultarModelo.addActionListener(this);
		mntmConsultarModelo.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnMantenimiento.add(mntmConsultarModelo);

		mntmModificarModelo = new JMenuItem("Modificar Modelo");
		mntmModificarModelo.setForeground(new Color(70, 130, 180));
		mntmModificarModelo.setBackground(new Color(176, 196, 222));
		mntmModificarModelo.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_M, InputEvent.CTRL_MASK));
		mntmModificarModelo.addActionListener(this);
		mntmModificarModelo.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnMantenimiento.add(mntmModificarModelo);

		mntmListarModelo = new JMenuItem("Listar Modelo");
		mntmListarModelo.setForeground(new Color(70, 130, 180));
		mntmListarModelo.setBackground(new Color(176, 196, 222));
		mntmListarModelo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,
				InputEvent.CTRL_MASK));
		mntmListarModelo.addActionListener(this);
		mntmListarModelo.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnMantenimiento.add(mntmListarModelo);

		mnVentas = new JMenu("Ventas");
		mnVentas.setForeground(new Color(70, 130, 180));
		mnVentas.setIcon(new ImageIcon(Tienda.class
				.getResource("/imagenes/money_bag.png")));
		mnVentas.setFont(new Font("Cambria", Font.BOLD, 14));
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.setBackground(new Color(176, 196, 222));
		mntmVender.setForeground(new Color(70, 130, 180));
		mntmVender.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,
				InputEvent.CTRL_MASK));
		mntmVender.addActionListener(this);
		mntmVender.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnVentas.add(mntmVender);

		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.setBackground(new Color(176, 196, 222));
		mntmGenerarReportes.setForeground(new Color(70, 130, 180));
		mntmGenerarReportes.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_G, InputEvent.CTRL_MASK));
		mntmGenerarReportes.addActionListener(this);
		mntmGenerarReportes.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnVentas.add(mntmGenerarReportes);

		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/configuracion.png")));
		mnConfiguracion.setForeground(new Color(70, 130, 180));
		menuBar.add(mnConfiguracion);
		mnConfiguracion.setFont(new Font("Cambria", Font.BOLD, 14));

		mntmConfigurarDescuento = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuento.setForeground(new Color(70, 130, 180));
		mntmConfigurarDescuento.setBackground(new Color(176, 196, 222));
		mntmConfigurarDescuento.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_D, InputEvent.SHIFT_MASK));
		mntmConfigurarDescuento.addActionListener(this);
		mntmConfigurarDescuento.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnConfiguracion.add(mntmConfigurarDescuento);

		mntmConfigurarObsequio = new JMenuItem("Configurar Obsequio");
		mntmConfigurarObsequio.setForeground(new Color(70, 130, 180));
		mntmConfigurarObsequio.setBackground(new Color(176, 196, 222));
		mntmConfigurarObsequio.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_O, InputEvent.SHIFT_MASK));
		mntmConfigurarObsequio.addActionListener(this);
		mntmConfigurarObsequio.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnConfiguracion.add(mntmConfigurarObsequio);

		mntmConfigurarCantidadOptima = new JMenuItem(
				"Configurar Cantidad Optima de Paquetes Vendidos");
		mntmConfigurarCantidadOptima.setForeground(new Color(70, 130, 180));
		mntmConfigurarCantidadOptima.setBackground(new Color(176, 196, 222));
		mntmConfigurarCantidadOptima.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_C, InputEvent.SHIFT_MASK));
		mntmConfigurarCantidadOptima.addActionListener(this);
		mntmConfigurarCantidadOptima
				.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnConfiguracion.add(mntmConfigurarCantidadOptima);

		mntmConfiguraarPremioSorpresa = new JMenuItem(
				"Configurar Premio Sorpresa");
		mntmConfiguraarPremioSorpresa.setForeground(new Color(70, 130, 180));
		mntmConfiguraarPremioSorpresa.setBackground(new Color(176, 196, 222));
		mntmConfiguraarPremioSorpresa.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_P, InputEvent.SHIFT_MASK));
		mntmConfiguraarPremioSorpresa.addActionListener(this);
		mntmConfiguraarPremioSorpresa.setFont(new Font("Cambria", Font.PLAIN,
				12));
		mnConfiguracion.add(mntmConfiguraarPremioSorpresa);

		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setForeground(new Color(70, 130, 180));
		mnAyuda.setIcon(new ImageIcon(Tienda.class
				.getResource("/imagenes/help.png")));
		mnAyuda.setFont(new Font("Cambria", Font.BOLD, 14));
		menuBar.add(mnAyuda);

		mntmAcercadeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercadeTienda.setForeground(new Color(70, 130, 180));
		mntmAcercadeTienda.setBackground(new Color(176, 196, 222));
		mntmAcercadeTienda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
				InputEvent.SHIFT_MASK));
		mntmAcercadeTienda.addActionListener(this);
		mntmAcercadeTienda.setFont(new Font("Cambria", Font.PLAIN, 12));
		mnAyuda.add(mntmAcercadeTienda);

		//PAra el calendario
		lblCalendario = new JLabel("");
		lblCalendario.setForeground(Color.WHITE);
		lblCalendario.setBounds(783, 58, 111, 26);
		reloj();
		contentPane.add(lblCalendario);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tienda.class
				.getResource("/imagenes/tienda.png")));
		lblNewLabel.setBounds(0, -24, 894, 645);
		contentPane.add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercadeTienda) {
			actionPerformedMntmAcercadeTienda(arg0);
		}
		if (arg0.getSource() == mntmConfiguraarPremioSorpresa) {
			actionPerformedMntmConfiguraarPremioSorpresa(arg0);
		}
		if (arg0.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidadOptima(arg0);
		}
		if (arg0.getSource() == mntmConfigurarDescuento) {
			actionPerformedMntmConfigurarDescuento(arg0);
		}
		if (arg0.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(arg0);
		}
		if (arg0.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource() == mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource() == mntmListarModelo) {
			actionPerformedMntmListarModelo(arg0);
		}
		if (arg0.getSource() == mntmModificarModelo) {
			actionPerformedMntmModificarModelo(arg0);
		}
		if (arg0.getSource() == mntmConsultarModelo) {
			actionPerformedMntmConsultarModelo(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
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

	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "Ha cerrado sesión, vuelva pronto");
		// THIS es para cerrar la ventana actual con la que se esta trabajando
		this.dispose();
	}

	protected void actionPerformedMntmConsultarModelo(ActionEvent arg0) {
		this.dispose();		
		Consultarmodelo dialog = new Consultarmodelo();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmModificarModelo(ActionEvent arg0) {
		this.dispose();
		Modificarmodelo dialog = new Modificarmodelo();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmListarModelo(ActionEvent arg0) {
		this.dispose();
		Listarmodelo dialog = new Listarmodelo();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmVender(ActionEvent arg0) {
		this.dispose();
		Vender dialog = new Vender();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		this.dispose();
		GenerarReportes dialog = new GenerarReportes();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarObsequio(ActionEvent arg0) {
		this.dispose();
		ConfigurarObsequio dialog = new ConfigurarObsequio();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarDescuento(ActionEvent arg0) {
		this.dispose();
		ConfigurarDescuento dialog = new ConfigurarDescuento();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarCantidadOptima(ActionEvent arg0) {
		this.dispose();
		CantidadOptimaPaquetes dialog = new CantidadOptimaPaquetes();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmConfiguraarPremioSorpresa(ActionEvent arg0) {
		this.dispose();
		ConfigurarPremioSorpresa dialog = new ConfigurarPremioSorpresa();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}

	protected void actionPerformedMntmAcercadeTienda(ActionEvent arg0) {
		this.dispose();
		AcercadeTienda dialog = new AcercadeTienda();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
	}
}