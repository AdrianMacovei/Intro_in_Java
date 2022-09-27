import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<String>();
        fructe.add("mere"); // adaugam elemente in lista
        fructe.add("banana");
        fructe.add("portocala");
        //au o dimensiune dinamica
        //cum se iau elemente
        System.out.println(fructe.get(0));
        //cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));
        System.out.println(fructe.isEmpty());
        //eliminam toate elementele din lists fructe.clear()
        //scoatem un element
        fructe.remove("mere");
        System.out.println(fructe);
        if (!fructe.isEmpty()) {
            System.out.println("nu tinem ore");
        }
        //declaram o lista imuabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(1, 33, 77);
        System.out.println(Arrays.toString(numere.toArray()));

        // declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);      //aflam unde este Poppy
        int poppy_index = flowerList.indexOf("Poppy");
        //stergem ce este in pozitie
        flowerList.remove(poppy_index);
        System.out.println(flowerList);       //scoatem in functie de valoare
        flowerList.remove("Catmint");
        System.out.println(flowerList);

    }
}
