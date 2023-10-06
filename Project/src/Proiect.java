import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JSlider;
import java.awt.Scrollbar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Proiect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proiect frame = new Proiect();
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
	public Proiect() {
		setTitle("ARMOURY CRATE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 680);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.BLACK);
		setJMenuBar(menuBar);
		
		JButton btnNewButton_3 = new JButton("Home");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\Info.png"));
		menuBar.add(btnNewButton_3);
		
		JMenu mnNewMenu_1 = new JMenu("Device");
		mnNewMenu_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mnNewMenu_1.setBackground(Color.BLACK);
		mnNewMenu_1.setForeground(Color.WHITE);   
		mnNewMenu_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\keyboard.png"));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("System");
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\system.png"));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Keystone");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\keystone.png"));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JButton btnNewButton_4 = new JButton("Aura Sync");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\aura.png"));
		menuBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("GameVisual");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\visual.png"));
		menuBar.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Game Library");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\li2.png"));
		menuBar.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Scenario Profiles");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\profiles.png"));
		menuBar.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Featured");
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(Color.BLACK);
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\features.png"));
		menuBar.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("News");
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setBackground(Color.BLACK);
		btnNewButton_9.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\news.png"));
		menuBar.add(btnNewButton_9);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator);
		
		JMenu mnNewMenu = new JMenu("User Center");
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setBackground(Color.BLACK);
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\user.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("My profile");
		mnNewMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("My products");
		mnNewMenu.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Registered Events");
		mnNewMenu.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Notifications");
		mnNewMenu.add(mntmNewMenuItem_16);
		
		JMenu mnNewMenu_2 = new JMenu("Settings");
		mnNewMenu_2.setBackground(Color.BLACK);
		mnNewMenu_2.setForeground(Color.WHITE);
		mnNewMenu_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\settings.png"));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Add Settings");
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(null); //Va deschide file chooserul propriu zis
		    if (returnVal == JFileChooser.APPROVE_OPTION) { // Daca se alege un fisier si se apasa Open
		        File file = fc.getSelectedFile();
		                                             //Aceste doua linii vor fi inlocuite de codul care va afisa calea si numele fisierului intr-ul label din status
		        System.out.println(file.getName()); // numele fisierului selectat se obtine din obiectul file
		        System.out.println(file.getAbsolutePath()); //calea absoluta catre fisierul selectat se obtine din obiectul file

		    } 
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_17);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("General");
		mnNewMenu_2.add(mntmNewMenuItem_18);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(this, popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Copy ");
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Paste ");
		popupMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Delete");
		popupMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Inspect");
		popupMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelbutoane = new JPanel();
		panelbutoane.setBackground(Color.BLACK);
		panelbutoane.setBounds(10, 498, 1226, 31);
		contentPane.add(panelbutoane);
		panelbutoane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Silent ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		panelbutoane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Performance");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.GRAY);
		panelbutoane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Turbo ");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.GRAY);
		panelbutoane.add(btnNewButton_2);
		
		JPanel panelcpu = new JPanel();
		panelcpu.setBackground(Color.BLACK);
		panelcpu.setBounds(611, 10, 258, 478);
		contentPane.add(panelcpu);
		panelcpu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPU Stats");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 238, 28);
		panelcpu.add(lblNewLabel);
		lblNewLabel.setDisplayedMnemonic('0');
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Frequency");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(36, 90, 189, 13);
		panelcpu.add(lblNewLabel_1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(60);
		progressBar_1.setBounds(36, 134, 146, 11);
		panelcpu.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(64);
		progressBar_2.setBounds(36, 248, 146, 11);
		panelcpu.add(progressBar_2);
		
		JLabel lblNewLabel_4 = new JLabel("Usage");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(36, 217, 129, 21);
		panelcpu.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Memory Frequency         3200Mhz  ");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(10, 320, 238, 13);
		panelcpu.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Temperature                      50");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 374, 215, 13);
		panelcpu.add(lblNewLabel_8);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(909, 10, 242, 478);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("GPU Stats");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(68, 10, 92, 25);
		panel.add(lblNewLabel_3);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(50);
		progressBar.setBounds(36, 121, 146, 11);
		panel.add(progressBar);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(20);
		progressBar_3.setBounds(36, 250, 146, 11);
		panel.add(progressBar_3);
		
		JLabel lblNewLabel_5 = new JLabel("Frequency");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(36, 85, 101, 13);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Usage");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(36, 220, 73, 13);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9 = new JLabel("Memory Frequency       405Mhz");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(10, 319, 222, 13);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Temperature                    55");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(10, 378, 222, 13);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 20, 579, 458);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\Cpu.png"));
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
