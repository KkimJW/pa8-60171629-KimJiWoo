//60171629 ������
public class Square extends Shape { //Shape�� ��ӹ޴� �ڽ�Ŭ���� Square ���簢��
	double width; //���簢�� ����(=����)

	/* ShapeŬ�������� ��ӹ޾� ����� �� �ִ� x�� y�� ���� Ŭ���� ��ü������ x�� y�� Square(double x, double y, ...)�� x,y�� �ǵ��� ����
	Ŭ���� ��ü���� width�� Rectangle(..., double width)�� width�� �ǵ��� ���� */
	Square (double x, double y, double width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	
	//���簢���� ���̷� ������
	@Override
	public double getArea() {
		area = width*width;
		return area;
	}
	
	//���簢���� �ѷ��� ������
	@Override
	public double getLength() {
		length = (width+width)*2;
		return length;
	}
	
	//draw ��ӹ޾Ƽ� ������
	@Override
	public void draw() {
		//���簢���� (���ϴ� ��ǥ)-(���� ��ǥ)
		System.out.println("Square (" + x + ", " + y + ")-(" + (double)(x + width) + "," + (double)(y + width) + ")");
	}

	//move ��ӹ޾Ƽ� ������
	@Override
	public void move(double dx, double dy) {	
	}
}
