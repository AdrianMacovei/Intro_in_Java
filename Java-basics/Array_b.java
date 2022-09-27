public class Arra {
    public static void main(String[] args) {
        //declarare si initializare
        String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] numere = {1, 33, 81, 99, 201};
        //contine mai multe elemente de acelasi tip
        //accesam elementele prin index care incepe de la 0
        //are o dimensiune fixa
        //are proprietatea length care ne da dimensiunea array-ului
//        elevi[2] = "Sebi";
//        System.out.println(elevi[2]);
//        System.out.println(elevi.length);
//        // putem sa ne jucam cu valorile din spate
//        System.out.println(elevi[0] + " " + elevi[1]); // Gigel + Costel
//        System.out.println(elevi.length + 5);
        // sa printam tot timpul ultimul element indiferent de marime
        // utilizam aceasta var pentru a depozita val length -ului
        System.out.println("Last place: " + elevi[elevi.length - 1]); // valoare -1 deoarece se incepe cu 0
        // declarare si alocare de memorie
        int[] notes = new int[5];  // array notes cu lungime de 5
        System.out.println(notes[1]);
        notes[0] = 10;
        notes[1] = 9; // asa se initilizeaza - adauare de valori

    }
}
