package GUI;

import java.awt.Color;
import java.awt.Shape;

public class Figura {
	private Shape shape;
    private Color color;

    public Figura(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }
    
    public void setShape(Shape pShape) {
    	this.shape = pShape;
    }
}
