package Screens;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	
	private boolean hidePassword = true;
	private ImageIcon icon = new ImageIcon("images\\showPassword.png");
	
	/**
	 * @brief hidePassword getter
	 * @return true if password is to be hidden, false otherwise
	 */
	public boolean isHidePassword() {
		return hidePassword;
	}

	/**
	 * @brief hidePassword setter
	 * @param hidePassword true if it is to hide password, false otherwise
	 */
	public void setHidePassword(boolean hidePassword) {
		this.hidePassword = hidePassword;
	}

	/**
	 * @brief show/hide password icon getter
	 * @return path to the hide/show icon image
	 */
	public ImageIcon getIcon() {
		return icon;
	}

	/**
	 * @brief show/hide password icon setter
	 * @param path to the hide/show icon image
	 */
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenLogin frame = new ScreenLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * @brief Will resize an icon according to button size
	 * @param icon icon to be resized
	 * @param resizedWidth button width
	 * @param resizedHeight button height
	 * @return icon resized
	 */
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
	    Image img = icon.getImage();  
	    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
	    return new ImageIcon(resizedImage);
	}
	
	/**
	 * Create the frame.
	 */
	public ScreenLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\logo2.png"));
		setTitle("Login");
		setResizable(false);
		getRootPane().setWindowDecorationStyle( JRootPane.NONE );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("Usu\u00E1rio");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUser.setBounds(23, 164, 72, 16);
		contentPane.add(lblUser);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(23, 193, 72, 16);
		contentPane.add(lblSenha);
		
		txtUser = new JTextField();
		txtUser.setBounds(82, 162, 141, 22);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		txtPassword = new JPasswordField();
		txtPassword.setEchoChar('*');
		txtPassword.setBounds(82, 191, 110, 22);
		contentPane.add(txtPassword);

		JLabel lblShowHidePswd = new JLabel();
		lblShowHidePswd.setBounds(196, 194, 23, 16);
		lblShowHidePswd.setIcon(resizeIcon(icon, lblShowHidePswd.getWidth(), lblShowHidePswd.getHeight()));
		lblShowHidePswd.setHorizontalAlignment(JLabel.CENTER);
		lblShowHidePswd.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(lblShowHidePswd);
		
		lblShowHidePswd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(isHidePassword()) {
					setIcon(new ImageIcon("images\\HidePassword.png"));
					txtPassword.setEchoChar((char) 0);
					setHidePassword(false);
				}
				else {
					setIcon(new ImageIcon("images\\ShowPassword.png"));
					txtPassword.setEchoChar('*');
					setHidePassword(true);
				}
				lblShowHidePswd.setIcon(resizeIcon(icon, lblShowHidePswd.getWidth(), lblShowHidePswd.getHeight()));
				lblShowHidePswd.setHorizontalAlignment(JLabel.CENTER);
				lblShowHidePswd.setVerticalAlignment(JLabel.CENTER);
				contentPane.add(lblShowHidePswd, txtPassword);
			}
		});
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("images\\logo2.png"));
		lblLogo.setBounds(23, 13, 200, 138);
		lblLogo.setHorizontalAlignment(JLabel.CENTER);
		lblLogo.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(lblLogo);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtUser.getText().equals("") || txtUser.getText().equals(null)) {
					System.out.println("Empty User");
					txtUser.grabFocus();
					//TODO check if user exists in database and add error pop up
				}
				else if(txtPassword.getPassword().length == 0) {
					System.out.println("Empty Password");
					txtPassword.grabFocus();
					//TODO add error pop up
				}
				//TODO if user and password are okay, check if they are correct. If correct, go to home screen, if not, show error pop up
				char[] password = txtPassword.getPassword();
				String passwordString = "";
				for(int i = 0; i < password.length; i++) {
					passwordString += password[i];
				}
				System.out.println("Password: " + passwordString);
			}
		});
		btnEntrar.setBounds(143, 226, 80, 25);
		contentPane.add(btnEntrar);
		
	}
}
