import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextPane;

public class Main extends JFrame {

	private JPanel contentPane;
	

	
	// { } linea 1 - AZUL
	protected Estacion beruni = new Estacion("Beruni", "Tinchlik", null, null, 1);
	protected Estacion tinchlik = new Estacion("Tinchlik", "Beruni", "Chorsu", null, 1);
	protected Estacion chorsu = new Estacion("Chorsu", "Tinchlik", "Gafur Gulom", null, 1);
	protected Estacion gafurGulom = new Estacion("Gafur Gulom", "Chorsu", "Alisher Navoi", null,  1);
	protected Estacion alisherNavoi = new Estacion("Alisher Navoi", "Gafur Gulom","Uzbekistan", "Pakhtakor", 1);
	protected Estacion uzbekistan = new Estacion("Uzbekistan", "Alisher Navoi","Kosmonavtlar", null, 1);
	protected Estacion kosmonavtlar = new Estacion("Kosmonavtlar", "Uzbekistan", "Oybek", null, 1);
	protected Estacion oybek = new Estacion("Oybek", "Kosmonavtlar", "Toshkent", "Ming Urik", 1);
	protected Estacion toshkent = new Estacion("Toshkent", "Oybek", "Mashinasozlar", null, 1);
	protected Estacion mashinasozlar = new Estacion("Mashinasozlar", "Toshkent", "Dostlik", null, 1);
	protected Estacion dostlik = new Estacion("Dostlik", "Mashinasozlar",null,null, 1);
	// { } linea 2 - VERDE
	protected Estacion shakhriston = new Estacion("Shakhriston", "Bodomzor", null, null, 2);
	protected Estacion bodomzor = new Estacion("Bodomzor", "Shakhriston", "Minor", null, 2);
	protected Estacion minor = new Estacion("Minor", "Bodomzor", "Abdulla Kodiriy", null, 2);
	protected Estacion abdullaKodiriy = new Estacion("Abdulla Kodiriy", "Minor", "Yunus Rajabiy", null, 2);
	protected Estacion yunusRajabiy = new Estacion("Yunus Rajabiy", "Abdulla Kodiriy", "Ming Uri", "Amir Temur Hiyoboni", 2);
	protected Estacion mingUrik = new Estacion("Ming Urik", "Yunus Rajabiy", "Oybek", null, 2);
	// { } linea 3 - ROJA
	protected Estacion olmazor = new Estacion("Olmazor", "Chilonzor", null, null, 3);
	protected Estacion chilonzor = new Estacion("Chilonzor", "Olmazor", "Mirzo Ulugbek", null, 3);
	protected Estacion mirzoUlugbek = new Estacion("Mirzo Ulugbek", "Chilonzor", "Novza", null,  3);
	protected Estacion novza = new Estacion("Novza", "Mirzo Ulugbek", "Milliy Bog", null, 3);
	protected Estacion milliyBog = new Estacion("Milliy Bog", "Novza", "Bunyodkor", null, 3);
	protected Estacion bunyodkor = new Estacion("Bunyodkor", "Milliy Bog", "Pakhtakor", null, 3);
	protected Estacion pakhtakor = new Estacion("Pakhtakor", "Bunyodkor","Mustakillik Maydoni" ,"Alisher Navoi", 3);
	protected Estacion mustakillikMaydoni = new Estacion("Mustakillik Maydoni", "Pakhtakor","Amir Temur Hiyoboni",null, 3);
	protected Estacion amirTemurHiyoboni = new Estacion("Amir Temur Hiyoboni", "Mustakillik Maydoni","Khamid Alimjan","Yunus Rajabiy", 3);
	protected Estacion khamidAlimjan = new Estacion("Khamid Alimjan", "Amir Temur Hiyoboni","Pushkin",null, 3);
	protected Estacion pushkin = new Estacion("Pushkin", "Khamid Alimjan","Buyuk Ipak Yuli",null, 3);
	protected Estacion buyukIpakYuli = new Estacion("Buyuk Ipak Yuli", "Pushkin",null,null, 3);
	// Añadimos al array de { } las distintas { }


