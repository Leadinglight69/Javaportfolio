public class Lens {
    private int focalLengthMin;
    private int focalLengthMax;
    public static int counter = 0;

    protected Lens(int focalLengthMin, int focalLengthMax) {
        try {
            setLens(focalLengthMin, focalLengthMax);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void setLens(int foralLengthMins, int focalLenghtMax) throws Exception {
        if (focalLenghtMax < foralLengthMins) {
            throw new Exception("Min is bigger than max");
        }
        this.focalLengthMin = foralLengthMins;
        this.focalLengthMax = focalLenghtMax;
    }


    @Override
    public String toString() {
        return "focal length min : " + focalLengthMin + " mm" + " focal length max : " + focalLengthMax + " mm";
    }

}
