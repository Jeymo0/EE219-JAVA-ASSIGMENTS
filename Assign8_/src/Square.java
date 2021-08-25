import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class Square extends JPanel{

    private Piece piece;

    public Square(Color c,Board usedBoard){
        super(new FlowLayout(FlowLayout.CENTER));
        this.setBackground(c);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) { usedBoard.squareSelected(Square.this);
            }
        });
    }
    public void setPiece(Piece p){
        this.removePiece();
        this.add(p);
        this.piece = p;
        this.validate();
        this.repaint();
    }
    public void removePiece() {
        this.piece = null;
        this.removeAll();
        this.validate();
        this.repaint();
    }
    public Piece getPiece() {
        return this.piece;
    }
    public boolean isEmpty() {
        return (this.piece == null) ? true : false;
    }
    public void highlight(Color c) {
        this.setBorder(BorderFactory.createLineBorder(c,4));
        this.repaint();
    }
    public void unhighlight() {
        this.setBorder(BorderFactory.createEmptyBorder());
        this.repaint();
    }
    }

