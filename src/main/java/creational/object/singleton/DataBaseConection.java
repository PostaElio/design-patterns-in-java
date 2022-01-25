package creational.object.singleton;

public class DataBaseConection {
    private static DataBaseConection dataBaseConection;

    public static DataBaseConection getInstance(){
        if(dataBaseConection==null){
            dataBaseConection = new DataBaseConection();
        }
        return dataBaseConection;
    }
}
