
public class ads2 {
    private double height;
    private double width;
    private double breadth;

    public ads2(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    public void displayDimensions() {
        System.out.println("Compartment Dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
    }
}
