
/*
Operatori
aritmetici: +, -, *, /, %
de comparatie: <, >, ==, !=,<=, >=
logici: &&, ||, !
Flow control: if, elif, else
evalueaza conditii si bifurca codul in functie de rezultat
 */
public class Operatori {
    public static void main(String[] args) {

        int a = 3; // declarare && initializare
        int b = 5;
        a = b; // suprascriere
        System.out.println(a!=b);// 5 diferit de 5
        System.out.println(a==b);// 5 egal cu 5
        System.out.println(7>b && 8 > b);// 7 mai mare decat b SI in acelasi timp 8 mai mare decat 5
        System.out.println(7>b && 3 > b);//
        System.out.println(7>b || 3 > b);// 7 mai mare decat b SAU 3 mai mare decat b
        System.out.println(7>b && (6>b || 3> b));// 7 mai mare decat b SI (6 mai mare decat b SAU 3 mai mare decat b)
        System.out.println(!(7>b));// 7 mai mare ca b true si inverseaza (!) rezulta false





    }
}
