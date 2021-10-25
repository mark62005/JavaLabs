public class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(1, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
