package Übungen_PR2_Jandl.Galerie;

public class BackBoard {

    private Material material;
    private double weight;
    private Color color;
    private Fastening fastening;
    private boolean hook;
    private boolean multipleHooks;
    private boolean stand;


    public BackBoard(Material material, double weight, Color color, Fastening fastening, boolean hook, boolean multipleHooks, boolean stand) {
        this.material = material;
        this.weight = weight;
        this.color = color;
        this.fastening = fastening;
        this.hook = hook;
        this.multipleHooks = multipleHooks;
        this.stand = stand;
    }


    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Fastening getFastening() {
        return fastening;
    }

    public void setFastening(Fastening fastening) {
        this.fastening = fastening;
    }

    public boolean isHook() {
        return hook;
    }

    public void setHook(boolean hook) {
        this.hook = hook;
    }

    public boolean isMultipleHooks() {
        return multipleHooks;
    }

    public void setMultipleHooks(boolean multipleHooks) {
        this.multipleHooks = multipleHooks;
    }

    public boolean isStand() {
        return stand;
    }

    public void setStand(boolean stand) {
        this.stand = stand;
    }
}
