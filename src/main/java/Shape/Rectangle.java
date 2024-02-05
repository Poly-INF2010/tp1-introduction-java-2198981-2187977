package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        Point2d dimensions = new Point2d(width, height);
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        double width = dimensions.X();
        double height = dimensions.Y();;
        for(double i = -width/2; i < width/2; i+= 0.5) {
            for (double j = -height/2; j < height/2; j+= 0.5) {
                Point2d point = new Point2d(i,j);
                add(point);
            }
        }
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        for(double i = getMinX(); i < getMaxX(); i+= 0.5) {
            for (double j = getMinY(); j < getMaxY(); i+= 0.5) {
                Point2d point = new Point2d(i,j);
                add(point);
            }
        }
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(getCoords());
    }
}
