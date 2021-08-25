import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
public class Piece extends JLabel{
    private String pType;
    private String pColor;

    public String type(){return pType;}
    public String color(){return pColor;}

    public Piece(String Type,String Color){
        this.pType=Type;
        this.pColor=Color;
        String imageFile = "pieceimages/" + pType + pColor + ".png";
        Image pieceImage = null;
        try {
            pieceImage = ImageIO.read(getClass().getResource(imageFile));
            pieceImage = pieceImage.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        } catch (Exception e) {
            System.out.println(pType + pColor + " is not a valid piece!");
            return;
        }
        this.setIcon(new ImageIcon(pieceImage));
    }

    }

