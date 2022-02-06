package structural.composite;

public class Main {

    public static void main(String[] args) {
        Box boxPrincipal,box1;
        Product product1,product2,product3,product4,product5;
        boxPrincipal = new Box(1L,1L);

        product1 = new Product(5L,2L,"Car Toy");
        product2 = new Product(10L,2L,"MIC");

        box1 = new Box(1L,1L);

        product3 = new Product(1L,1L,"Pencil");
        product4 = new Product(100L,2L,"SSD");
        product5 = new Product(50L,2L,"USB");

        boxPrincipal.addComponent(product1);
        boxPrincipal.addComponent(product2);
        boxPrincipal.addComponent(box1);
        box1.addComponent(product3);
        box1.addComponent(product4);
        box1.addComponent(product5);


        System.out.println("La caja costo :"+ boxPrincipal.getPriceTotal());
        System.out.println("El peso de la caja es :"+boxPrincipal.getweightTotal());
    }
}
