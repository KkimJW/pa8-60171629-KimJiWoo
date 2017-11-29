//60171629 김지우
public class Text implements Drawable{
	String string;
	
	//클래스 전체에서의 string이 Text(String string)의 string이 되도록 설정
	Text (String string) {
		this.string = string;
	}
	
	//draw 상속받아서 재정의
	@Override
	public void draw() {
		//ShapeTest2에서 설정한 문자열을 출력
		System.out.println(string);
	}
}