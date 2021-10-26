import java.util.Objects;

// abstract class ~ template
public abstract class Piece {

    private int value;
    private boolean isWhite;

    public Piece() {}

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    // abstract method
    // child class: must override the abstract method || has to be an abstract class
    // cannot be static || final
    public void move() {}

    @Override
    public boolean equals(Object o) {
        // same memory address?
        if (this == o) return true;
        // same type?
        if (o == null || getClass() != o.getClass()) return false;

        Piece piece = (Piece) o;
        return value == piece.getValue() && isWhite == piece.isWhite();
    }

    @Override
    public String toString() {
        return "Piece{" +
                "value='" + value + '\'' +
                ", isWhite='" + isWhite + '\'' +
                '}';
    }

}
