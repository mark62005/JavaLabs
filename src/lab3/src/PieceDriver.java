import java.util.ArrayList;
import java.util.List;

public class PieceDriver {
    public static void main(String[] args) {

        Pawn pawn = new Pawn(false);
        Knight knight = new Knight(false);
        Bishop bishop = new Bishop(false);
        Rook rook = new Rook(false);
        Queen queen = new Queen(false);
        King king = new King(false);

        List<Piece> pieces = new ArrayList<>();
        pieces.add(pawn);
        pieces.add(knight);
        pieces.add(bishop);
        pieces.add(rook);
        pieces.add(queen);
        pieces.add(king);

        for (Piece p : pieces) {
            p.move();
        }

        // Check the "equals" method of Pawn
        Pawn p1 = new Pawn(1, true, true, new Queen());
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, new Queen());
        Pawn p5 = new Pawn(1, true, true, new Knight());
        Pawn p6 = new Pawn(1, true, false, null);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
        System.out.println(p2.equals(p6));

    }
}
