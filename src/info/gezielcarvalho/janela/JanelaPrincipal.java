package info.gezielcarvalho.janela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	static JPanel painel = new JPanel();
	static JLabel rotulo1 = new JLabel();
	static JLabel rotulo2 = new JLabel();

	static JButton botao1 = new JButton();
	static JButton botao2 = new JButton();
	static JButton botao3 = new JButton();
	
	static JTextField caixaDeTexto1 = new JTextField(20);
	static JTextField caixaDeTexto2 = new JTextField(20);
	
	static JMenuBar barramenu = new JMenuBar();
	
	static JMenu menuprincipal = new JMenu();
	static JMenu submenu = new JMenu();
	
	static JMenuItem itemdemenu1 = new JMenuItem();
	static JMenuItem itemdemenu2 = new JMenuItem();
	static JMenuItem itemdemenu3 = new JMenuItem();
	
	public JanelaPrincipal() throws HeadlessException {
		

		this.setSize(640,480); // sets the x and y dimensions of our frame
		this.setTitle("Sistema de Gestao de Veiculos"); // sets the title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false); // prevent frame from being resized
		this.setLayout(new BorderLayout());
		
		JPanel barrabotoes = new JPanel();
		JPanel painel = new JPanel();
		
		barrabotoes.setPreferredSize(new Dimension(400,40));
//		painel.setPreferredSize(new Dimension(400,200));
		painel.setBackground(Color.LIGHT_GRAY);
		
		barrabotoes.add(new JButton("Aa"));
		barrabotoes.add(new JButton("Bb"));
		barrabotoes.add(new JButton("Cc"));
		barrabotoes.add(new JButton("Dd"));
		barrabotoes.add(new JButton("Ed"));
		barrabotoes.add(new JButton("Ff"));
		barrabotoes.add(new JButton("Gg"));
		barrabotoes.add(new JButton("Hh"));
		barrabotoes.add(new JButton("Ii"));
		
		this.add(barrabotoes,BorderLayout.NORTH);
//		painel.setBackground(Color.blue);
//		painel.setBounds(0,0,250,250);
		this.add(painel,BorderLayout.CENTER);
		
		ImageIcon icone = new ImageIcon("./src/mao.png");
		this.setIconImage(icone.getImage());
//		
//		botao1.setText("Trocar!");
//		botao1.setBounds(100,100,250,150);
//		botao1.addActionListener(this);
//		botao1.setFocusable(false);
//		botao1.setHorizontalTextPosition(JButton.CENTER);
//		botao1.setVerticalTextPosition(JButton.BOTTOM);
//		botao1.setFont(new Font("Comic Sans", Font.BOLD,25));
//		botao1.setFocusable(false);
//		botao1.setIconTextGap(-10);
//		botao1.setForeground(Color.darkGray);
//		botao1.setBackground(Color.LIGHT_GRAY);
//		botao1.setBorder(BorderFactory.createEtchedBorder());
//		botao1.setIcon(icone);
//		
//		this.add(botao1);
//		
//		janela1.getContentPane().setBackground(Color.CYAN);
//		this.getContentPane().setBackground(new Color(201,201,201));
//		
//		rotulo1.setText("Nome: ");
//		rotulo1.setHorizontalTextPosition(JLabel.CENTER);
//		rotulo2.setText("Endereco: ");
//		
//		caixaDeTexto1.setText("digite o nome");
//		caixaDeTexto2.setText("digite seu endereco");
//		

//		botao2.setText("Limpar!");
//		botao3.setText("Sair!");
//		
//		menuprincipal.setText("Menu Principal");
//		submenu.setText("Submenu");
//		
//		itemdemenu1.setText("Item 1");
//		itemdemenu2.setText("Item 2");
//		itemdemenu3.setText("Item 3");
//		
//		barramenu.add(menuprincipal);
//		
//		menuprincipal.add(itemdemenu1);
//		menuprincipal.add(itemdemenu2);
//		menuprincipal.add(submenu);
//		
//		submenu.add(itemdemenu3);
//		
//		this.setJMenuBar(barramenu);
//		
//		this.add(rotulo1);
//		this.add(caixaDeTexto1);

//		this.add(rotulo2);
//		this.add(caixaDeTexto2);
//		this.add(botao2);
//
//		this.add(botao3);
//		
//		botao1.addActionListener(this);
//		botao2.addActionListener(this);
//		botao3.addActionListener(this);
//		
//		
		
		this.setVisible(true); //make frame visible
	}

	public JanelaPrincipal(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public JanelaPrincipal(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public JanelaPrincipal(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object objeto = e.getSource();
		
		if(objeto.equals(botao1)) {
			String tempo;
			botao1.setEnabled(false);
//			tempo = caixaDeTexto1.getText();
//			caixaDeTexto1.setText(caixaDeTexto2.getText());
//			caixaDeTexto2.setText(tempo);
		}
		
		if(objeto.equals(botao2)) {
			caixaDeTexto1.setText("");
			caixaDeTexto2.setText("");
		}
		
		if(objeto.equals(botao3)) {
			System.exit(0);;
		}
		
	}

}
