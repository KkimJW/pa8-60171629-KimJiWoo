//60171629 김지우
public class Rectangle extends Shape { //Shape를 상속받는 자식클래스 Rectangle 직사각형
	double width; //직사각형 가로
	double height; //직사각형 세로
	
	/* Shape클래스에서 상속받아 사용할 수 있는 x와 y에 대해 클래스 전체에서의 x와 y가 Rectangle(double x, double y, ...)의 x,y가 되도록 설정
	클래스 전체에서 width와 height가 Rectangle(..., double width, double height)의 width와 height가 되도록 설정 */
	Rectangle (double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//직사각형의 넓이로 재정의
	@Override
	public double getArea() {
		area = width*height;
		return area;
	}
	
	//직사각형의 둘레로 재정의
	@Override
	public double getLength() {
		length = (width+height)*2;
		return length;
	}
	
	//draw 상속받아서 재정의
	@Override
	public void draw() {
		//직사각형의 (좌하단 좌표)-(우상단 좌표)
		System.out.println("Rectangle (" + x + ", " + y + ")-(" + (double)(x + width) + ", " + (double)(y + height) + ")");
	}
	
	//move 상속받아서 재정의
	@Override
	public void move(double dx, double dy) {
	}
}