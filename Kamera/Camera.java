public class Camera {
    private String brand;
    private double megaPixels;
    private double displaySize;
    private boolean colored;
    protected Lens lens;

    public Camera(String brand, double megaPixels, double displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        Lens.counter++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    protected boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        if (isColored()) {
            return "Brand : " + brand + " megaPixels : " + megaPixels + " displaySize : " + displaySize +" cm " + colored + lens;
        } else {
            return "Brand : " + brand + " megaPixels : " + megaPixels + " displaySize : " + displaySize +" cm " +  " no colored photos " + lens;
        }
    }
}