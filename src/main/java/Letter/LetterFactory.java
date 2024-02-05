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
        return null;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        return null;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        return null;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {


        Rectangle highBar = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle middleBar = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle middleBar2 = middleBar.clone();
        middleBar2.translate(middleBar2.getCoords(), new Point2d(0.0, halfMaxHeight));
        Rectangle middleBar3 = middleBar.clone();
        middleBar3.translate(middleBar2.getCoords(), new Point2d(0.0, (maxHeight - halfStripeThickness)));

        BaseShape E = new BaseShape();
        E.add(highBar);
        E.add(middleBar2);
        E.add(middleBar3);
        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        Rectangle highBar = new Rectangle(stripeThickness, maxHeight);
        Rectangle highBar2 = highBar.clone();
        highBar2.translate(highBar2.getCoords(), new Point2d((maxWidth-stripeThickness), 0.0));
        Rectangle middleBar = new Rectangle(maxWidth, stripeThickness);
        middleBar.translate(middleBar.getCoords(), new Point2d(0.0, halfMaxHeight));

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
        Rectangle highBar2 = highBar.clone();
        highBar2.translate(highBar2.getCoords(), new Point2d((maxWidth-halfStripeThickness), 0.0));
        Rectangle highBar3 = highBar2.clone();
        highBar3.rotate(highBar3.getCoords(), 315.0);

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
        return null;
    }

}
