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

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtTashkentMetroApp;
	private JTextField txtOrigen;
	private JTextField txtDestino;

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
		
		txtTashkentMetroApp = new JTextField();
		txtTashkentMetroApp.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtTashkentMetroApp.setText("Tashkent Metro APP");
		txtTashkentMetroApp.setBounds(484, -1, 205, 41);
		panel.add(txtTashkentMetroApp);
		txtTashkentMetroApp.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(69, 474, 220, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(949, 474, 220, 20);
		panel.add(comboBox_1);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(521, 499, 160, 41);
		panel.add(btnBuscar);
		
		txtOrigen = new JTextField();
		txtOrigen.setText("ORIGEN");
		txtOrigen.setBounds(132, 445, 86, 20);
		panel.add(txtOrigen);
		txtOrigen.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setText("DESTINO");
		txtDestino.setBounds(1020, 445, 86, 20);
		panel.add(txtDestino);
		txtDestino.setColumns(10);
	}
}
