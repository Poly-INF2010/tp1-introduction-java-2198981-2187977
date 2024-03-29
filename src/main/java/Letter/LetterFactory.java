package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        Rectangle highBar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle highBar2 = highBar.clone();
        double angle1 = Math.toRadians(9.5);
        double angle2 = Math.toRadians(350.5);
        highBar.rotate(highBar.getCoords(), angle1);
        highBar.translate(highBar.getCoords(), new Point2d(-maxWidth/4, 0.0));

        highBar2.translate(highBar2.getCoords(), new Point2d((maxWidth/4), 0.0));
        highBar2.rotate(highBar2.getCoords(), angle2);


        Rectangle middleBar = new Rectangle(halfMaxWidth, stripeThickness);
        //middleBar.translate(middleBar.getCoords(), new Point2d(0.0, halfMaxHeight));
        BaseShape A = new BaseShape();
        A.add(highBar);
        A.add(highBar2);
        A.add(middleBar);

        return A;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        //divise par 2 pour avoir le rayon du cercle
        double radius = halfMaxHeight/2;
        Rectangle highBar = new Rectangle(stripeThickness, maxHeight);
        Circle circle1 = new Circle(radius);
        Circle circle2 = new Circle(radius);
        Circle hole = new Circle(halfMaxWidth);
        circle1.removeAll(hole.getCoords());
        circle2.removeAll(hole.getCoords());

        highBar.translate(highBar.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        circle1.translate(circle1.getCoords(), new Point2d(0.0, -radius));
        circle2.translate(circle2.getCoords(), new Point2d(0.0, radius));


        BaseShape B = new BaseShape();
        B.add(highBar);
        B.add(circle1);
        B.add(circle2);
        return B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        Ellipse hole = new Ellipse(halfMaxWidth - halfStripeThickness, halfMaxHeight-halfStripeThickness);
        ellipse.remove(hole);
        int ajustementPosition = 5;
        Rectangle rectHole = new Rectangle(stripeThickness, halfMaxHeight);
        rectHole.translate(rectHole.getCoords(), new Point2d(stripeThickness + ajustementPosition, 0.0));
        ellipse.removeAll(rectHole.getCoords());

        BaseShape C = new BaseShape();
        C.add(ellipse);
        return C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {


        Rectangle highBar = new Rectangle(halfStripeThickness, maxHeight);
        int ajustementPosition = 5;
        highBar.translate(highBar.getCoords(), new Point2d(-halfMaxWidth+ajustementPosition, 0.0));
        Rectangle middleBar = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle middleBar2 = middleBar.clone();
        middleBar2.translate(middleBar2.getCoords(), new Point2d(0.0, -halfMaxHeight));
        Rectangle middleBar3 = middleBar.clone();
        middleBar3.translate(middleBar3.getCoords(), new Point2d(0.0, halfMaxHeight));

        BaseShape E = new BaseShape();
        E.add(highBar);
        E.add(middleBar2);
        E.add(middleBar3);
        E.add(middleBar);
        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        Rectangle highBar = new Rectangle(stripeThickness, maxHeight);
        Rectangle highBar2 = highBar.clone();
        highBar.translate(highBar.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        highBar2.translate(highBar2.getCoords(), new Point2d(halfMaxWidth, 0.0));
        Rectangle middleBar = new Rectangle(maxWidth, stripeThickness);

        BaseShape H = new BaseShape();
        H.add(highBar);
        H.add(highBar2);
        H.add(middleBar);
        return H;


    }
    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {

        Rectangle highBar = new Rectangle(halfStripeThickness, maxHeight);
        highBar.translate(highBar.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        Rectangle highBar2 = highBar.clone();
        highBar2.translate(highBar2.getCoords(), new Point2d(maxWidth, 0.0));
        double ajustementPositionN = 1.05;
        Rectangle highBar3 = new Rectangle(halfStripeThickness, maxHeight*ajustementPositionN);
        double angle = Math.toRadians(340.0);
        highBar3.rotate(highBar3.getCoords(), angle);

        BaseShape N = new BaseShape();
        N.add(highBar);
        N.add(highBar2);
        N.add(highBar3);

        return N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse letterO = new Ellipse(halfMaxWidth, halfMaxHeight);
        Ellipse hole = new Ellipse(halfMaxWidth-halfStripeThickness, halfMaxHeight-halfStripeThickness);
        letterO.remove(hole);


        BaseShape O = new BaseShape();
        O.add(letterO);

        return O;
    }

}
