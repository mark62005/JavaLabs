public class King extends Piece {

    public King(boolean isWhite) {
        super(1_000, isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{" +
                "value='" + getValue() + '\'' +
                ", isWhite='" + isWhite() + '\'' +
                '}';
    }

}
