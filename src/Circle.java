//60171629 ������
public class Circle extends Shape { //Shape�� ��ӹ޴� �ڽ�Ŭ���� Circle
	double radius;
	
	/* ShapeŬ�������� ��ӹ޾� ����� �� �ִ� x�� y�� ���� Ŭ���� ��ü������ x�� y�� Circle(double x, double y, ...)�� x,y�� �ǵ��� ����
	Ŭ���� ��ü���� radius�� Circle(..., double radius)�� radius�� �ǵ��� ���� */
	Circle (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//���� ���� ������
	@Override
	public double getArea() {
		area = Math.PI*radius*radius;
		return area;
	}
	
	//���� �ѷ� ������
	@Override
	public double getLength() {
		length = Math.PI*2*radius;
		return length;
	}
	
	//draw�޼ҵ� ������
	@Override
	public void draw() {
		//(���� �߽� ��ǥ)-(���� ������)
		System.out.println("Circle center(" + x + ", " + y + ")-radius(" + radius + ")");
	}

	/*move ��ӹ޾Ƽ� ������
	10ȸ ���� x������ +10, y������ +10�ϴ� �޼ҵ�*/
	@Override
	public void move(double dx, double dy) {
		System.out.println("----------10ȸ ���� x������ +10, y������ +10----------");
		for (int i=0; i < 10; i++) {
			x = x + dx;
			y = y + dy;
			draw();
		}
	}
}
