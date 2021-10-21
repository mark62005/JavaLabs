package assignments.week1.classes;

import java.util.regex.Pattern;

public class Rectangle {

    private int width;
    private int height;
    private String color;

    // Constructor to create a rectangle with its width and height
    public Rectangle(int width, int height) {
        this.width = Math.max(width, 1);
        this.height = Math.max(height, 1);
        this.color = "Blue";
    }

    // Constructor to create a rectangle with its width, height and color
    public Rectangle(int width, int height, String color) {

        // regex to check if color is Capitalised and more than 2 characters long and less than 20
        String colorRegex = "^[A-Z]([a-z]{1,18})$";
        Pattern pattern = Pattern.compile(colorRegex);

        // if the parameter "color" doesn't match the colorRegex, throw an Exception
        if (!pattern.matcher(color).matches()) {
            throw new IllegalArgumentException("Sorry, Color has to be Capitalized (A-Z) and more than 2 characters long and less than 20.");
        }
        this.width = Math.max(width, 1);
        this.height = Math.max(height, 1);
        this.color = color;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print(getColor().charAt(0));
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

}
