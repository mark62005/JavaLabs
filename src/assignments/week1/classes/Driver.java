package assignments.week1.classes;

public class Driver {
    public static void main(String[] args) {

        try {
            Rectangle r1 = new Rectangle(5, 7, "Blue");
            Rectangle r2 = new Rectangle(10, 2, "Green");
            Rectangle r3 = new Rectangle(15, 12, "Red");

//            System.out.println(r1);
//            System.out.println(r2);
//            System.out.println(r3);
            r1.draw();
            r2.draw();
            r3.draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
