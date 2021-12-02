package pl.imiajd.adamowicz;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {


    public double getPerimeter() {
        double res = (this.width * 2) + (this.height * 2);
        return res;
    }

    public double GetArea() {
        double res = this.width * this.height;
        return res;
    }
}
