public class Queen extends Piece {

    public Queen() {}

    public Queen(boolean isWhite) {
        super(9, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
