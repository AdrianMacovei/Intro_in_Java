public class for_ {
    public static void main(String[] args) {
        //for - loop, structura repetitiva
        //de unde incepem
        //pana unde mergem
        //pasul de parcurgere
        //printam 101 dalmatieni
//        for (int i = 1; i<= 101; i++) {
//            System.out.println("Dalmatianul cu nr " + i);

        // ne ajuta sa parcurgem un array prin intermediul indexului
            int[] numere = {3, 7, 10, 20};
            for (int i = 0; i < numere.length; i++) {
                System.out.println("Elementul cu index " + i + " valoarea " + numere[i]);
            }
        // for each parcurge toate elementele din array si ajunge la valoare
            for (int numar: numere) {
                System.out.println("Numarul este: " + numar);
            }
        //parcurgme array de culori
            String[] culori = {"rous", "galben","albastru"};
            for (String culoare : culori) {
                System.out.println("Culoarea actuala este " + culoare);
            }
        //suma numerelor din array
            int[] num = {3, 6, 9, 12, 15};
            int suma = 0;
            for (int numar : num) {
                suma += numar;
            }
            System.out.println("Suma numerelor din array este " + suma);







    }
}
