import javax.swing.*;
import java.awt.*;
public class ChessJButton extends JButton {

    public ChessJButton(String input){
        super(input);
        setBackground(new Color(230,230,239));
        setFont(new Font("Times New Roman",Font.PLAIN,14));
        setFocusable(false);
    }
}
