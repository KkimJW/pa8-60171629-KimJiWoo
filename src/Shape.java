//60171629 ������
abstract class Shape implements Drawable, Movable { //�߻�Ŭ����
	double x; //x��ǥ
	double y; //y��ǥ
	double area; //����
	double length; //�ѷ�
	
	public abstract double getArea(); //���� ���� ��� �߻�޼ҵ�
	
	public abstract double getLength(); //���� �ѷ� ��� �߻�޼ҵ�
	
	public abstract void draw(); //draw �߻�޼ҵ�
}