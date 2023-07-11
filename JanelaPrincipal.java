package view;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ConexaoBD.mysql;

public class JanelaPrincipal extends JFrame 
{
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet resposta = null;
		
	public static final long serialVersionUID = 1L;
	public  JPanel contentPane;
	public  JTextField tfNome;
	public  JTextField tfCpf;
	public  JTextField tfendereco;
	public  JTextField tfEmail;
	public  JTextField tfCidade;
	public  JTextField tfDtNasc;
	public  JTextField tfDtCheckin;
	public  JTextField tfDtCheckout;
	public  JTextField tfQuarto;
	
	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() 
	{
		setBackground(new Color(0, 0, 0));
		conn = mysql.conectar();
		
			
		setResizable(false);
		setTitle("Hotel 4MOD - Cadastro de Hóspedes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(21, 66, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(21, 102, 34, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Endereço");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(21, 136, 74, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(21, 175, 45, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cidade");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(21, 214, 58, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Data de Nascimento");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(21, 252, 146, 13);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Data Check-in");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(21, 290, 124, 13);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Data Check-out");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(21, 328, 124, 13);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Nº Quarto");
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6_1.setBounds(21, 370, 124, 13);
		contentPane.add(lblNewLabel_1_6_1);
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.LEFT);
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfNome.setBounds(71, 65, 397, 19);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCpf = new JTextField();
		tfCpf.setHorizontalAlignment(SwingConstants.LEFT);
		tfCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfCpf.setBounds(59, 101, 409, 19);
		contentPane.add(tfCpf);
		tfCpf.setColumns(10);
		
		tfendereco = new JTextField();
		tfendereco.setHorizontalAlignment(SwingConstants.LEFT);
		tfendereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfendereco.setBounds(95, 135, 373, 19);
		contentPane.add(tfendereco);
		tfendereco.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfEmail.setBounds(71, 174, 397, 19);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setHorizontalAlignment(SwingConstants.LEFT);
		tfCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfCidade.setBounds(82, 213, 386, 19);
		contentPane.add(tfCidade);
		tfCidade.setColumns(10);
		
		tfDtNasc = new JTextField();
		tfDtNasc.setHorizontalAlignment(SwingConstants.LEFT);
		tfDtNasc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfDtNasc.setBounds(174, 251, 294, 19);
		contentPane.add(tfDtNasc);
		tfDtNasc.setColumns(10);
		
		tfDtCheckin = new JTextField();
		tfDtCheckin.setHorizontalAlignment(SwingConstants.LEFT);
		tfDtCheckin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfDtCheckin.setBounds(131, 289, 337, 19);
		contentPane.add(tfDtCheckin);
		tfDtCheckin.setColumns(10);
		
		tfDtCheckout = new JTextField();
		tfDtCheckout.setHorizontalAlignment(SwingConstants.LEFT);
		tfDtCheckout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfDtCheckout.setBounds(141, 327, 327, 19);
		contentPane.add(tfDtCheckout);
		tfDtCheckout.setColumns(10);
		
		tfQuarto = new JTextField();
		tfQuarto.setHorizontalAlignment(SwingConstants.LEFT);
		tfQuarto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tfQuarto.setBounds(107, 369, 361, 19);
		contentPane.add(tfQuarto);
		tfQuarto.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Chamando o metodo cadastrar
				cadastrar();
			}
		});
		
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCadastrar.setBounds(192, 422, 135, 42);
		contentPane.add(btnCadastrar);
		
		JLabel titulo = new JLabel("Hotel 4MOD - Cadastro de Hóspedes");
		titulo.setForeground(new Color(58, 63, 101));
		titulo.setBackground(new Color(255, 255, 255));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		titulo.setBounds(0, 10, 516, 31);
		contentPane.add(titulo);
		
		JLabel lblStatus = new JLabel("Status da Conexão");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStatus.setBounds(20, 425, 172, 39);
		contentPane.add(lblStatus);
		
		if (conn != null)
		{
			lblStatus.setForeground(new Color(0, 255, 0));
			lblStatus.setText("Conectado ao MySQL");
		}
		else
		{
			lblStatus.setForeground(new Color(255, 0, 0));
			lblStatus.setText("Não conectado ao MySQL");
		}
	
	}
	
	public void cadastrar()
	{
		String nome = tfNome.getText();
		String cpf = tfCpf.getText();
		String endereco = tfendereco.getText();
		String email = tfEmail.getText();
		String cidade = tfCidade.getText();
		String data_nasc = tfDtNasc.getText();
		String check_in = tfDtCheckin.getText();
		String check_out = tfDtCheckout.getText();
		String quarto =tfQuarto.getText();
		
		String comandoSql = "INSERT INTO hospedes(nome, cpf, endereco, email, cidade, data_nasc, check_in, check_out, quarto) "
					      + "VALUES ('" + nome + "', '" + cpf + "', '" + endereco + "', '" + email + "', '" + cidade + "',"
					      + "'" + data_nasc + "', '" + check_in + "', '" + check_out + "', '" + quarto + "')";
		
		System.out.println(comandoSql);
		try 
		{
			stmt = conn.prepareStatement(comandoSql);
			boolean resp = stmt.execute(comandoSql);
								
							
			if (resp = true)
			{
				JOptionPane.showMessageDialog(null,"Usuario Cadastrado com Sucesso");
				
			}
								
			stmt.close();
			conn.close();
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Usuario: "+ e);
		}
		
	}
}
