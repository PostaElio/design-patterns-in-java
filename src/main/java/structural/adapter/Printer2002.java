package structural.adapter;

public class Printer2002 implements Printer{

    @Override
    public void qualityLow(String pathImage) {
        System.out.println("Print low quality with Printer 2002 the image "+pathImage);
    }

    @Override
    public void qualityHigth(String pathImage) {
        System.out.println("Print higth quality with Printer 2002 the image "+pathImage);
    }
}
