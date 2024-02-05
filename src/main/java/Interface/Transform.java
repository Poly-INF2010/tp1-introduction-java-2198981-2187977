package Interface;

import Point.Point2d;

import java.util.Collection;
import java.util.LinkedList;

public class Transform implements Rotate, Translate{
    /** TODO
     * Rotate all points of collections given in parameters
     * with the angle given
     * @param coords collections of Point2d
     * @param angle
     * @return rotated collection
     * */
    public Collection<Point2d> rotate(Collection<Point2d> coords, Double angle) {

        Collection<Point2d> rotated_coords = new LinkedList<>();

        for (Point2d point : coords) {
            Point2d rotated_point = point.rotate(angle);
            rotated_coords.add(rotated_point);
        }

        coords.clear();
        return rotated_coords;
    }

    /** TODO
     * Translate all points of a collection by a given vector
     * @param coords Collection of Point2d
     * @param translateVector Vector of translation
     * @return translated coords
     * */
    public Collection<Point2d> translate(Collection<Point2d> coords, Point2d translateVector) {

        Collection<Point2d> translated_coords = new LinkedList<>();


        for (Point2d point : coords) {
            Point2d translated_point = point.translate(translateVector);
            translated_coords.add(translated_point);
        }

        coords.clear();
        return translated_coords;
    }
}
