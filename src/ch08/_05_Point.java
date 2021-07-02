package ch08;

import java.io.Serializable;

public class _05_Point {
	private int x;
	private int y;

	public _05_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + " y = " + y;
	}
}