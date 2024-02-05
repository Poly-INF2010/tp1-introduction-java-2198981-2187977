package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        for(double i = -widthDiameter; i < widthDiameter; i+=0.5){
            for(double j = -heightDiameter; j < heightDiameter; j+=0.5){
                if(Math.pow(i / widthDiameter, 2) + Math.pow(j / heightDiameter, 2) <= 1){
                    add(new Point2d(i,j));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        Ellipse copiedEllipse = new Ellipse(getCoords());
        return copiedEllipse;
    }
}
