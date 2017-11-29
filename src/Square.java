//60171629 김지우
public class Square extends Shape { //Shape를 상속받는 자식클래스 Square 정사각형
	double width; //정사각형 가로(=세로)

	/* Shape클래스에서 상속받아 사용할 수 있는 x와 y에 대해 클래스 전체에서의 x와 y가 Square(double x, double y, ...)의 x,y가 되도록 설정
	클래스 전체에서 width가 Rectangle(..., double width)의 width가 되도록 설정 */
	Square (double x, double y, double width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	//정사각형의 넓이로 재정의
	@Override
	public double getArea() {
		area = width*width;
		return area;
	}
	
	//정사각형의 둘레로 재정의
	@Override
	public double getLength() {
		length = (width+width)*2;
		return length;
	}
	
	//draw 상속받아서 재정의
	@Override
	public void draw() {
		//정사각형의 (좌하단 좌표)-(우상단 좌표)
		System.out.println("Square (" + x + ", " + y + ")-(" + (double)(x + width) + "," + (double)(y + width) + ")");
	}

	//move 상속받아서 재정의
	@Override
	public void move(double dx, double dy) {	
	}
}
