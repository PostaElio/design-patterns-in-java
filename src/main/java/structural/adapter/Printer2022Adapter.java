package structural.adapter;

public class Printer2022Adapter implements Printer{
    private Printer2022 printerAapter;

    public Printer2022Adapter(Printer2022 printerAapter) {
        this.printerAapter = printerAapter;
    }

    @Override
    public void qualityLow(String pathImage) {
        //More Logic
        printerAapter.print(pathImage);
    }

    @Override
    public void qualityHigth(String pathImage) {
        //More logic
        printerAapter.print(pathImage);
    }
}
