import javax.swing.*;
import  java.awt.*;

public class Board extends JPanel {

    private Square[][] squares = new Square[8][8];
    private Square PieceSquare;


    public Board() {
        this.setPreferredSize(new Dimension(700,700));
        this.setLayout(new GridLayout(8,8,1,1));
        this.setBorder(BorderFactory.createMatteBorder(20,20,20,20, ChessApp.BGcolor));
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                if (i % 2 == (j+1) % 2)
                    squares[i][j] = new Square(new Color(0,0,0) , this);
                else
                    squares[i][j] = new Square(new Color(250, 250, 240), this);
                this.add(squares[i][j]);
            }
        }
    }
    public void addPiece(int i, int j, Piece p) {
        squares[i][j].setPiece(p);
    }
    public static boolean movePiece(Square from, Square to) {
        if (from.getPiece() == null) return false;
        to.setPiece(from.getPiece());
        from.removePiece();
        return true;
    }

    public void clear() {
        for (int i=0; i<8; i++)
            for (int j=0; j<8; j++)
                squares[i][j].removePiece();
    }
    public void squareSelected(Square sqr) {
        if (PieceSquare == null && sqr.isEmpty()) // no square previously selected and selected square is empty
            return;
        if (PieceSquare == null) { // no source square previously selected
            PieceSquare = sqr;
            sqr.highlight(Color.blue);
        }
        else if (sqr == PieceSquare) { // deselecting a selected source square
            sqr.unhighlight();
            PieceSquare = null;
        }
        else { // move piece to selected square
            movePiece(PieceSquare, sqr);
            PieceSquare.unhighlight();
            PieceSquare = null; // no square selected now
        }
    }
    public Square[][] getSquares() { return squares; }


}

