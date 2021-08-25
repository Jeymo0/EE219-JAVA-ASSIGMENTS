import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;
public class ChessApp {
    JFrame frame = new JFrame("Chess Position Display App");
    private Board border = new Board();
    private JPanel Panel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private JTextField textField = new JTextField();
    public final static Color BGcolor = new Color(30,30,30);

    public static void main(String args[]) {

        ChessApp one = new ChessApp();

    }
    public  ChessApp(){
        frame.setLayout(new BorderLayout());
        frame.add(border, BorderLayout.PAGE_START);
        frame.add(Panel, BorderLayout.PAGE_END);
        frame.setSize(new Dimension(740,820));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ChessJButton load = new ChessJButton("Set Position");
        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                border.clear();
                FENNotation.setupPosition(border, textField.getText());
            }
        });

        ChessJButton get = new ChessJButton("Get Position");
        get.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(FENNotation.getPosition(border));
            }
        });

        buttonPanel.setBackground(BGcolor);
        buttonPanel.add(load);
        buttonPanel.add(new JLabel("       "));
        buttonPanel.add(get);

        textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        textField.setBackground(new Color(240,240,240));

        Panel.setLayout(new BorderLayout());
        Panel.setBackground(BGcolor);
        Panel.setBorder(BorderFactory.createMatteBorder(20,20,20,20, BGcolor));
        Panel.add(textField, BorderLayout.PAGE_START);
        JLabel space = new JLabel(" ");
        space.setBackground(BGcolor);
        Panel.add(space, BorderLayout.CENTER);
        Panel.add(buttonPanel, BorderLayout.PAGE_END);
    }



}
