package Classes;

import Interface.BirdInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BirdInterface> arrayList = new ArrayList<>();
        arrayList.add(new Bird(0.5, 4));
        arrayList.add(new Falcon(1, 3, 200));
        arrayList.add(new Ostrich (2, 4, 3));

        arrayList.forEach(System.out::println);
    }
}
