class Point3d extends Point2d{

//** ���������� Z **//
private double zCoord;

public Point3d (double x, double y, double z) {

	super(x, y);
	zCoord = z;

}



// ** ����������� �� ���������. **//
public Point3d () {

	//�������� ����������� � ����� ����������� � ���������� ��������.
	this(0, 0, 0);

} 

// ** ����������� ���������� Z **//
public double getZ () {

	return zCoord;

}

// ** ��������� �������� ���������� Z. **//
public void setZ ( double val) {

	zCoord = val;

}

@Override
public void displayInfo(){

	super.displayInfo();          
        System.out.println(zCoord);
    }

@Override
public boolean equals(Object o){

	super.equals();
        Point3d point3d = (Point3d) o;
        return (zCoord == point3d.zCoord);

    }


}