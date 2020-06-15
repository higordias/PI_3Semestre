package Screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;

public class ScreenHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenHome frame = new ScreenHome();
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
	public ScreenHome() {
		setTitle("Smart Automa\u00E7\u00E3o Residencial");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\higor\\OneDrive\\\u00C1rea de Trabalho\\Fatec\\PI\\Programa\\ClientsManager\\images\\logo2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 536);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Arquivo");
		mnFile.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("Adicionar Novo...");
		mnNew.setFont(new Font("Arial", Font.PLAIN, 15));
		mnFile.add(mnNew);
		
		JMenuItem mnItemAddRFID = new JMenuItem("Cart\u00E3o RFID");
		mnItemAddRFID.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNew.add(mnItemAddRFID);
		
		JMenuItem mnItemAddClient = new JMenuItem("Cliente");
		mnItemAddClient.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNew.add(mnItemAddClient);
		
		JMenuItem mnItemAddComponent = new JMenuItem("Componente");
		mnItemAddComponent.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNew.add(mnItemAddComponent);
		
		JMenuItem mnItemAddKit = new JMenuItem("Kit");
		mnItemAddKit.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNew.add(mnItemAddKit);
		
		JMenuItem mnItemAddLogin = new JMenuItem("Login");
		mnItemAddLogin.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNew.add(mnItemAddLogin);
		
		JMenuItem mnItemAddQuestion = new JMenuItem("Pergunta Seguran\u00E7a");
		mnItemAddQuestion.setFont(new Font("Arial", Font.PLAIN, 15));
		mnNew.add(mnItemAddQuestion);
		
		JMenuItem mnItemSair = new JMenuItem("Sair");
		mnItemSair.setFont(new Font("Arial", Font.PLAIN, 15));
		mnFile.add(mnItemSair);
		
		JMenu mnEdit = new JMenu("Editar");
		mnEdit.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnEdit);
		
		JMenuItem mnItemEditRFID = new JMenuItem("Cart\u00E3o RFID");
		mnItemEditRFID.setFont(new Font("Arial", Font.PLAIN, 15));
		mnEdit.add(mnItemEditRFID);
		
		JMenuItem mnItemEditClient = new JMenuItem("Cliente");
		mnItemEditClient.setFont(new Font("Arial", Font.PLAIN, 15));
		mnEdit.add(mnItemEditClient);
		
		JMenuItem mnItemEditComponent = new JMenuItem("Componente");
		mnItemEditComponent.setFont(new Font("Arial", Font.PLAIN, 15));
		mnEdit.add(mnItemEditComponent);
		
		JMenuItem mnItemEditKit = new JMenuItem("Kit");
		mnItemEditKit.setFont(new Font("Arial", Font.PLAIN, 15));
		mnEdit.add(mnItemEditKit);
		
		JMenuItem mnItemEditLogin = new JMenuItem("Login");
		mnItemEditLogin.setFont(new Font("Arial", Font.PLAIN, 15));
		mnEdit.add(mnItemEditLogin);
		
		JMenuItem mnItemEditQuestion = new JMenuItem("Pergunta Seguran\u00E7a");
		mnItemEditQuestion.setFont(new Font("Arial", Font.PLAIN, 15));
		mnEdit.add(mnItemEditQuestion);
		
		JMenu mnShow = new JMenu("Mostrar");
		mnShow.setFont(new Font("Arial", Font.PLAIN, 15));
		menuBar.add(mnShow);
		
		JMenuItem mnItemShowRFID = new JMenuItem("Cart\u00E3o RFID");
		mnItemShowRFID.setFont(new Font("Arial", Font.PLAIN, 15));
		mnShow.add(mnItemShowRFID);
		
		JMenuItem mnItemShowClient = new JMenuItem("Cliente");
		mnItemShowClient.setFont(new Font("Arial", Font.PLAIN, 15));
		mnShow.add(mnItemShowClient);
		
		JMenuItem mnItemShowComponent = new JMenuItem("Componente");
		mnItemShowComponent.setFont(new Font("Arial", Font.PLAIN, 15));
		mnShow.add(mnItemShowComponent);
		
		JMenuItem mnItemShowKit = new JMenuItem("Kit");
		mnItemShowKit.setFont(new Font("Arial", Font.PLAIN, 15));
		mnShow.add(mnItemShowKit);
		
		JMenuItem mnItemShowLogin = new JMenuItem("Login");
		mnItemShowLogin.setFont(new Font("Arial", Font.PLAIN, 15));
		mnShow.add(mnItemShowLogin);
		
		JMenuItem mnItemShowQuestion = new JMenuItem("Pergunta Seguran\u00E7a");
		mnItemShowQuestion.setFont(new Font("Arial", Font.PLAIN, 15));
		mnShow.add(mnItemShowQuestion);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelHomeButtons = new JPanel();
		PanelHomeButtons.setBounds(0, 0, 190, 463);
		contentPane.add(PanelHomeButtons);
		PanelHomeButtons.setLayout(null);
		
		JButton btnAddRFID = new JButton("Adicionar RFID");
		btnAddRFID.setToolTipText("Adicionar um cart\u00E3o RFID na base de dados");
		btnAddRFID.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAddRFID.setForeground(Color.BLACK);
		btnAddRFID.setBounds(12, 10, 166, 54);
		PanelHomeButtons.add(btnAddRFID);
		
		JButton btnAddClient = new JButton("Adicionar Cliente");
		btnAddClient.setToolTipText("Adicionar um cliente na base de dados");
		btnAddClient.setForeground(Color.BLACK);
		btnAddClient.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAddClient.setBounds(12, 74, 166, 54);
		PanelHomeButtons.add(btnAddClient);
		
		JButton btnAddKit = new JButton("Adicionar Kit");
		btnAddKit.setToolTipText("Adicionar um kit na base de dados");
		btnAddKit.setForeground(Color.BLACK);
		btnAddKit.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAddKit.setBounds(12, 202, 166, 54);
		PanelHomeButtons.add(btnAddKit);
		
		JButton btnAddComponent = new JButton("Add. Componente");
		btnAddComponent.setToolTipText("Adicionar um componente na base de dados");
		btnAddComponent.setForeground(Color.BLACK);
		btnAddComponent.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAddComponent.setBounds(12, 138, 166, 54);
		PanelHomeButtons.add(btnAddComponent);
		
		JButton btnAddQuestion = new JButton("Add. Pergunta");
		btnAddQuestion.setToolTipText("Adicionar umapergunta de seguran\u00E7a na base de dados");
		btnAddQuestion.setForeground(Color.BLACK);
		btnAddQuestion.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAddQuestion.setBounds(12, 330, 166, 54);
		PanelHomeButtons.add(btnAddQuestion);
		
		JButton btnAddLogin = new JButton("Adicionar Login");
		btnAddLogin.setToolTipText("Adicionar um login na base de dados");
		btnAddLogin.setForeground(Color.BLACK);
		btnAddLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAddLogin.setBounds(12, 266, 166, 54);
		PanelHomeButtons.add(btnAddLogin);
		
		JButton btnGerarRelatorio = new JButton("Gerar Relat\u00F3rio");
		btnGerarRelatorio.setToolTipText("Gerar relat\u00F3rio dos itens da base de dados");
		btnGerarRelatorio.setForeground(Color.BLACK);
		btnGerarRelatorio.setFont(new Font("Arial", Font.PLAIN, 16));
		btnGerarRelatorio.setBounds(12, 394, 166, 54);
		PanelHomeButtons.add(btnGerarRelatorio);
		
		JPanel PanelHome = new JPanel();
		PanelHome.setBounds(188, 0, 600, 463);
		contentPane.add(PanelHome);
	}
}
