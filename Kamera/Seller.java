import java.sql.SQLOutput;

public class Seller {
    public static void main(String[] args) throws Exception {
        Lens lens1 =new Lens(20,100);
        Lens lens2 =new Lens(10,100);
        Lens lens3 = new Lens(40, 50);
        Lens lens4 = new Lens(30,50);

        Camera cam1 = new Camera("Sony", 50.5,7.5,true, lens1);
        Camera cam2 = new Camera("Samsung", 45,5.5, true, lens2);
        Camera cam3 = new Camera("Huawai", 30, 4.9, false, lens3);
        Camera cam4 = new Camera("Canon",30,4.5,false,lens4 );

        System.out.println(cam1);
        System.out.println(cam2);
        System.out.println(cam3);
        System.out.println(cam4);

        lens1.setLens(25,105);
        lens2.setLens(15,95);
        lens3.setLens(30,40);

        System.out.println("\n" + cam1);
        System.out.println(cam2);
        System.out.println(cam3 + "\n");

        cam3.setBrand("Huwai");
        cam3.setMegaPixels(52.4);
        cam3.setLens(cam2.getLens());
        cam3.setDisplaySize(cam1.getDisplaySize());
        cam3.setColored(cam1.isColored());
        System.out.println(cam3);

        cam4.setBrand("Canonx2");
        cam4.setMegaPixels(55.3);
        cam4.setLens(cam1.getLens());
        cam4.setDisplaySize(cam2.getDisplaySize());
        cam4.setColored(cam2.isColored());
        System.out.println(cam4);
    }
}
