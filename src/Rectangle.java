//60171629 ������
public class Rectangle extends Shape { //Shape�� ��ӹ޴� �ڽ�Ŭ���� Rectangle ���簢��
	double width; //���簢�� ����
	double height; //���簢�� ����
	
	/* ShapeŬ�������� ��ӹ޾� ����� �� �ִ� x�� y�� ���� Ŭ���� ��ü������ x�� y�� Rectangle(double x, double y, ...)�� x,y�� �ǵ��� ����
	Ŭ���� ��ü���� width�� height�� Rectangle(..., double width, double height)�� width�� height�� �ǵ��� ���� */
	Rectangle (double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//���簢���� ���̷� ������
	@Override
	public double getArea() {
		area = width*height;
		return area;
	}
	
	//���簢���� �ѷ��� ������
	@Override
	public double getLength() {
		length = (width+height)*2;
		return length;
	}
	
	//draw ��ӹ޾Ƽ� ������
	@Override
	public void draw() {
		//���簢���� (���ϴ� ��ǥ)-(���� ��ǥ)
		System.out.println("Rectangle (" + x + ", " + y + ")-(" + (double)(x + width) + ", " + (double)(y + height) + ")");
	}
	
	//move ��ӹ޾Ƽ� ������
	@Override
	public void move(double dx, double dy) {
	}
}