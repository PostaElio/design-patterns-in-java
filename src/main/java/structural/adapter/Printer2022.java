package structural.adapter;

public class Printer2022 {
    private String config;

    public Printer2022(String config) {
        this.config = config;
    }

    void print(String pathImage){
        //More logic
        System.out.println("Print BEST quality with Printer 2022 the image "+pathImage);
    };
    //Other functions
}
