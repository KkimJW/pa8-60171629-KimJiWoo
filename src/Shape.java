//60171629 김지우
abstract class Shape implements Drawable, Movable { //추상클래스
	double x; //x좌표
	double y; //y좌표
	double area; //넓이
	double length; //둘레
	
	public abstract double getArea(); //도형 넓이 계산 추상메소드
	
	public abstract double getLength(); //도형 둘레 계산 추상메소드
	
	public abstract void draw(); //draw 추상메소드
}