package javaAula.javaAula.Referencias;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Servidor extends JFrame{
    //objetos da tela
    private JLabel lblCodigo;
    private JLabel lblNome;
    private JTextField txtNome;
    private JTextField txtCodigo;
    private JLabel lblIdade;
    private JTextField txtIdade;
    private JLabel lblRa;
    private JTextField txtRa;
    private JButton btnInserir;
    private JButton btnAtualizar;
    private JButton btnExcluir;
    private JTable tabela; //objeto novo
    final DefaultTableModel modelo; //objeto novo
    private Container tela;

    public Servidor(){
        setSize(400,500);
        setTitle("Cadastro de Aluno");
        tela = getContentPane();
        tela.setLayout(null);
        //configuração dos rótulos
        lblCodigo = new JLabel("Código:");
        lblNome = new JLabel("Nome:");
        lblIdade = new JLabel("Idade:");
        lblRa = new JLabel("RA:");
        lblCodigo.setBounds(10,10,80,25);
        lblNome.setBounds(10, 45,80, 25);
        lblIdade.setBounds(10,85,80,25);
        lblRa.setBounds(10,135,80,25);
        tela.add(lblCodigo);
        tela.add(lblNome);
        tela.add(lblIdade);
        tela.add(lblRa);

        //configuração das caixas de texto
        txtCodigo = new JTextField();
        txtNome = new JTextField();
        txtIdade = new JTextField();
        txtRa = new JTextField();
        txtCodigo.setBounds(90,10,40,25);
        txtNome.setBounds(90,45,150,25);
        txtIdade.setBounds(90,85,40,25);
        txtRa.setBounds(90,135,150,25);
        tela.add(txtCodigo);
        tela.add(txtNome);
        tela.add(txtIdade);
        tela.add(txtRa);

        //configuração dos botões
        btnInserir = new JButton("Inserir");
        btnAtualizar = new JButton("Atualizar");
        btnExcluir = new JButton("Excluir");
        btnInserir.setBounds(10,170,100,50);
        btnAtualizar.setBounds(110,170,100,50);
        btnExcluir.setBounds(210,170,100,50);
        tela.add(btnInserir);
        tela.add(btnAtualizar);
        tela.add(btnExcluir);
        //configuração da tabela
        modelo = new DefaultTableModel();
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Idade");
        modelo.addColumn("RA");
        JScrollPane painel = new JScrollPane(tabela);
        painel.setBounds(10, 240, 300, 200);
        tela.add(painel);
        carregarDados();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tratamento dos eventos de clique nos botões
        btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //preencher depois
            }
        });
        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //preencher depois
            }
        });
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //preencher depois
            }
        });
    }

    private void carregarDados() {
        //preencher depois
    }
    public static void main(String[] args) {
        Servidor tela1 = new Servidor();
    }
}
