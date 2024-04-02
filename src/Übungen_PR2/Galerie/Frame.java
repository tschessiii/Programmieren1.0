package Übungen_PR2.Galerie;

public class Frame {

    private double heigth;
    private double width;
    private  double depth;
    private  double frameWidth;

    private Material material;
    private Glass glass;
    private  Color color;

    private BackBoard backBoard;
    private  Passepartout passepartout;


    public Frame(double heigth, double width, double depth, double frameWidth, Material material, Glass glass, Color color, BackBoard backBoard, Passepartout passepartout) {
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
        this.frameWidth = frameWidth;
        this.material = material;
        this.glass = glass;
        this.color = color;
        this.backBoard = backBoard;
        this.passepartout = passepartout;
    }


    @Override
    public String toString() {
        return "Frame:" +
                "heigth=" + heigth +
                ", width=" + width +
                ", depth=" + depth +
                ", frameWidth=" + frameWidth +
                ", material=" + material +
                ", glass=" + glass +
                ", color=" + color +
                ", backBoard=" + backBoard +
                ", passepartout=" + passepartout;
    }
}
