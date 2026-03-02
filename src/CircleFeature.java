public class CircleFeature {
private double centerX,centerY,radius;

public static CircleFeature Large = new CircleFeature(17,12,6);
public static CircleFeature Small = new CircleFeature(11,1,3);

public CircleFeature(double x, double y, double rad){
this.centerX = x;
this.centerY = y;
this.radius = rad;
}

public Point getCenter() {
return new Point(centerX,centerY);
}
private double getRadius() {
    return radius;
}

public boolean contains(double x, double y) {
    double dx = x-centerX;
    double dy = y-centerY;
    double distance = Math.sqrt(dx*dx+dy*dy);
    return distance <= radius;
}

}
record Point(double x, double y) {}