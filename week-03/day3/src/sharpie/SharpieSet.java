package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    ArrayList<Sharpie> sharpieList;

    public SharpieSet (ArrayList<Sharpie> sharpieList) {
        this.sharpieList = sharpieList;
    }

    public int countUsable(){
        int counter = 0;

        for (Sharpie sharpie : sharpieList) {
            if (sharpie.inkAmount > 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public void removeTrash() {

        for (Sharpie sharpie: sharpieList
             ) {
            if (sharpie.inkAmount < 1) {
                sharpieList.remove(sharpie);
            }
        }
    }
}
