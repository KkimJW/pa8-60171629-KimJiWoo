
public class Triangle extends Shape { ////Shape를 상속받는 자식클래스 Triangle 이등변삼각형
	double bottom; //이등변삼각형의 밑변
	double width; //이등변삼각형의 높이
	double hypotenuse; //이등변삼각형의 빗변
	
	/* Shape클래스에서 상속받아 사용할 수 있는 x와 y에 대해 클래스 전체에서의 x와 y가 Triangle(double x, double y, ...)의 x,y가 되도록 설정
	클래스 전체에서 bottom과 width가 Triangle(..., double bottom, double width)의 bottom과 width가 되도록 설정 */
	Triangle (double x, double y, double bottom, double width) {
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.width = width;
	}
	
	//이등변삼각형의 넓이로 재정의
	@Override
	public double getArea() {
		area = (bottom*width)/2;
		return area;
	}
	
	//이등변삼각형의 둘레로 재정의
	@Override
	public double getLength() {
		hypotenuse = Math.sqrt(Math.pow(bottom/2, 2) + Math.pow(width, 2)); //피타고라스의 정리 사용
		length = hypotenuse*2 + bottom;
		return length;
	}
	
	//draw 상속받아서 재정의
	@Override
	public void draw() {
		//이등변삼각형의 (좌하단 좌표)-(중앙상단 좌표)-(우하단 좌표)
		System.out.println("Triangle (" + (double)(x-bottom/2) + ", " + (double)(y-width) + ")-(" + x + "," + y + ")-(" 
		+ (double)(x+bottom) + ", " + (double)(y-width));
	}
	
	//move 상속받아서 재정의
	@Override
	public void move(double dx, double dy) {
	}
}