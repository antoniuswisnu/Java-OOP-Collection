package UASno3;

import java.util.ArrayList;

public class Belanja extends Throwable{
    ArrayList<String> listBelanja = new ArrayList<>();

    public Belanja(){
        //listBelanja.add("Sayur Asem");
    }

    void checkout() throws Exception{
        if(listBelanja.size() == 0){
            throw new Exception();
        }
        System.out.println(listBelanja);
    }
}
