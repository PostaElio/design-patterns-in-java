package structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Printer printer2002, printer2022;
        printer2002 = new Printer2002();
        printer2022 = new Printer2022Adapter(new Printer2022("Best Config"));

        printer2002.qualityLow("/path/to/image1.png");
        printer2002.qualityHigth("/path/to/image2.png");
        System.out.println("---");
        printer2022.qualityLow("/path/to/image1.png");
        printer2022.qualityHigth("/path/to/image2.png");
        List<String> wea = List.of("String","String","wea");

        /*  ALGORITMO
        Function<List<String>,List<String>> eliminateDuplicates = (List<String> list) -> {
            System.out.println(list);
            List<String> listaSinDuplicados = new ArrayList<>();
            for (String actual : list) {
                //if(!listaSinDuplicados.stream().anyMatch(letra -> letra.equals(actual))){
                if(!listaSinDuplicados.contains(actual)){
                    listaSinDuplicados.add(actual);
                }
            }
            System.out.println(listaSinDuplicados);
            return listaSinDuplicados;
        };

        eliminateDuplicates.apply(wea);*/
    }
}
