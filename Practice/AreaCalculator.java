
public class AreaCalculator {

    public int area (int s){
        return s*s;
   }
   public int area (int l, int b){
    return l*b;
   }
   public double area (double r){
    return 3.14*r*r;
   }

   public static void main(String[] args){
    AreaCalculator ar = new AreaCalculator();
    System.out.println("square: " + ar.area(5));
    System.out.println("rectangle: " + ar.area(5,10));
    System.out.println("circle: " + ar.area(7.5));
   }
   
}