package Übungen_PR2.Galerie;

public class Passepartout {
    private Color color;
    private  BoardWeight boardWeight;
    private PositionCutOut positionCutOut;
    private boolean angledCut;
    private double cutOutHeight;
    private double cutOutWidth;

    public Passepartout(Color color, BoardWeight boardWeight, PositionCutOut positionCutOut, boolean angledCut, double cutOutHeight, double cutOutWidth) {
        this.color = color;
        this.boardWeight = boardWeight;
        this.positionCutOut = positionCutOut;
        this.angledCut = angledCut;
        this.cutOutHeight = cutOutHeight;
        this.cutOutWidth = cutOutWidth;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BoardWeight getBoardWeight() {
        return boardWeight;
    }

    public void setBoardWeight(BoardWeight boardWeight) {
        this.boardWeight = boardWeight;
    }

    public PositionCutOut getPositionCutOut() {
        return positionCutOut;
    }

    public void setPositionCutOut(PositionCutOut positionCutOut) {
        this.positionCutOut = positionCutOut;
    }

    public boolean isAngledCut() {
        return angledCut;
    }

    public void setAngledCut(boolean angledCut) {
        this.angledCut = angledCut;
    }

    public double isCutOutHeight() {
        return cutOutHeight;
    }

    public void setCutOutHeight(double cutOutHeight) {
        this.cutOutHeight = cutOutHeight;
    }

    public double getCutOutWidth() {
        return cutOutWidth;
    }

    public void setCutOutWidth(double cutOutWidth) {
        this.cutOutWidth = cutOutWidth;
    }
}
