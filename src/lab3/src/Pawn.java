public class Pawn extends Piece {

    private boolean promoted;
    private Piece newPiece;

    public Pawn(boolean isWhite) {
        super(1, isWhite);
        this.promoted = false;
        this.newPiece = null;
    }

    public void promote(Piece newPiece) {
        if (newPiece.getClass() == Pawn.class || newPiece.getClass() == King.class) {
            throw new IllegalArgumentException("Invalid input! A pawn can only be promoted to be a queen, a rook, a bishop, or a knight.");
        }

        this.newPiece = newPiece;
        setPromoted(true);
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    @Override
    public boolean equals(Object o) {
        // if they have the same memory address and the same type
        if (!super.equals(o)) return false;

        Pawn pawn = (Pawn) o;
        // check if both of them have been promoted, and being promoted to the same Piece types
        return this.promoted == pawn.isPromoted() && this.newPiece.equals(pawn.getNewPiece());
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
