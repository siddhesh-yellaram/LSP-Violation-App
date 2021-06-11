package com.techlab.test;

import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class ShapesTest {
	public static void main(String []args) {
		Rectangle rect = new Rectangle(150,200);
		shouldNotChangeWidthIfHeightIsModified(rect);
		Square sq = new Square(200);
		shouldNotChangeWidthIfHeightIsModified(sq);
		
	}
	
	private static void shouldNotChangeWidthIfHeightIsModified(Rectangle rect) {
		int beforeWidth = rect.getWidth();
		rect.setHeight(rect.getHeight() + 200);
		int afterWidth = rect.getWidth();
		System.out.println(beforeWidth == afterWidth);
	}
}