	private String[] estacionesString = { beruni.getNombre(), tinchlik.getNombre(), chorsu.getNombre(), gafurGulom.getNombre(),
			alisherNavoi.getNombre(), uzbekistan.getNombre(), kosmonavtlar.getNombre(), oybek.getNombre(),
			toshkent.getNombre(), mashinasozlar.getNombre(), dostlik.getNombre(), shakhriston.getNombre(),
			bodomzor.getNombre(), minor.getNombre(), abdullaKodiriy.getNombre(), yunusRajabiy.getNombre(),
			mingUrik.getNombre(), olmazor.getNombre(), chilonzor.getNombre(), mirzoUlugbek.getNombre(),
			novza.getNombre(), milliyBog.getNombre(), bunyodkor.getNombre(), pakhtakor.getNombre(), mustakillikMaydoni.getNombre(),
			amirTemurHiyoboni.getNombre(), khamidAlimjan.getNombre(), pushkin.getNombre(), buyukIpakYuli.getNombre() };
	
	private Estacion[] estaciones = { beruni, tinchlik, chorsu, gafurGulom, alisherNavoi, uzbekistan, kosmonavtlar,
			oybek, toshkent, mashinasozlar, dostlik, shakhriston, bodomzor, minor, abdullaKodiriy, yunusRajabiy,
			mingUrik, olmazor, chilonzor, mirzoUlugbek, novza, milliyBog, bunyodkor, pakhtakor, mustakillikMaydoni,
			amirTemurHiyoboni, khamidAlimjan, pushkin, buyukIpakYuli };

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

	public Main() {
		setTitle("Tashkent metro App");
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

		JComboBox<?> comboBox = new JComboBox<Object>(estacionesString);
		comboBox.setBounds(76, 474, 220, 20);
		panel.add(comboBox);

		JComboBox<?> comboBox_1 = new JComboBox<Object>(estacionesString);
		comboBox_1.setBounds(949, 474, 220, 20);
		panel.add(comboBox_1);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (comboBox.getSelectedItem().equals(comboBox_1.getSelectedItem())) {
					JOptionPane.showMessageDialog(null, "El origen y el destino no pueden ser el mismo");
				}else {
					AEstrella alg = new AEstrella(); //int tiempo = 0;
					int tiempo = alg.aEstrella(estaciones, selectorEstacion(comboBox.getSelectedItem().toString()),selectorEstacion(comboBox_1.getSelectedItem().toString())).size()-1;
					ArrayList<Estacion> camino = alg.aEstrella(estaciones, selectorEstacion(comboBox.getSelectedItem().toString()),selectorEstacion(comboBox_1.getSelectedItem().toString()));		
					String texto = "El camino que se debe seguir es: " + pasarATexto(camino) + "\n" + "El tiempo estimado del recorrido es de: " + tiempo + " minutos";
					JOptionPane.showMessageDialog(null, texto);
				}
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
		
		JLabel lblTashkentMetroApp = new JLabel("TASHKENT METRO APP");
		lblTashkentMetroApp.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblTashkentMetroApp.setBounds(480, 0, 311, 33);
		panel.add(lblTashkentMetroApp);
	}
	private Estacion selectorEstacion (String text) { // Metodo que selecciona del array de Estaciones la estacion correspondiente a un String que recibe
		Estacion resultado = null;
		for (int i = 0; i < estaciones.length; i++) {
			if (estaciones[i].getNombre().equals(text)) {
				resultado =  estaciones[i];
			}
		}
		return resultado ;
	}
	
	private String pasarATexto(ArrayList<Estacion> camino) {
		String texto = "";
		for (int i = 0; i < camino.size(); i++) {
			texto = texto + " " + camino.get(i).getNombre() + "\n";
		}
		
		return texto;
		
	}
}