package om.gov.taxoman;

import om.gov.taxoman.entity.Product;
import om.gov.taxoman.entity.User;

public class Main {
    public static void main(String[] args) {
        String[] roles = new String[2];
        roles[0] = "ADMIN";
        roles[1] = "User";
        User user=new User(1,"default","default",roles);
        Product product=new Product(1,"Iphone","Smart Phone", new String[]{"Smart phone"},500.00);
        System.out.println("my Product:" + product);



    }
}