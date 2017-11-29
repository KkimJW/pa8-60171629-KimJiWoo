//60171629 김지우
public class Circle extends Shape { //Shape를 상속받는 자식클래스 Circle
	double radius;
	
	/* Shape클래스에서 상속받아 사용할 수 있는 x와 y에 대해 클래스 전체에서의 x와 y가 Circle(double x, double y, ...)의 x,y가 되도록 설정
	클래스 전체에서 radius가 Circle(..., double radius)의 radius가 되도록 설정 */
	Circle (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//원의 넓이 재정의
	@Override
	public double getArea() {
		area = Math.PI*radius*radius;
		return area;
	}
	
	//원의 둘레 재정의
	@Override
	public double getLength() {
		length = Math.PI*2*radius;
		return length;
	}
	
	//draw메소드 재정의
	@Override
	public void draw() {
		//(원의 중심 좌표)-(원의 반지름)
		System.out.println("Circle center(" + x + ", " + y + ")-radius(" + radius + ")");
	}

	/*move 상속받아서 재정의
	10회 동안 x축으로 +10, y축으로 +10하는 메소드*/
	@Override
	public void move(double dx, double dy) {
		System.out.println("----------10회 동안 x축으로 +10, y축으로 +10----------");
		for (int i=0; i < 10; i++) {
			x = x + dx;
			y = y + dy;
			draw();
		}
	}
}
