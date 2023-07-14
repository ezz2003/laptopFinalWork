import java.util.*;

public class ProgammLaptop {


    public static String input(String hint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint + ": ");
        String answ = scanner.nextLine();
        return answ;
    }

    public static void main(String[] args) {
        Laptop note1 = new Laptop("Acer", "16", "2000", "Windows11", "black");
        Laptop note2 = new Laptop("MSI", "8", "500", "without os", "gray");
        Laptop note3 = new Laptop("Asus", "8", "1000", "Linux", "white");
        Laptop note4 = new Laptop("HP", "8", "1000", "Windows10", "black");
        Laptop note5 = new Laptop("Lenovo", "16", "1500", "Windows11", "gray");
        Laptop note6 = new Laptop("Apple", "4", "750", "macOS", "blue");

        Products productsNotebooks = new Products();
        productsNotebooks.goods = new HashSet<>(List.of(note1, note2, note3, note4, note5));
        productsNotebooks.addData(note6);
        productsNotebooks.addData(new Laptop("MSI", "4", "1000", "Windows10", "black"));
//        System.out.println(productsNotebooks);
//        productsNotebooks.printAll();

        Map<String, String> propertyToFind = new HashMap<>();
        boolean loop = true;
        while (loop) {
            String answer = input("If enter [a] - show all products\n" +
                    "If enter [f] - find desirable product\nIf enter [q] - Quit");
            if (answer.equals("q")){
                System.out.println("BYE");
                loop =false;
            }
            else if (answer.equals("a")){
                productsNotebooks.printAll();
            }else {
                String key = input("Enter the number corresponding to the required property: "
                        + note1.getNameProperties());
                HashSet<String> setProperties = new HashSet<>(List.of(productsNotebooks.
                        listOptionsForProperties(key).trim().split(" ")));
                String value = input("Enter the options from the suggested:   "
                        + setProperties.toString());
                propertyToFind.put(key, value);
                productsNotebooks.foundGoods = new HashSet<>();
                productsNotebooks.getFoundGoods(propertyToFind);
                productsNotebooks.printFound();
//                System.out.println(productsNotebooks.getFoundGoods(propertyToFind));

            }
        }
    }


}
