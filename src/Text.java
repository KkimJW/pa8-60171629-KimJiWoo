//60171629 ������
public class Text implements Drawable{
	String string;
	
	//Ŭ���� ��ü������ string�� Text(String string)�� string�� �ǵ��� ����
	Text (String string) {
		this.string = string;
	}
	
	//draw ��ӹ޾Ƽ� ������
	@Override
	public void draw() {
		//ShapeTest2���� ������ ���ڿ��� ���
		System.out.println(string);
	}
}