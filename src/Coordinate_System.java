class coordinate{
    public int x; public int y;
    public coordinate(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class Coordinate_System {
    public static void main(String[] args) {
        coordinate c1=new coordinate(2,3);
        coordinate c2=new coordinate(4,5);
        System.out.println(c1.x+" "+c1.y);
        System.out.println(c2.x+" "+c2.y);
    }


}
