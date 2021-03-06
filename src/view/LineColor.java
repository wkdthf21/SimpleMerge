package view;

public enum LineColor {
	LINE_BLANK(0), LINE_PLUS(1), LINE_MINUS(2), LINE_DIFF(3);
	final private int color;
	private LineColor(int color) {
		this.color = color;
	}
	public int getColor() {
		return color;
	}
	public static LineColor getLineColor(int color) {
		switch(color) {
		case 0:
			return LineColor.LINE_BLANK;
		case 1:
			return LineColor.LINE_PLUS;
		case 2:
			return LineColor.LINE_MINUS;
		case 3:
			return LineColor.LINE_DIFF;
		default:
			return LINE_BLANK;
		}
	}
}
