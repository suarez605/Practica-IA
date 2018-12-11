import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextPane;

public class Main extends JFrame {

	private JPanel contentPane;
	protected ArrayList<Estacion> estaciones;

	//Estaciones linea 1 - AZUL
	protected Estacion beruni = new Estacion("Beruni", estaciones, 1);
	protected Estacion tinchlik = new Estacion("Tinchlik", estaciones, 1);
	protected Estacion chorsu = new Estacion("Chorsu", estaciones, 1);
	protected Estacion gafurGulom = new Estacion("Gafur Gulom", estaciones, 1);
	protected Estacion uzbekistan = new Estacion("Uzbekistan", estaciones, 1);
	protected Estacion kosmonavtlar = new Estacion("Kosmonavtlar", estaciones, 1);
	protected Estacion oybek = new Estacion("Oybek", estaciones, 1);
	protected Estacion toshkent = new Estacion("Toshkent", estaciones, 1);
	protected Estacion mashinasozlar = new Estacion("Mashinasozlar", estaciones, 1);
	protected Estacion dostlik = new Estacion("Dostlik", estaciones, 1);
	//Estaciones linea 2 - VERDE
	protected Estacion shakhriston = new Estacion("Shakhriston", estaciones, 2);
	protected Estacion bodomzor = new Estacion("Bodomzor", estaciones, 2);
	protected Estacion minor = new Estacion("Minor", estaciones, 2);
	protected Estacion abdullaKodiriy = new Estacion("Abdulla Kodiriy", estaciones, 2);
	protected Estacion yunusRajabiy = new Estacion("Yunus Rajabiy", estaciones, 2);
	protected Estacion mingUrik = new Estacion("Ming Urik", estaciones, 2);
	//Estaciones linea 3 - ROJA
	protected Estacion olmazor = new Estacion("Olmazor", estaciones, 3);
	protected Estacion chilonzor = new Estacion("Chilonzor", estaciones, 3);
	protected Estacion mirzoUlugbek = new Estacion("Mirzo Ulugbek", estaciones, 3);
	protected Estacion novza = new Estacion("Novza", estaciones, 3);
	protected Estacion milliyBog = new Estacion("Milliy Bog", estaciones, 3);
	protected Estacion bunyodkor = new Estacion("Bunyodkor", estaciones, 3);
	protected Estacion mustakillikMaydoni = new Estacion("Mustakillik Maydoni", estaciones, 3);
	protected Estacion amirTemurHiyoboni = new Estacion("Amir Temur Hiyoboni", estaciones, 3);
	protected Estacion khamidAlimjan = new Estacion("Khamid Alimjan", estaciones, 3);
	protected Estacion pushkin = new Estacion("Pushkin", estaciones, 3);
	protected Estacion buyukIpakYuli = new Estacion("Buyuk Ipak Yuli", estaciones, 3);
	//Añadimos al array de estaciones las distintas estaciones 

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	private String[] estaciones2 = { "Est1", "Est2"};
	
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 11, 1208, 636);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/metro-map.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(201, 44, 750, 390);
		panel.add(label);
		
		JComboBox comboBox = new JComboBox(estaciones);
		comboBox.setBounds(76, 474, 220, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(949, 474, 220, 20);
		panel.add(comboBox_1);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Ventana ventana = new Ventana();
				ventana.setVisible(true);
			}
		});
		btnBuscar.setBounds(521, 499, 160, 41);
		panel.add(btnBuscar);
		
		JTextPane txtpnOrigen = new JTextPane();
		txtpnOrigen.setText("ESTACION ORIGEN");
		txtpnOrigen.setBounds(128, 443, 116, 20);
		panel.add(txtpnOrigen);
		
		JTextPane txtpnEstacionDestino = new JTextPane();
		txtpnEstacionDestino.setText("ESTACION DESTINO");
		txtpnEstacionDestino.setBounds(964, 443, 205, 20);
		panel.add(txtpnEstacionDestino);
		
		JTextPane txtpnTashkentMetroApp = new JTextPane();
		txtpnTashkentMetroApp.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtpnTashkentMetroApp.setText("TASHKENT METRO APP");
		txtpnTashkentMetroApp.setBounds(499, 0, 470, 50);
		panel.add(txtpnTashkentMetroApp);
	}
}