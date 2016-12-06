package cleanersa;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
//
import java.util.Calendar;
//
public class TVender extends JDialog implements ActionListener, KeyListener {
	private JLabel lblModelosDePapel;
	private JLabel lblCantidadDePaquetes;
	private JLabel lblEfectivo;
	private JTextField txtCantidad;
	private JTextField txtEfectivo;
	private JComboBox cboModelo;
	private JScrollPane scp;
	private JTextArea txtS;
	private JButton btnVender;
	private JButton btnCerrar;
	
	
	private final JLabel lblNewLabel = new JLabel("");
	
	//
	Calendar
	cal=Calendar.getInstance();
	String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
	String fecha=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
	//
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TVender dialog = new TVender();
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
	public TVender() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TVender.class.getResource("/imagenes/favicon.png")));
		setTitle("                                                                    VENTAS");
		getContentPane().setBackground(new Color(255, 228, 225));
		//tama�o de gui
		setBounds(100, 100, 500, 550);
		getContentPane().setLayout(null);
		
		lblModelosDePapel = new JLabel("Modelo de papel");
		lblModelosDePapel.setForeground(new Color(255, 255, 255));
		lblModelosDePapel.setFont(new Font("Cambria", Font.BOLD, 13));
		lblModelosDePapel.setBounds(132, 17, 151, 22);
		getContentPane().add(lblModelosDePapel);
		
		lblCantidadDePaquetes = new JLabel("Cantidad de Paquetes");
		lblCantidadDePaquetes.setForeground(new Color(255, 255, 255));
		lblCantidadDePaquetes.setFont(new Font("Cambria", Font.BOLD, 13));
		lblCantidadDePaquetes.setBounds(132, 50, 171, 22);
		getContentPane().add(lblCantidadDePaquetes);
		
		lblEfectivo = new JLabel("Efectivo");
		lblEfectivo.setForeground(new Color(255, 255, 255));
		lblEfectivo.setFont(new Font("Cambria", Font.BOLD, 13));
		lblEfectivo.setBounds(132, 80, 151, 22);
		getContentPane().add(lblEfectivo);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(this);
		txtCantidad.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(267, 53, 90, 20);
		getContentPane().add(txtCantidad);
		
		txtEfectivo = new JTextField();
		txtEfectivo.addKeyListener(this);
		txtEfectivo.setFont(new Font("Cambria", Font.PLAIN, 13));
		txtEfectivo.setColumns(10);
		txtEfectivo.setBounds(267, 81, 90, 20);
		getContentPane().add(txtEfectivo);
		
		cboModelo = new JComboBox();
		cboModelo.setFont(new Font("Cambria", Font.PLAIN, 13));
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Confort", "Secreto", "Carm\u00EDn", "P\u00E9talo", "Panda"}));
		cboModelo.setBounds(267, 21, 90, 22);
		getContentPane().add(cboModelo);
		
		scp = new JScrollPane();
		scp.setBounds(162, 113, 310, 343);
		getContentPane().add(scp);
		
		txtS = new JTextArea();
		txtS.setForeground(new Color(255, 255, 255));
		txtS.setFont(new Font("Cambria", Font.PLAIN, 12));
		txtS.setBackground(new Color(70, 130, 180));
		scp.setViewportView(txtS);
		
		btnVender = new JButton("Vender");
		btnVender.setIcon(new ImageIcon(TVender.class.getResource("/imagenes/money_bag.png")));
		btnVender.addActionListener(this);
		btnVender.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnVender.setBounds(367, 21, 107, 30);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setIcon(new ImageIcon(TVender.class.getResource("/imagenes/Salida2.png")));
		btnCerrar.addActionListener(this);
		btnCerrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCerrar.setBounds(367, 62, 107, 30);
		getContentPane().add(btnCerrar);
		lblNewLabel.setIcon(new ImageIcon(TVender.class.getResource("/imagenes/vender.png")));
		lblNewLabel.setBounds(-6, 0, 500, 534);
		getContentPane().add(lblNewLabel);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		this.dispose();
			Tvendedor Tienda = new Tvendedor();
			Tienda.setLocationRelativeTo(null);
			Tienda.setVisible(true);}
	
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		//INVOCAMOS UN MENSAJE EN CASO EL USUARIO NO INGRESE ALGUNO DE ESTOS DATOS 
		if (txtCantidad.getText().isEmpty() && txtEfectivo.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Ingrese la cantidad y efectivo","Error",JOptionPane.ERROR_MESSAGE);}
		else if(txtCantidad.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Ingrese una cantidad","Error",JOptionPane.ERROR_MESSAGE);}
		else if(txtEfectivo.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Ingrese el efectivo","Error",JOptionPane.ERROR_MESSAGE);}
		else{
			
			
		//DECLARACION DE LAS VARIABLES LOCALES 	
		int modelo,cant;
		double ic,id,ip,efectivo,vuelto;
		String obs,sorpresa,cliente;
		
		
		// IGUALANDO LAS VARIABLES LOCALES CON LOS METODOS CON RETORNO	
		modelo=getModelo();
		cant=getCantidad();
		efectivo=getEfectivo();
		
		//Proceso de calculo
		ic=calcularImporteCompra(modelo,cant);
		id=calcularImporteDescuento(cant,ic);
		ip=calcularImportePagar(ic,id);
		contador(cant,modelo,ip);
		obs=calcularObsequio(ip);
		vuelto=ObtenerVuelto(efectivo, ip);
		
		if(vuelto<0){
			InsuficienteEfectivo();}
		
		//INVOCAMOS UN MENSAJE CUANDO EL CONTADOR CANTPAQ SUPERE LOS 800 PAPELES HIGIENICOS
		if(Tienda.cantpaq0>=800){		
			JOptionPane.showMessageDialog(this, "Se esta agotando el stock \n queda disponible" + Tienda.stock0+ "  unidades.","DIGESMA S.A.",
				JOptionPane.YES_NO_CANCEL_OPTION);}
		else if(Tienda.cantpaq1>=800){
			JOptionPane.showMessageDialog(this, "Se esta agotando el stock \n queda disponible" + Tienda.stock1+ "  unidades.","DIGESMA S.A.",
					JOptionPane.YES_NO_CANCEL_OPTION);}
		else if(Tienda.cantpaq2>=800){
			JOptionPane.showMessageDialog(this, "Se esta agotando el stock \n queda disponible" + Tienda.stock2+ "  unidades.","DIGESMA S.A.",
					JOptionPane.YES_NO_CANCEL_OPTION);}
		else if(Tienda.cantpaq3>=800){
			JOptionPane.showMessageDialog(this, "Se esta agotando el stock \n queda disponible" + Tienda.stock3+ "  unidades.","DIGESMA S.A.",
					JOptionPane.YES_NO_CANCEL_OPTION);}
		else if(Tienda.cantpaq4>=800){
			JOptionPane.showMessageDialog(this, "Se esta agotando el stock \n queda disponible" + Tienda.stock4+ "  unidades.","DIGESMA S.A.",
					JOptionPane.YES_NO_CANCEL_OPTION);}
		
		
		
		impTotalPago();
		mostrarResultados(ic,id,ip,obs,modelo,vuelto);}
		}
		
				
		//OBTENER LOS DATOS INGRESADOS DE ESTAS VARIABLES 		
		int getModelo(){
			return cboModelo.getSelectedIndex();
		}
		int getCantidad(){
			return Integer.parseInt(txtCantidad.getText());
		}
		double getEfectivo(){
			return Double.parseDouble(txtEfectivo.getText());
		}
		
		
		
		//PARA CALCULAR EL IMPORTE DE COMPRA
		
		double calcularImporteCompra (int tipo, int cant){
			switch(tipo){
			case 0:	return Tienda.precio0*cant;
			case 1:	return Tienda.precio1*cant;
			case 2:	return Tienda.precio2*cant;
			case 3:	return Tienda.precio3*cant;
			default:return Tienda.precio4*cant;
			}
		}
		//CALCULAR DESCUENTO INVOCANDO LA VARIABLE GLOBAL PORCENTAJE
		
		double calcularImporteDescuento(int cant, double ic){
			if(cant<=5)
				return Tienda.porcentaje1/100*ic;
			else if(cant<=10)
				return Tienda.porcentaje2/100*ic;
			else if(cant<=15)
				return Tienda.porcentaje3/100*ic;
			else
				return Tienda.porcentaje4/100*ic;
		}
		
		
		//CALCULANDO EL IMPORTE A PAGAR PARA EFECTUAR LA VENTA
		double calcularImportePagar(double ic, double id){
				return ic-id;
		}
		
		
		//OBTENIENDO EL OBSEQUIO DE LA VENTA
		String calcularObsequio(double cant){
			if(cant>=Tienda.cantidadMinimaPaquetes)
				return Tienda.obsequio;
			else return "Ninguno";
		}
		
		
		//EL CALCULO DE LOS CONTADORES Y ACUMULADORES RESPECTIVAMENTE
		void contador(int cant, int modelo, double ip){
			switch(modelo){
			case 0:	Tienda.cantV0++;
					Tienda.NumeroCliente++;
					Tienda.cantpaq0+=cant;
					Tienda.totalIP0+=ip;
					Tienda.stock0-=cant;
					break;
			case 1:	Tienda.cantV1++;
					Tienda.NumeroCliente++;
					Tienda.cantpaq1+=cant;
					Tienda.totalIP1+=ip;
					Tienda.stock1-=Tienda.cantpaq1;
							break;
			case 2:	Tienda.cantV2++;
					Tienda.NumeroCliente++;
					Tienda.cantpaq2+=cant;
					Tienda.totalIP2+=ip;
					Tienda.stock2-=Tienda.cantpaq2;
					break;
			case 3:	Tienda.cantV3++;
					Tienda.NumeroCliente++;
					Tienda.cantpaq3+=cant;
					Tienda.totalIP3+=ip;
					Tienda.stock3-=Tienda.cantpaq3;
					break;
			default:Tienda.cantV4++;
					Tienda.NumeroCliente++;
					Tienda.cantpaq4+=cant;
					Tienda.totalIP4+=ip;
					Tienda.stock4-=Tienda.cantpaq4;
					
			
					
			}
		}
		//PARA CALCULAR EL IMPORTE TOTAL DE TODOS LO VENDIDO 
		void impTotalPago(){
			Tienda.cantTotalIP=Tienda.totalIP0+Tienda.totalIP1+Tienda.totalIP2+Tienda.totalIP3+Tienda.totalIP4;}
		
		//CALCULO PARA OBTENER EL VUELTO CORRESPONDIENTE
		double ObtenerVuelto(double efectivo,double ip){
			return efectivo-ip;}
		
		//FORMATEADOR PARA QUE SOLO NOS MUESTRE 2 DECIMALES AL IMPRIMIR
		DecimalFormat formateador = new DecimalFormat("####.##");
		
		
		//METODO PARA QUE NOS BOTE UN MENSAJE CUANDO NO HAYA SUFICIENTE EFECTIVO PARA REALIZAR LA OPERACION
		void InsuficienteEfectivo() {
			JOptionPane.showMessageDialog(this, "No tienes suficiente efectivo	\n para realizar esta operacion.","DIGESMA S.A.",
			JOptionPane.WARNING_MESSAGE);
			txtEfectivo.requestFocus();
		}
		
		//METODO PARA IMPRIMIR LO SOLICITADO Y EFECTUAR LA BOLETA DE VENTA		
		void mostrarResultados(double ic, double id, double ip, String obs, int modelo,double vuelto){
			limpiar();
			imprimir("                                   CLEANER S.A.");
			imprimir("                             BOLETA DE VENTAS \n");
			imprimir("Recibo No.: CYB-" + Math.round(Math.random()*10000000));
			imprimir("Fecha : " + fecha );
			imprimir("Hora  : " + hora + "\n");
			
			switch(modelo){
			case 0: imprimir("Cliente No. \t\t\t:"+Tienda.NumeroCliente);
					imprimir("Tipo de Papel Higi�nico \t\t:"+Tienda.modelo0);
					imprimir("Precio por unidad \t\t:"+Tienda.precio0);
					imprimir("Cantidad de Paquetes vendidos "+Tienda.modelo0+"\t:"+Tienda.cantpaq0);
					imprimir("Cantidad de Paquetes diponibles en stock\t:" +Tienda.stock0);
					imprimir("Importe de Compra\t\t:"+ic);
					imprimir("Importe de Descuento\t\t:"+id + "\n");
					imprimir("Importe a Pagar\t\t:"+ip);
					imprimir("Efectivo \t\t\t:" + txtEfectivo.getText());
					imprimir("Vuelto \t\t\t:"+vuelto);
					imprimir("**********************************************************");
					imprimir("                    USTED A GANADO   "+obs);
					imprimir("**********************************************************\n");
					imprimir("               Para mayor informaci�n visitanos en");
					imprimir("                           www.cleanersa.com.pe");
					break;
			case 1:	imprimir("Cliente No. \t\t\t:"+Tienda.NumeroCliente);
					imprimir("Tipo de Papel Higi�nico \t\t:"+Tienda.modelo1);
					imprimir("Precio por unidad \t\t:"+Tienda.precio1);
					imprimir("Cantidad de Paquetes vendidos "+Tienda.modelo1+"\t:"+Tienda.cantpaq1);
					imprimir("Cantidad de Paquetes diponibles en stock\t:" +Tienda.stockActual0);
					imprimir("Importe de Compra\t\t:"+ic);
					imprimir("Importe de Descuento\t\t:"+id + "\n");
					imprimir("Importe a Pagar\t\t:"+ip);
					imprimir("Efectivo \t\t\t:" + txtEfectivo.getText());
					imprimir("Vuelto \t\t\t:"+vuelto);
					imprimir("**********************************************************");
					imprimir("                    USTED A GANADO   "+obs);
					imprimir("**********************************************************\n");
					imprimir("               Para mayor informaci�n visitanos en");
					imprimir("                           www.cleanersa.com.pe");
					break;
			case 2: imprimir("Cliente No. \t\t\t:"+Tienda.NumeroCliente);
					imprimir("Tipo de Papel Higi�nico \t\t:"+Tienda.modelo2);
					imprimir("Precio por unidad \t\t:"+Tienda.precio2);
					imprimir("Cantidad de Paquetes vendidos "+Tienda.modelo2+"\t:"+Tienda.cantpaq2);
					imprimir("Cantidad de Paquetes diponibles en stock\t:" +Tienda.stock2);
					imprimir("Importe de Compra\t\t:"+ic);
					imprimir("Importe de Descuento\t\t:"+id + "\n");
					imprimir("Importe a Pagar\t\t:"+ip);
					imprimir("Efectivo \t\t\t:" + txtEfectivo.getText());
					imprimir("Vuelto \t\t\t:"+vuelto);
					imprimir("**********************************************************");
					imprimir("                    USTED A GANADO   "+obs);
					imprimir("**********************************************************\n");
					imprimir("               Para mayor informaci�n visitanos en");
					imprimir("                           www.cleanersa.com.pe");
					break;
			case 3:
					imprimir("Cliente No. \t\t\t:"+Tienda.NumeroCliente);
					imprimir("Tipo de Papel Higi�nico \t\t:"+Tienda.modelo3);
					imprimir("Precio por unidad \t\t:"+Tienda.precio3);
					imprimir("Cantidad de Paquetes vendidos "+Tienda.modelo3+"\t:"+Tienda.cantpaq3);
					imprimir("Cantidad de Paquetes diponibles en stock\t:" +Tienda.stock3);
					imprimir("Importe de Compra\t\t:"+ic);
					imprimir("Importe de Descuento\t\t:"+id + "\n");
					imprimir("Importe a Pagar\t\t:"+ip);
					imprimir("Efectivo \t\t\t:" + txtEfectivo.getText());
					imprimir("Vuelto \t\t\t:"+vuelto);
					imprimir("**********************************************************");
					imprimir("                    USTED A GANADO   "+obs);
					imprimir("**********************************************************\n");
					imprimir("               Para mayor informaci�n visitanos en");
					imprimir("                           www.cleanersa.com.pe");
					break;
			default:
					imprimir("Cliente No. \t\t\t:"+Tienda.NumeroCliente);
					imprimir("Tipo de Papel Higi�nico \t\t:"+Tienda.modelo4);
					imprimir("Precio por unidad \t\t:"+Tienda.precio4);
					imprimir("Cantidad de Paquetes vendidos "+Tienda.modelo4+"\t:"+Tienda.cantpaq4);
					imprimir("Cantidad de Paquetes diponibles en stock\t:" +Tienda.stock4);
					imprimir("Importe de Compra\t\t:"+ic);
					imprimir("Importe de Descuento\t\t:"+id + "\n");
					imprimir("Importe a Pagar\t\t:"+ip);
					imprimir("Efectivo \t\t\t:" + txtEfectivo.getText());
					imprimir("Vuelto \t\t\t:"+vuelto);
					imprimir("**************************************************");
					imprimir("                    USTED A GANADO   "+obs);
					imprimir("**************************************************\n");
					imprimir("               Para mayor informaci�n visitanos en");
					imprimir("                           www.cleanersa.com.pe");
			}
			}
		void limpiar(){
			txtS.setText("");
		}
		void imprimir(String cad){
			txtS.append(cad+"\n");
		}
		
		
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	
	//CREAMOS UN EVENTO AL JTEXTFIELD 
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource() == txtEfectivo) {
			keyTypedTxtEfectivo(arg0);
		}
		if (arg0.getSource() == txtCantidad) {
			keyTypedTxtCantidad(arg0);}
		}
	
	protected void keyTypedTxtCantidad(KeyEvent arg0) {
		//SE ASEGURA DE CAPTURAR LA TECLA "ENTER" Y DESCARTAR TODAS LAS DEMAS
				char cTeclaPresionada=arg0.getKeyChar();
				//HACE CLICK AL BOTON VENDER AL PRESIONAR LA TECLA "ENTER"
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnVender.doClick();}
				char c = arg0.getKeyChar();
				if((c<'0' || c>'9'))arg0.consume();}
		
	
	
	protected void keyTypedTxtEfectivo(KeyEvent arg0) {
				char cTeclaPresionada=arg0.getKeyChar();
				if(cTeclaPresionada==KeyEvent.VK_ENTER){
					btnVender.doClick();}
				char c = arg0.getKeyChar();
				if((c<'0' || c>'9'))arg0.consume();}
	}
	
		