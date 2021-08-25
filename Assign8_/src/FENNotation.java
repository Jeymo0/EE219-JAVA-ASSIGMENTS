public class FENNotation {
    public static void setupPosition(Board thisBoard,String pos) {
        if (pos == null || pos.equals("")) return;
        String[] fields = pos.split(" ");
        String[] rows = fields[0].split("/");
        int row = 0;
        int col = 0;
        int i, j;
        for (i = 0; i < rows.length; i++) {
            col = 0;
            for (j = 0; j < rows[i].length(); j++) {
                String ans = rows[i].substring(j,j+1);
                if(Character.isDigit(ans.charAt(0))){
                    col+= Integer.parseInt(String.valueOf(ans));
                }
                else{
                    String pColor = Character.isUpperCase(ans.charAt(0)) ? "W" : "B";
                    String pType = ans.toUpperCase();
                    thisBoard.addPiece(row,col++,new Piece(pType,pColor));
                }

            }
            row++;
        }
    }
    public static String getPosition(Board thisBoard){
        String string = "";
        Square [] [] squares = thisBoard.getSquares();
        int i,j;
        for(i=0; i<8; i++){
            int Squarecount = 0;                            // within loop so value doesnt carry over
            for(j=0; j<8; j++){
                if (squares[i][j].isEmpty()){
                    Squarecount++;
                }
                else{
                    if(Squarecount>0){
                        string+= Integer.toString(Squarecount);
                        Squarecount=0;
                    }
                    String type = squares[i][j].getPiece().type();
                    String color = squares[i][j].getPiece().color();
                    string += color.equals("W") ? type : Character.toLowerCase(type.charAt(0));
                }
                }
            if (Squarecount >0 ){
                string+= Integer.toString(Squarecount);
                if (i<7){
                    string+= "/";
                }
            }
        }
    return string;
    }
}
