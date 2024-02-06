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
        BaseShape letterA = new BaseShape();
        Rectangle left = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle horizontal = new Rectangle(halfMaxWidth, halfStripeThickness);
        Rectangle right = new Rectangle(halfStripeThickness, maxHeight);
        double angle = Math.toRadians(10);
        left.rotate(left.getCoords(), angle);
        left.translate(left.getCoords(), new Point2d(-maxWidth /4.0, 0.0));
        right.rotate(right.getCoords(), -angle);
        right.translate(right.getCoords(), new Point2d(maxWidth /4.0, 0.0));
        horizontal.translate(horizontal.getCoords(), new Point2d(0.0, -maxWidth / 5));


        letterA.add(left);
        letterA.add(horizontal);
        letterA.add(right);

        return letterA;





    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();
        Rectangle standing = new Rectangle(stripeThickness, maxHeight);
        Circle bubble = new Circle(halfMaxWidth );
        Circle topO = new Circle(halfMaxHeight / 2.0);
        Circle bottomO = new Circle(halfMaxHeight / 2.0);
        topO.removeAll(bubble.getCoords());
        bottomO.removeAll(bubble.getCoords());
        topO.translate(topO.getCoords(), new Point2d(0.0, -halfMaxHeight / 2.0));
        bottomO.translate(bottomO.getCoords(), new Point2d(0.0, halfMaxHeight / 2.0));
        standing.translate(standing.getCoords(), new Point2d(-halfMaxWidth, 0.0));

        letterB.add(standing);
        letterB.add(topO);
        letterB.add(bottomO);


        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();
        Ellipse ellipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        Ellipse ellipseHole = new Ellipse(halfMaxWidth - halfStripeThickness, halfMaxHeight - halfStripeThickness);
        ellipse.remove(ellipseHole);
        Rectangle rectangleHole = new Rectangle(stripeThickness, halfMaxHeight);
        rectangleHole.translate(rectangleHole.getCoords(), new Point2d(stripeThickness + 5, 0.0));
        ellipse.removeAll(rectangleHole.getCoords());

        letterC.add(ellipse);

        return letterC;

    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();
        Rectangle pillar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle top = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle middle = top.clone();
        Rectangle bottom = top.clone();
        pillar.translate(pillar.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        top.translate(top.getCoords(), new Point2d(0.0, halfMaxHeight));
        bottom.translate(bottom.getCoords(), new Point2d(0.0, -halfMaxHeight));

        letterE.add(pillar);
        letterE.add(top);
        letterE.add(middle);
        letterE.add(bottom);

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();
        Rectangle leftRectangle = new Rectangle(stripeThickness, maxHeight);
        Rectangle rightRectangle = leftRectangle.clone();
        Rectangle middleRectangle = new Rectangle(halfMaxHeight, stripeThickness);
        leftRectangle.translate((leftRectangle.getCoords()), new Point2d(-halfMaxWidth, 0.0));
        rightRectangle.translate((rightRectangle.getCoords()), new Point2d(halfMaxWidth, 0.0));

        letterH.add(leftRectangle);
        letterH.add(rightRectangle);
        letterH.add(middleRectangle);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();
        double angle = Math.toRadians(-20);
        Rectangle leftRectangle = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rightRectangle = leftRectangle.clone();
        Rectangle diagonal = leftRectangle.clone();
        leftRectangle.translate(leftRectangle.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        rightRectangle.translate(rightRectangle.getCoords(), new Point2d(halfMaxWidth, 0.0));
        diagonal.rotate(diagonal.getCoords(), angle);

        letterN.add(leftRectangle);
        letterN.add(rightRectangle);
        letterN.add(diagonal);


        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();
        Ellipse ellipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        Ellipse ellipseHole = new Ellipse(halfMaxWidth - halfStripeThickness, halfMaxHeight - halfStripeThickness);
        ellipse.remove(ellipseHole);

        letterO.add(ellipse);
        return letterO;
    }

}
