public class Functii {
//    public static void printGreeting() {
//        System.out.println("Buna ziua! Bine ati venit");
//    }

    // functie = logica delimitata care poate fi refolosita
    // o functie simpla care ne printeaza ceva pe ecran si nu returneaza nimic
    // nu ne da niciun raspuns
    //nu are parametri
    //nu putem folosi spatii in nume
    //nu putem defini o  funtie intr-o alta functie (nu pot firefox in chrome)

    // o functie care saluta clientul in functie de numele lui
    //are nevoie de parametrii ca sa se poata conporta diferit
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua, " + nume + " " + prenume + "!");
    }
    // functie ce calculeaza media sumei a trei numere
    //functia va returna suma celor 3 numere
    //are nevoie de parametrii
    //ce tip de date va avea raspunsul functiei
    public static double  mediaNr(double a, double b, double c){

        double media = (a + b + c)/3;
        return media;
    }

    //o functie care ne da valoare lui pi
    //ne da un raspuns da
    // raspuns de tip double
    //are nevoie de parametrii? nu
    public static double piValue() {
        //constanta -variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return 3.14;
    }
    public static void main(String[] args) {
        //intra clientul 1
//        printGreeting(); //asa se apeleaza functia fara return si parametrii
//
//        //intra clientul 2
//        printGreeting(); //CTRL + click ne duce la corpul functiei

        //apelam o functie cu parametrii si oferim argumente
//        printGreetingByName("Macovei", "Adrian");
//        printGreetingByName("Munteanu", "Ioana");
//        printGreetingByName("Macovei", "Vasile");

        System.out.println(mediaNr(3, 3, 10));
        double media1 = mediaNr(3,3,4);
        System.out.println(media1);
        System.out.println(piValue());

    }
}