package DAY2.Constructors;

import java.util.Scanner;

class Shape{
    int length,Breadth,height,radius;

    static float PI=3.14f;

    Shape(){

    }
    // CUBE INITIALIZATION
    Shape(int length,int breadth,int height){
        this.length=length;
        this.Breadth=breadth;
        this.height=height;
    }
    // SPHERE
    Shape(int radius){
        this.radius=radius;
    }
    // CYLINDER
    Shape(int radius,int height){
        this.radius=radius;
        this.height=height;
    }

    public Integer calculateofCube(){
        return length*Breadth*height;
    }
    public float calculateSphere(){
        return 4f*PI*radius*radius;
    }
    public float calculateCylinder(){
        return PI*radius*radius*height;
    }


}
public class Shape_Area {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("1.CUBE\n2.SPHERE\n3.CYLINDER");
        System.out.println("Enter the choice :");
        int ch=sc.nextInt();

        switch (ch) {
            case 1:
            System.out.println("Length");
            int l=sc.nextInt();
            System.out.println("Breadth");
            int b=sc.nextInt();
            System.out.println("height");
            int h=sc.nextInt();
            Shape c=new Shape(l,b,h);
            System.out.println("CUBE: "+c.calculateofCube());
            break;
            case 2:
            System.out.println("Raduis");
            int r =sc.nextInt();
            Shape s =new Shape(r);
            System.out.println("AreaOfSphere is"+s.calculateSphere());
            break;
            case 3:
                System.out.println("Radius");
                int rc=sc.nextInt();
                System.out.println("height");
                int hc=sc.nextInt();
                Shape v=new Shape(rc,hc);
                System.out.println("AreaofCylinder: "+v.calculateCylinder());
                break;
            
            default:
                break;
        }

        sc.close();
        
    }
}
