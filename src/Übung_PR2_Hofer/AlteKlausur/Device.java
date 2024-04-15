package Übung_PR2_Hofer.AlteKlausur;

import javax.swing.plaf.SplitPaneUI;

public abstract class Device {
    protected String name;
    protected Processor processor;
    protected int releaseYear;
    protected int nrProduce;


    public Device(String name, Processor processor, int releaseYear, int nrProduce) {
        this.name = name;
        this.processor = processor;
        this.releaseYear = releaseYear;
        this.nrProduce = nrProduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNrProduce() {
        return nrProduce;
    }

    public void setNrProduce(int nrProduce) {
        this.nrProduce = nrProduce;
    }



    public abstract double calculateProductionCost();

    public abstract double calculateSupportCostForAYear(int year);


}
