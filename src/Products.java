import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Products {
    public HashSet<Laptop> goods;
    public HashSet<Laptop> foundGoods;
    public Laptop item;


    public Products(HashSet goods, HashSet foundGoods, Laptop item) {
        this.goods = goods;
        this.foundGoods = foundGoods;
        this.item = item;
    }

    public Products() {

    }

    public void addData(Laptop item) {
        this.goods.add(item);
    }

    public void printAll() {
        for (Object i : goods) {
            System.out.println(i);
        }
    }

    public void printFound() {
        for (Object i : foundGoods) {
            System.out.println(i);
        }
    }


    public String listOptionsForProperties(String property) {
        switch (property) {
            case "1":
                String strAnsw = "";
                for (Laptop i : this.goods) {
                    strAnsw += " " + i.getBrandName();
                }
                return strAnsw;
            case "2":
                strAnsw = "";
                for (Laptop i : this.goods) {
                    strAnsw += " " + i.getRam();
                }
                return strAnsw;
            case "3":
                strAnsw = "";
                for (Laptop i : this.goods) {
                    strAnsw += " " + i.gethDD();
                }
                return strAnsw;
            case "4":
                strAnsw = "";
                for (Laptop i : this.goods) {
                    strAnsw += " " + i.getOperatingSystem();
                }
                return strAnsw;
            case "5":
                strAnsw = "";
                for (Laptop i : this.goods) {
                    strAnsw += " " + i.getColour();
                }
                return strAnsw;
            default:
                return "INVALID OPTION";
        }
//        return property;
    }

    public HashSet<Laptop> getFoundGoods(Map<String, String> propertyToFind) {
        for (String keyToFind: propertyToFind.keySet()){
            switch (keyToFind){
                case "1":
                    for (Laptop laptop: this.goods){
                        if (laptop.getBrandName().equals(propertyToFind.get(keyToFind))){
                            foundGoods.add(laptop);
                        }
                    }
                    return foundGoods;
                case "2":
                    for (Laptop laptop: this.goods){
                        if (laptop.getRam().equals(propertyToFind.get(keyToFind))){
                            foundGoods.add(laptop);
                        }
                    }
                    return foundGoods;
                case "3":
                    for (Laptop laptop: this.goods){
                        if (laptop.gethDD().equals(propertyToFind.get(keyToFind))){
                            foundGoods.add(laptop);
                        }
                    }
                    return foundGoods;
                case "4":
                    for (Laptop laptop: this.goods){
                        if (laptop.getOperatingSystem().equals(propertyToFind.get(keyToFind))){
                            foundGoods.add(laptop);
                        }
                    }
                    return foundGoods;
                case "5":
                    for (Laptop laptop: this.goods){
                        if (laptop.getColour().equals(propertyToFind.get(keyToFind))){
                            foundGoods.add(laptop);
                        }
                    }
                    return foundGoods;
                default:
//                    return foundGoods;
            }
        }
        return foundGoods;
    }

    @Override
        public String toString () {
            return this.goods.toString();
        }

}


