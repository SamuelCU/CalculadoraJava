import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class form1 {
    protected JPanel calculadora;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton xButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button8;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button12;
    private JButton DELButton;
    private JButton ACButton;
    private JButton a0Button;
    private JButton button16;
    private JButton button17;
    private JButton logButton;
    private JButton lnButton;
    private JButton tanButton;
    private JButton button21;
    private JButton sinButton;
    private JButton cosButton;
    private JButton button24;
    protected JLabel display;
    private JLabel display2;

    double a, b, result, radians ;
    String op;

    public form1() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                display.setText("");
                display2.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a9Button.getText());

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a4Button.getText());

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a5Button.getText());

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a6Button.getText());

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a1Button.getText());

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a3Button.getText());

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a0Button.getText());

            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().contains(".")){
                    display.setText(display.getText()+button16.getText());
                }

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                display2.setText(String.valueOf(a)+"+");
                op = "+";
                display.setText("");
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                display2.setText(String.valueOf(a)+"-");
                op = "-";
                display.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                display2.setText(String.valueOf(a)+"*");
                op = "*";
                display.setText("");
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                display2.setText(String.valueOf(a)+"÷");
                op = "/";
                display.setText("");
            }
        });
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (display.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(display.getText());
                    strB.deleteCharAt(display.getText().length() -1);
                    backspace= String.valueOf(strB);
                    display.setText(backspace);
                }

            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().contains(".")){
                    double pm= Double.parseDouble(display.getText());
                    pm = pm*-1;
                    display.setText(String.valueOf(pm));
                }else{
                    long PM = Long.parseLong(display.getText());
                    PM = PM*-1;
                    display.setText(String.valueOf(PM));
                }
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(display.getText());
                display.setText("Log("+display.getText()+")");

                result = Math.log10(a);

                display2.setText("Log("+String.valueOf(a)+")");
                display.setText(String.valueOf(result));


            }
        });

        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    b = Double.parseDouble(display.getText());
                    if (op == "+") {
                        result = a + b;
                        display2.setText(String.valueOf(a) + "+" + String.valueOf(b) + "=");
                        display.setText(String.valueOf(result));
                    } else if (op == "-") {
                        result = a - b;
                        display2.setText(String.valueOf(a) + "-" + String.valueOf(b) + "=");
                        display.setText(String.valueOf(result));
                    } else if (op == "*") {
                        result = a * b;
                        display2.setText(String.valueOf(a) + "*" + String.valueOf(b) + "=");
                        display.setText(String.valueOf(result));
                    } else if (op == "/") {
                        try {
                            result = a / b;
                            display2.setText(String.valueOf(a) + "/" + String.valueOf(b) + "=");
                            display.setText(String.valueOf(result));
                        } catch (Exception ex) {
                            display.setText("Indefinido. No se puede Dividir por cero");
                        }

                    }


            }
        });

        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                display.setText("Ln("+display.getText()+")");

                result = Math.log(a);

                display2.setText("Ln("+String.valueOf(a)+")");
                display.setText(String.valueOf(result));
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                radians = Math.toRadians(a);
                display.setText("sin("+display.getText()+")");

                result = Math.sin(radians);
                display2.setText("sin("+String.valueOf(a)+")");
                display.setText(String.valueOf(result));
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                radians = Math.toRadians(a);
                display.setText("cos("+display.getText()+")");

                result = Math.cos(radians);
                display2.setText("cos("+String.valueOf(a)+")");
                display.setText(String.valueOf(result));

            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                radians = Math.toRadians(a);
                display.setText("tan("+display.getText()+")");

                result = Math.tan(radians);
                display2.setText("tan("+String.valueOf(a)+")");
                display.setText(String.valueOf(result));
            }
        });
    }
}
