package PBOpraktek.Super;

public class Main {
    public static void main(String[] args){
//        TriangleStyle t1 = new TriangleStyle(5, 8, "Cokelat", "Bergaris");
//        t1.showDim();
//        t1.showWarna();
//        t1.showStyle();

        TwoDShape shapes[] = new TwoDShape[3];
        shapes[0] = new Triangle(5, 4, "Cokelat");
        shapes[1] = new Rectangle(10, 5);
        shapes[2] = new Rectangle(8);

        for(int i = 0; i < shapes.length; i++){
            System.out.println("Object is " + shapes[i].getNama());
            System.out.println ("Area is "+ shapes[i].luas());
            System.out.println();
        }

        A ob1 = new A();
        B ob2 = new B();

        ob1.cek();
        ob2.cek();

        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
