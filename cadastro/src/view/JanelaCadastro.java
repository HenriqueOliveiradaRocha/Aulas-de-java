package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import model.Aluno;

public class JanelaCadastro extends JFrame {
	
	MaskFormatter frmtCpf = null;
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblCpf = new JLabel("CPF: ");
	JTextField txtCpf = new JTextField();
	
	JLabel lblIdade = new JLabel("Idade: ");
	JTextField txtIdade = new JTextField();
	
	JLabel lblEndereço = new JLabel("Endereço: ");
	JTextField txtEndereço = new JTextField();
	
	JLabel lblNumero = new JLabel("Nº: ");
	JTextField txtNumero = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField();
	
	JLabel lblCurso = new JLabel("Curso: ");
	JTextField txtCurso = new JTextField();
	
	JLabel lblsexo = new JLabel("Sexo:");
	JRadioButton[] sexo = new JRadioButton[2];
		ButtonGroup grp = new ButtonGroup();
	
	JButton salvar = new JButton("Cadastrar");
	JButton limpar = new JButton("Limpar tudo");
	
	public JanelaCadastro() {
		super("Cadastre-se");
		
		this.setBounds(0, 0, 800, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.gray);
		
		Container painel = this.getContentPane();
		painel.setLayout(null);
		
		painel.add(lblNome);
		lblNome.setBounds(20, 8, 40, 30);
		lblNome.setForeground(Color.white);
		painel.add(txtNome);
		txtNome.setBounds(20, 40, 300,30);
		
		painel.add(lblCpf);
		lblCpf.setBounds(20, 70, 40, 30);
		lblCpf.setForeground(Color.white);
		try {

			frmtCpf = new MaskFormatter("###.###.###-##");

			txtCpf = new JFormattedTextField(frmtCpf);

		}catch(Exception ex) {

			ex.printStackTrace();
		}
		painel.add(txtCpf);
		txtCpf.setBounds(20, 100, 300, 30);
		
		
		painel.add(lblIdade);
		lblIdade.setBounds(20, 130, 40, 30);
		lblIdade.setForeground(Color.white);
		painel.add(txtIdade);
		txtIdade.setBounds(20, 160, 300, 30);
		
		painel.add(lblEndereço);
		lblEndereço.setBounds(20, 190, 60, 30);
		lblEndereço.setForeground(Color.white);
		painel.add(txtEndereço);
		txtEndereço.setBounds(20, 220, 300, 30);
		
		painel.add(lblNumero);
		lblNumero.setBounds(420, 190, 40, 30);
		lblNumero.setForeground(Color.white);
		painel.add(txtNumero);
		txtNumero.setBounds(420, 220, 60, 30);
		
		painel.add(lblBairro);
		lblBairro.setBounds(20, 250, 50, 30);
		lblBairro.setForeground(Color.white);
		painel.add(txtBairro);
		txtBairro.setBounds(20, 280, 300, 30);
		
		painel.add(lblCidade);
		lblCidade.setBounds(20, 310, 60, 30);
		lblCidade.setForeground(Color.white);
		painel.add(txtCidade);
		txtCidade.setBounds(20,340, 300, 30);
		
		painel.add(lblCurso);
		lblCurso.setBounds(20, 370, 40, 30);
		lblCurso.setForeground(Color.white);
		painel.add(txtCurso);
		txtCurso.setBounds(20, 400, 300, 30);
		
		painel.add(salvar);
		salvar.setBounds(280,480,100,40);
		salvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				aluno.setNome(txtNome.getText().toString());
				aluno.setCpf(txtCpf.getText().toString());
				aluno.setIdade(Integer.parseInt(txtIdade.getText().toString()));
				aluno.setEndereço(txtEndereço.getText().toString());
				aluno.setNumero(Integer.parseInt(txtNumero.getText().toString()));
				aluno.setBairro(txtBairro.getText().toString());
				aluno.setCidade(txtCidade.getText().toString());
				aluno.setCurso(txtCurso.getText().toString());
				
				String txtSexo = "";
				if(sexo[0].isSelected()) {
					txtSexo = "Feminino";
				}else {
					txtSexo = "Masculino";
				}
				aluno.setSexo(txtSexo);
				
				System.out.println("Nome: " + aluno.getNome() + " CPF: " + aluno.getCpf() +
						" Idade: " + aluno.getIdade() + " Endereço: " + aluno.getEndereço() + 
						" Numero: " + aluno.getNumero() + " Bairro: " + aluno.getNumero() +
						" Cidade: " + aluno.getCidade() + " Curso: " + aluno.getCurso() + 
						" Sexo: " + aluno.getSexo());
				
			}
		});
		
		painel.add(lblsexo);
		lblsexo.setBounds(400,50, 40, 30);
		sexo[0] = new JRadioButton("Feminino");
		sexo[1] = new JRadioButton("Masculino");
			grp.add(sexo[0]);
			grp.add(sexo[1]);
		painel.add(sexo[0]);
		sexo[0].setBounds(400, 70, 80, 30);
		sexo[0].setBackground(Color.gray);
		painel.add(sexo[1]);
		sexo[1].setBounds(400, 90, 90, 30);
		sexo[1].setBackground(Color.gray);
		
		painel.add(limpar);
		limpar.setBounds(400, 480, 120, 40);
		limpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtCpf.setText("");
				txtIdade.setText("");
				txtEndereço.setText("");
				txtNumero.setText("");
				txtBairro.setText("");
				txtCidade.setText("");
				txtCurso.setText("");
				
			}
		});
		
	}

	public static void main(String[] args) {
		
		JanelaCadastro exer = new JanelaCadastro();
		
	}
}
