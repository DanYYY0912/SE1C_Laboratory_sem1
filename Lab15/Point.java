public class Point {
    private int x;
    private int y;
    
    public Point() {
        this(0, 0);
    }
    
    public Point(int x, int y) {
        setPoint(x, y);
    }
    
    public void setPoint(int x, int y) {
        if (x>=0 && y>=0) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int getX() { return x;} 

    public int getY() { return y;}

    public double distance(Point p) {
        double distance = Math.sqrt(Math.pow((p.getX()-x), 2) + Math.pow((p.getY()-y), 2));
        return distance;
     }
} 
