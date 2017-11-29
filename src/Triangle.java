
public class Triangle extends Shape { ////Shape�� ��ӹ޴� �ڽ�Ŭ���� Triangle �̵�ﰢ��
	double bottom; //�̵�ﰢ���� �غ�
	double width; //�̵�ﰢ���� ����
	double hypotenuse; //�̵�ﰢ���� ����
	
	/* ShapeŬ�������� ��ӹ޾� ����� �� �ִ� x�� y�� ���� Ŭ���� ��ü������ x�� y�� Triangle(double x, double y, ...)�� x,y�� �ǵ��� ����
	Ŭ���� ��ü���� bottom�� width�� Triangle(..., double bottom, double width)�� bottom�� width�� �ǵ��� ���� */
	Triangle (double x, double y, double bottom, double width) {
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.width = width;
	}
	
	//�̵�ﰢ���� ���̷� ������
	@Override
	public double getArea() {
		area = (bottom*width)/2;
		return area;
	}
	
	//�̵�ﰢ���� �ѷ��� ������
	@Override
	public double getLength() {
		hypotenuse = Math.sqrt(Math.pow(bottom/2, 2) + Math.pow(width, 2)); //��Ÿ����� ���� ���
		length = hypotenuse*2 + bottom;
		return length;
	}
	
	//draw ��ӹ޾Ƽ� ������
	@Override
	public void draw() {
		//�̵�ﰢ���� (���ϴ� ��ǥ)-(�߾ӻ�� ��ǥ)-(���ϴ� ��ǥ)
		System.out.println("Triangle (" + (double)(x-bottom/2) + ", " + (double)(y-width) + ")-(" + x + "," + y + ")-(" 
		+ (double)(x+bottom) + ", " + (double)(y-width));
	}
	
	//move ��ӹ޾Ƽ� ������
	@Override
	public void move(double dx, double dy) {
	}
}