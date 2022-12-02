package javaAula.javaAula.Referencias;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame{
    private JLabel lblNome, lblTipoLogradouro, lblLogradouro, lblNumeroLogradouro,
            lblTelResidencial, lblTelComercial,lblTelCelular, lblCPF,lblRG;
    private JTextField txtNome, txtLogradouro, txtNumero;
    private JFormattedTextField txtTelResidencial, txtTelComercial, txtTelCelular,
            txtCPF,txtRG;
    private JComboBox jmbTipoLogradouro;
    private Container ctn;
    private final String ruas[] = {"Rua","Avenida","Estrada"};
    public TelaCadastro()
    {

        ctn = getContentPane();
        ctn.setLayout(null);
        lblNome = new JLabel("Nome");
        lblTipoLogradouro = new JLabel("Tipo Logradouro");
        lblLogradouro = new JLabel("Logradouro");
        lblNumeroLogradouro = new JLabel("Número");
        lblTelResidencial = new JLabel("Telefone Residencial");
        lblTelComercial = new JLabel("Telefone Comercial");
        lblTelCelular = new JLabel("Telefone Celular");
        lblCPF = new JLabel("CPF");
        lblRG = new JLabel("RG");
        txtNome = new JTextField();
        txtLogradouro = new JTextField();
        txtNumero = new JTextField();
        jmbTipoLogradouro = new JComboBox(ruas);
        try {
            txtTelResidencial = new JFormattedTextField(new
                    MaskFormatter("(##)####-####"));
            txtTelComercial = new JFormattedTextField(new
                    MaskFormatter("(##)####-####"));
            txtTelCelular = new JFormattedTextField(new
                    MaskFormatter("(##)####-####"));
            txtCPF = new JFormattedTextField(new
                    MaskFormatter("###.###.###-##"));
            txtRG = new JFormattedTextField(new
                    MaskFormatter("##.###.###-#"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        lblNome.setBounds(0,0,120,20);
        txtNome.setBounds(150,0,200,20);
        lblTipoLogradouro.setBounds(0,25,120,20);
        jmbTipoLogradouro.setBounds(150,25,200,20);
        lblLogradouro.setBounds(0,50,120,20);
        txtLogradouro.setBounds(150,50,200,20);
        lblNumeroLogradouro.setBounds(0,75,120,20);
        txtNumero.setBounds(150,75,200,20);
        lblTelResidencial.setBounds(0,100,120,20);
        txtTelResidencial.setBounds(150,100,200,20);
        lblTelComercial.setBounds(0,125,120,20);
        txtTelComercial.setBounds(150,125,200,20);
        lblTelCelular.setBounds(0,150,120,20);
        txtTelCelular.setBounds(150,150,200,20);
        lblCPF.setBounds(0,175,120,20);
        txtCPF.setBounds(150,175,200,20);
        lblRG.setBounds(0,200,120,20);
        txtRG.setBounds(150,200,200,20);
        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblTipoLogradouro);
        ctn.add(jmbTipoLogradouro);
        ctn.add(lblLogradouro);
        ctn.add(txtLogradouro);
        ctn.add(lblNumeroLogradouro);
        ctn.add(txtNumero);
        ctn.add(lblTelResidencial);
        ctn.add(txtTelResidencial);
        ctn.add(lblTelComercial);
        ctn.add(txtTelComercial);
        ctn.add(lblTelCelular);
        ctn.add(txtTelCelular);
        ctn.add(lblCPF);
        ctn.add(txtCPF);
        ctn.add(lblRG);
        ctn.add(txtRG);
        setSize(370, 300);
        setVisible(true);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TelaCadastro tela = new TelaCadastro();
    }

}