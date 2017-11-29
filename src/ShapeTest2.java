//60171629 김지우
public class ShapeTest2 {
	public static void main(String[] args) {
		
		//길이가 3인 Shape배열 생성
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		//위의 배열에 있는 도형들의 넓이와 길이 출력
		for(Shape s: shapes) {
		/* %.1f: 소수 첫째짜리까지 반올림해서 표시
		   \n: 줄바꿈 */
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		
		//길이가 5인 Drawable배열 생성
		Drawable[] drawables = new Drawable[5];
		//배열의 1,2,3번째는 Shape의 draw를 따름
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		
		//배열의 4번째는 Text의 draw를 따름
		drawables[3] = new Text("Sample Text");
		//배열의 5번째는 Bear의 draw를 따름
		drawables[4] = new Bear(100, 100, 20); //(x좌표, y좌표, 한 변 길이)
		//Drawable배열에 대해 모든 draw메소드 실행
		for(Drawable d: drawables) {
			d.draw();
		}
		
		Circle circle = new Circle(100, 100, 20);
		//x축으로 +10, y축으로 +10 이동
		//circle.move(10, 10); 수행결과를 <그림3>처럼 내기 위해 move를 실행시키지않음
	}
}