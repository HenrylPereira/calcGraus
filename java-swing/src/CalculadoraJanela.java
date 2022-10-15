import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraJanela extends JFrame {

    private JComboBox<String> opcoesInicioComboBox;
    private JComboBox<String> opcoesFimComboBox;
    private String[] opcoes = {"Celsius","Kelvin","Fahrenheit"};
    private JTextField resultadoTextField;
    private JTextField campo1TextField;
    private CalculadoraCasoDeUso casoDeUso;

    public CalculadoraJanela(){
        setTitle("Meu aplicativo");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
        casoDeUso = new CalculadoraCasoDeUso();
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        opcoesInicioComboBox = new JComboBox<>(opcoes);
        opcoesFimComboBox = new JComboBox<>(opcoes);

        campo1TextField = new JTextField(10);
        resultadoTextField = new JTextField(10);
        resultadoTextField.setEnabled(false);
        JButton calcularBotao = new JButton("Calcular");
        calcularBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });

        panel.add(opcoesInicioComboBox);
        panel.add(campo1TextField);
        panel.add(opcoesFimComboBox);

        panel.add(calcularBotao);
        panel.add(resultadoTextField);

        add(panel);
    }

    private void calcularResultado() {
        int a = 0;
        try {
            a = Integer.parseInt(campo1TextField.getText());
        }catch (Exception ignored){}
        String inicio =  (String) opcoesInicioComboBox.getSelectedItem();
        String fim =  (String) opcoesFimComboBox.getSelectedItem();
        double resultado = casoDeUso.calcular(a, inicio, fim);
        resultadoTextField.setText(Double.toString(resultado));
    }


}
