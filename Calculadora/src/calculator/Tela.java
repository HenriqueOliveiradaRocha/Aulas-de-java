package calculator;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Tela extends JFrame{
	
	//Campos Exibir, Editar, Ajuda
	JLabel exibir = new JLabel("Exibir");
	JLabel editar = new JLabel("Editar");
	JLabel ajuda = new JLabel("Ajuda");
	
	//Campo onde digita os números
	JTextField campo = new JTextField();
	
	//Botões
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btnBack = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+/-");
	JButton btnR = new JButton("R...");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnBarra = new JButton("/");
	JButton btnPercent = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnEstrela = new JButton("*");
	JButton btnX = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btnZero = new JButton("0");
	JButton btnPonto = new JButton(",");
	JButton btnMais = new JButton("+");

	
	public Tela(){
		super("Aula");
		
		Container paine = this.getContentPane();
		
		//Guia superior
		paine.add(exibir);
		exibir.setBounds(1,10,100,10);
		
		paine.add(editar);
		editar.setBounds(50,10,100,10);
		
		paine.add(ajuda);
		ajuda.setBounds(100,10,100,10);
		
		//Botões
		paine.add(btnPercent);
		btnPercent.setBounds(210,165,43,30);
		
		paine.add(btnBarra);
		btnBarra.setBounds(210,165,43,30);
		
		paine.add(btnNove);
		btnNove.setBounds(113,165,43,30);
		
		
		//////////////
		paine.add(btnCinco);
		btnCinco.setBounds(68,198,43,30);
		
		paine.add(btnQuatro);
		btnQuatro.setBounds(20,198,43,30);
		
		paine.add(btnUm);
		btnUm.setBounds(20,255,43,30);
		
		paine.add(btnX);
		btnX.setBounds(210,198,55,30);
		
		paine.add(btnEstrela);
		btnEstrela.setBounds(160,198,43,30);
		
		paine.add(btnSeis);
		btnSeis.setBounds(113,198,43,30);
		
		paine.add(btnUm);
		btnUm.setBounds(20,255,43,30);
		
		paine.add(btnDois);
		btnDois.setBounds(68,255,43,30);
		
		paine.add(btnTres);
		btnTres.setBounds(113,255,43,30);
		
		paine.add(btnMenos);
		btnMenos.setBounds(160,255,43,30);
		
		paine.add(btnIgual);
		btnIgual.setBounds(210,230,43,90);
		
		paine.add(btnZero);
		btnZero.setBounds(20,290,90,30);
		
		paine.add(btnPonto);
		btnPonto.setBounds(113,290,43,30);
		
		paine.add(btnMais);
		btnMais.setBounds(160,290,43,30);
		
		
		
		
		//Config janela
		this.setLayout(null);
		this.setVisible(true);
		this.setLocation(700, 200);
		this.setSize(280, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
		
		
		
	public static void main(String[] args) {
		Tela janelaCalculadora = new Tela();
	}

}







/*
 * 
 * MaskFormatter formatTel = null;
	

	JLabel lblTelefone = new JLabel("Telefone:");
	JFormattedTextField txtTelefone = null;
	JComboBox cboEstado = new JComboBox();
	JRadioButton[] rdnSexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();
	
	*/
