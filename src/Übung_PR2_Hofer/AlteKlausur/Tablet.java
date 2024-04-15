package Übung_PR2_Hofer.AlteKlausur;

public class Tablet extends Device{
    protected boolean arCamera;

    public Tablet(String name, Processor processor, int releaseYear, int nrProduce, boolean arCamera) {
        super(name, processor, releaseYear, nrProduce);
        this.arCamera = arCamera;
    }

    public boolean isArCamera() {
        return arCamera;
    }

    public void setArCamera(boolean arCamera) {
        this.arCamera = arCamera;
    }

    @Override
    public double calculateProductionCost() {
        return 0;
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        return 0;
    }
}
