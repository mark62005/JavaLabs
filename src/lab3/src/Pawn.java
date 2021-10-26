public class Pawn extends Piece {

    private boolean promoted;
    private Piece newPiece;

    public Pawn(boolean isWhite) {
        super(1, isWhite);
        this.promoted = false;
        this.newPiece = null;
    }

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece) {
        super(value, isWhite);
        this.promoted = promoted;
        setNewPiece(newPiece);
    }

    public void promote(Piece newPiece) {
        setNewPiece(newPiece);
        setPromoted(true);
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(Piece newPiece) {
        if (newPiece != null) {

            if (newPiece.getClass() == Pawn.class || newPiece.getClass() == King.class) {
                throw new IllegalArgumentException("Invalid input! A pawn can only be promoted to be a queen, " +
                        "a rook, a bishop, or a knight.");
            }
            this.newPiece = newPiece;
            newPiece.setValue(this.getValue());
            newPiece.setWhite(this.isWhite());

        }
    }

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    @Override
    public boolean equals(Object o) {

        if (!super.equals(o)) return false;

        Pawn pawn = (Pawn) o;
        // check if both of them have been promoted
        if (this.promoted != pawn.isPromoted()) return false;
        // if both of them have been promoted, check if they are being promoted to the same Piece types
        if (this.promoted && pawn.promoted) {
//            if (this.newPiece == null || pawn.getNewPiece() == null) return false;
            return this.newPiece.equals(pawn.getNewPiece());
        }

        return true;

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
