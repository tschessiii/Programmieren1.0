package Übung_PR2_Hofer.AlteKlausur;

public class Smartwatch extends Device{
    protected int nrWristSize;

    public Smartwatch(String name, Processor processor, int releaseYear, int nrProduce, int nrWristSize) {
        super(name, processor, releaseYear, nrProduce);
        this.nrWristSize = nrWristSize;
    }

    public int getNrWristSize() {
        return nrWristSize;
    }

    public void setNrWristSize(int nrWristSize) {
        this.nrWristSize = nrWristSize;
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
