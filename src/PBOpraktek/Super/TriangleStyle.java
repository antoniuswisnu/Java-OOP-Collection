package PBOpraktek.Super;

public class TriangleStyle extends Triangle{
    private String style;

    TriangleStyle(double p, double l, String w, String s){
        super(p,l,w);
        style = s;
    }

    String getStyle(){
        return style;
    }

    void showStyle(){
        System.out.println("Style segitiga: " + style);
    }
}
