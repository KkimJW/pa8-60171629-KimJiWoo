//60171629 ������
public class Bear implements Drawable { //Drawable�������̽��� �����ϴ� BearŬ����
	double centerx; //Bear�� �׷����� Rectangle�� �߽����� x��ǥ
	double centery; //Bear�� �׷����� Rectangle�� �߽����� y��ǥ
	double diameter; //<�׸�1>�� radius*2
	String name = "Bear";
	
	//Ŭ���� ��ü���� centerx, centery, diameter�� Bear(double centerx, double diameter)�� centerx, centery, diameter�� �ǵ��� ����
	Bear (double centerx, double centery, double diameter){
		this.centerx = centerx;
		this.centery = centery;
		this.diameter = diameter;
	}
	
	@Override
	public void draw() {
		System.out.println(name);
		//�������� Drawable�� ������ drawablesbear ����
		Drawable[] drawablesbear = new Drawable[3];
		drawablesbear[0] = new Rectangle(centerx-diameter, centery-diameter, diameter*2, diameter*2);
		drawablesbear[1] = new Circle(centerx-diameter, centery-diameter, diameter/2);
		drawablesbear[2] = new Circle(centerx+diameter, centery-diameter, diameter/2);
		
		//drawablesbear�� ��� draw�޼ҵ� ����
		for(Drawable d: drawablesbear) {
			d.draw();
		}
	}
}