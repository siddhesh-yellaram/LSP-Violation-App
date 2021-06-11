package com.techlab.model;

public class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public void setWidth(int side) {
		this.width = this.height = side;
	}
	
	@Override
	public void setHeight(int side) {
		this.height = this.width = side;
	}
}
