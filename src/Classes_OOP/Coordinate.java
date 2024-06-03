package Classes_OOP;
import java.util.Scanner;
class Coordinate {
    private int x, y;
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {return x;}
    public int getY() {return y;}
}
class Geometry{
    public double Length(Coordinate a, Coordinate b){
        return  Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2));
    }
}
class Triangle{
    private Coordinate a, b, c;
    public Triangle(Coordinate a, Coordinate b, Coordinate c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        a = new Coordinate(x1, y1);
        b = new Coordinate(x2, y2);
        c = new Coordinate(x3, y3);
    }
    public double S(){
        Geometry geometry = new Geometry();
        double a = geometry.Length(this.a, this.b);
        double b = geometry.Length(this.b, this.c);
        double c = geometry.Length(this.c, this.a);
        double p = (a+b+c) / 2;
        return Math.sqrt(p * (p-a)*(p-b)*(p-c));
    }
}
class Polygon{
    private Coordinate[] points;
    public Polygon(Coordinate[] points){
        this.points = points;
    }
    public Polygon(int n){
        Scanner scan = new Scanner(System.in);
        points = new Coordinate[n];
        for (int i = 0; i < points.length; i++){
            points[i] = new Coordinate(scan.nextInt(), scan.nextInt());
        }
    }
    public double P(){
        double result = 0;
        Geometry geometry = new Geometry();
        for (int i = 0; i < points.length; i++)
            result += geometry.Length(points[i], points[i+1]);

        result += geometry.Length(points[0], points[points.length-1]);
        return result;
    }
}
