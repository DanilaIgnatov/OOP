/*

* двумерный класс точки.

*/


public class Point2d {

//** координата X **//
private double xCoord;

// ** координата Y **//
private double yCoord;

// ** Конструктор инициализации **//
public Point2d ( double x, double y) {

	xCoord = x;
	yCoord = y;

}

// ** Конструктор по умолчанию. **//
public Point2d () {

	//Вызовите конструктор с двумя параметрами и определите источник.
	this(0, 0);

} 

// ** Возвращение координаты X **//
public double getX () {

	return xCoord;

}

// ** Возвращение координаты Y **//
public double getY () {

	return yCoord;

}

// ** Установка значения координаты X. **//
public void setX ( double val) {

	this.xCoord = val;

}

// ** Установка значения координаты Y. **//
public void setY ( double val) {

	this.yCoord = val;

}

public void displayInfo(){
        System.out.println("Точка ");
	System.out.println(xCoord);
	System.out.println(yCoord);
    }

@Override
public boolean equals(Object o) {

        Point2d point2d = (Point2d) o;
        return ((xCoord == point2d.xCoord) & (yCoord == point2d.yCoord));

    }





}