package Shape;

import Interface.Transform;
import Point.Point2d;
import java.util.Optional;
import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;
//P
public class BaseShape extends Transform implements Cloneable {
    private final Collection<Point2d> coords;

    //helper function to clone a list of points
    public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /** TODO
     * Create a BaseShape with empty coordinades
     */
    public BaseShape() {
        this.coords = new ArrayList<>();
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        this.coords = cloneCoords(coords);
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        this.coords.add(coord.clone());
        return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        for (Point2d point : shape.coords) {
            this.add(point.clone());
        }
        return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        for (Point2d point : coords) {
            this.add(point.clone());
        }
        return this;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        this.coords.removeAll(shape.coords);
        return this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    /** TODO
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {

        this.coords.clear();
        this.coords.addAll(newCoords);
        return this;
    }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {

        Collection<Point2d> copy = new LinkedList<>(this.coords);

        return copy;
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        Collection<Point2d> copy = new LinkedList<>();
        for(Point2d point : this.coords) {
            copy.add(point.clone());
        }
        return copy;
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {
        double xMax = -Double.MAX_VALUE;
        for (Point2d point : this.coords){
            if (xMax < point.X()) {
                xMax = point.X();
            }

        }

        return xMax;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {
        double yMax = -Double.MAX_VALUE;
        for (Point2d point : this.coords){
            if (yMax < point.Y()) {
                yMax = point.Y();
            }

        }

        return yMax;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        Point2d temp_point = new Point2d(this.getMaxX(), this.getMaxY());
        return temp_point;
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {
        double xMin = Double.MAX_VALUE;
        for (Point2d point : this.coords){
            if (xMin > point.X()) {
                xMin = point.X();
            }

        }

        return xMin;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {
        double yMin = Double.MAX_VALUE;
        for (Point2d point : this.coords){
            if (yMin > point.Y()) {
                yMin = point.Y();
            }

        }

        return yMin;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        Point2d temp_point = new Point2d(this.getMinX(), this.getMinY());
        return temp_point;
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {
        BaseShape copy = new BaseShape(this.cloneCoords());
        return copy;
    }
}
