package Aportes;

import java.awt.Color;

public class AporteXYWH extends Aporte{
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	public AporteXYWH(int x, int y, int pWidth, int pHeight, Color pColor) {
		super(x, y, pWidth, pHeight, pColor);
		this.x = x;
		this.y = y;
		this.height = pHeight;
		this.width = pWidth;
	}
	
	
}
