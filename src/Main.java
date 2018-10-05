import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Car> list = new ArrayList<>();
        Comparator<Car> nameCost = new CarSortName().thenComparing(new CarSortCost());
        Comparator<Car> costName =new CarSortCost().thenComparing(new CarSortName());
        list.add(new Car("Audi",280));
        list.add(new Car("BMW",270));
        list.add(new Car("Audi",260));
        list.add(new Car("BMW",250));
        list.add(new Car("Ferrari",2250));
        list.add(new Car("MAZ",250));
        list.add(new Car("Volga",150));
        list.add(new Car("Audi",150));
        list.add(new Car("Audi",150));

        System.out.println(list);

        System.out.println(list.get(8).equals(list.get(7)));
        System.out.println(list.get(7).hashCode());
        System.out.println(list.get(8).hashCode());

        System.out.println("Сортировка сначала по имени, потом по цене");

        Collections.sort(list,nameCost);

        for (Car p:list) {
            System.out.println(p.getName() + " " + p.getCost());
        }

        System.out.println();
        System.out.println("Сортировка сначала по цене, потом по имени");

        Collections.sort(list,costName);

        for (Car p:list) {
            System.out.println(p.getCost() + " " + p.getName());

        }

        System.out.println(list.get(8).equals(list.get(7)));
        System.out.println(list.get(7).hashCode());
        System.out.println(list.get(8).hashCode());
    }
}
