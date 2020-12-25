/*

* ��������� ����� �����.

*/


public class Point2d {

//** ���������� X **//
private double xCoord;

// ** ���������� Y **//
private double yCoord;

// ** ����������� ������������� **//
public Point2d ( double x, double y) {

	xCoord = x;
	yCoord = y;

}

// ** ����������� �� ���������. **//
public Point2d () {

	//�������� ����������� � ����� ����������� � ���������� ��������.
	this(0, 0);

} 

// ** ����������� ���������� X **//
public double getX () {

	return xCoord;

}

// ** ����������� ���������� Y **//
public double getY () {

	return yCoord;

}

// ** ��������� �������� ���������� X. **//
public void setX ( double val) {

	this.xCoord = val;

}

// ** ��������� �������� ���������� Y. **//
public void setY ( double val) {

	this.yCoord = val;

}

public void displayInfo(){
        System.out.println("����� ");
	System.out.println(xCoord);
	System.out.println(yCoord);
    }

@Override
public boolean equals(Object o) {

        Point2d point2d = (Point2d) o;
        return ((xCoord == point2d.xCoord) & (yCoord == point2d.yCoord));

    }





}