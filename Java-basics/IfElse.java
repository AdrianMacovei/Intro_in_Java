
import java.util.Scanner;  // Import the Scanner class
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//variabila sc preia date
//        System.out.println("Introdu ora: ");
//        int ora = sc.nextInt(); // atribuim variabilei ora datele din sc
//        if (ora < 0) {
//            System.out.println("Ora invalida. Ora negativa");
//        } else if (ora <= 11) {
//            System.out.println("Buna dimineata!");
//        }else if (ora <= 18) {
//            System.out.println("Buna ziua!");
//        }else if (ora <= 21) {
//            System.out.println("Buna seara!");
//        }else if (ora <= 24) {
//            System.out.println("Noapte buna!");
//        } else {
//            System.out.println("Ora invalida. Ora mai mare decat 24.");
//        }

//        // flow control
//        // evalueaza conditii si bifurca codul in functie de rezultat
//        System.out.println("pornim radio");
//        //daca imi place piesa dau mai tare
//        boolean piesa_faina = false; // invat calculatorul daca piesa e faina sau nu
//
//        if (piesa_faina == true) {
//            System.out.println("Dau mai tare");
//            System.out.println("Incep sa o fredonez");
//
//        }
//        System.out.println("oprim radio");
//        Scanner nr = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Introdu un numar: ");
//
//        int numar = nr.nextInt();  // Read user input
//
//        if (numar % 2 == 0) {
//            System.out.println("Numarul este par");
//        }
//        else {
//            System.out.println("Numarul este impar");
//        }
//

        // luam date de la tastatura

        // switch atunci cand se cunosc valorile
        System.out.println("Alege optiunea:");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("Meniu anterior ");
                break;
            case 1:
                System.out.println("Romana");
                break;
            case 2:
                System.out.println("Engleza");
            default:
                System.out.println("Optiiune invalida");
        }
    }//inchide functia main
}//inchide clasa
