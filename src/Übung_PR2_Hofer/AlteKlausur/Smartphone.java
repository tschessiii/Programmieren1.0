package Übung_PR2_Hofer.AlteKlausur;

public class Smartphone extends Device{

    protected int nrCameras;

    public Smartphone(String name, Processor processor, int releaseYear, int nrProduce, int nrCameras) {
        super(name, processor, releaseYear, nrProduce);
        this.nrCameras = nrCameras;
    }

    public int getNrCameras() {
        return nrCameras;
    }

    public void setNrCameras(int nrCameras) {
        this.nrCameras = nrCameras;
    }


    @Override
    public double calculateProductionCost() {
        double processorKosten = processor.getGeneration()*100;
        double kameraKosten = nrCameras*20;
        if(nrProduce >= 100000 && nrProduce < 1000000){
            double mengenrabtatt = processorKosten+kameraKosten*0.1;
            return mengenrabtatt;
        }else if (nrCameras>= 10000000){
            double mengenrabatt = processorKosten+kameraKosten*0.2;
            return mengenrabatt;
        }

        return processorKosten+kameraKosten;

    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        return 0;
    }
}
