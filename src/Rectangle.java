public class Rectangle {
    private double lowerLeftX, lowerLeftY, upperRightX, upperRightY;

    public static Rectangle LARGER = new Rectangle(2, 3, 24, 19);
    public static Rectangle SMALLER = new Rectangle(7, -5, 18, 3);

    public Rectangle(double llx, double lly, double urx, double ury) {
        this.lowerLeftX = llx;
        this.lowerLeftY = lly;
        this.upperRightX = urx;
        this.upperRightY = ury;
    }

    public Point getLowerLeft() {
        return new Point(lowerLeftX, lowerLeftY);
    }

    public Point getLowerRight() {
        return new Point(upperRightX, lowerLeftY);
    }

    public Point getUpperLeft() {
        return new Point(lowerLeftX, upperRightY);
    }

    public Point getUpperRight() {
        return new Point(upperRightX, upperRightY);
    }

    public Point[] getPoints() {
        return new Point[] {
                getLowerLeft(),
                getLowerRight(),
                getUpperRight(),
                getUpperLeft()
        };
    }


    public boolean contains(double x, double y) {
        return x >= lowerLeftX && x <= upperRightX
                && y >= lowerLeftY && y <= upperRightY;
    }
}

record Point(double x, double y) {}