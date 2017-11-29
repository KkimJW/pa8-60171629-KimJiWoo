//60171629 김지우
public class Bear implements Drawable { //Drawable인터페이스를 구현하는 Bear클래스
	double centerx; //Bear로 그려지는 Rectangle의 중심점의 x좌표
	double centery; //Bear로 그려지는 Rectangle의 중심점의 y좌표
	double diameter; //<그림1>의 radius*2
	String name = "Bear";
	
	//클래스 전체에서 centerx, centery, diameter가 Bear(double centerx, double diameter)의 centerx, centery, diameter가 되도록 설정
	Bear (double centerx, double centery, double diameter){
		this.centerx = centerx;
		this.centery = centery;
		this.diameter = diameter;
	}
	
	@Override
	public void draw() {
		System.out.println(name);
		//여러개의 Drawable을 가지는 drawablesbear 생성
		Drawable[] drawablesbear = new Drawable[3];
		drawablesbear[0] = new Rectangle(centerx-diameter, centery-diameter, diameter*2, diameter*2);
		drawablesbear[1] = new Circle(centerx-diameter, centery-diameter, diameter/2);
		drawablesbear[2] = new Circle(centerx+diameter, centery-diameter, diameter/2);
		
		//drawablesbear의 모든 draw메소드 실행
		for(Drawable d: drawablesbear) {
			d.draw();
		}
	}
}