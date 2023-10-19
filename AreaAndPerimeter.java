import java.util.*;
public class AreaAndPerimeter {
    public static double findArea(double r){
        double  area = 3.14*r*r;
        return area;
    }
    public static double findPerimeter(double r){
        double perimeter = 2*3.14*r;
        return perimeter;
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = findArea(r);
        System.out.println(area);
        double perimeter =  findPerimeter(r);
        System.out.println(perimeter);
         
    }
}
