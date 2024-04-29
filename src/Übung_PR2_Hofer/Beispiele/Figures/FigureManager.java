package Übung_PR2_Hofer.Beispiele.Figures;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    protected ArrayList<Figure> figures;

    public FigureManager() {
        this.figures = new ArrayList<>();
    }

    public void add (Figure f){
        if(figures.contains(f)) {
            figures.add(f);
        }
    }

    public double getMaxPerimeter(){
        double max = 0;
        for (Figure f : figures ){
            if(f.getPerimeter()>max){
                max= f.getPerimeter();
            }
        }

        return max;
    }

    public double getAverageAreaSize(){
        double s= 0;
        for(Figure f:figures){
            s = f.getArea()+s;
        }
        s= s/ figures.size();

        return s;
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> hm = new HashMap<>();
        double ksum = 0;
        double msum = 0;
        double gsum = 0;
        for (Figure f : figures) {
            if (f.getArea() < 1000) {
                ksum = ksum + f.getArea();
            } else if (f.getArea() >= 1000 && f.getArea() <= 4999) {
                msum = msum + f.getArea();
            } else {
                gsum = gsum + f.getArea();
            }
        }
        hm.put("klein", ksum);
        hm.put("mittel", msum);
        hm.put("groß", gsum);

        return hm;
    }
}


