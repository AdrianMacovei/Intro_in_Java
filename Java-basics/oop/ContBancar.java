package oop;


public class ContBancar {
        //program files - definim logica unui cont bancar
        // oop = object oriented programming
        // POO  -romana
        //
        // o clasa = un tip nou
        // definitia unui concept
        //conceptualizare teoretica a unei entitati practice
        // Ex reteta de paste carbonara sau clasa masina, ADN-ul uman

        //un obiect = instanta unei clase, implementarea clasei
        //paste carbonara ex obiect de tip masina, omul

        //fields = proprietati = atribute
        //variabile
        //ex marca, model, culoare masina, viteza, tip combustibil, pret (fiecare variabila cu tipurile sale de date)
        //atribute proprietati ale omului

        //actiuni ce pot fi facute de obiecte
        //functii:
        //ex accelereza, franeaza, deschide usa
    //proprietatile
    String titularCont;
    String iban;
    double sold;
    boolean activ = false;
    //constructor= are rolul de a impune date de start
    //ca asterixul din formulare-required fields
    int incercari_activare = 0;
    //ascundem pin de utilizator din desktop
    private int pin = 7777;
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont; //permanentizarea datelor
        this.iban = iban;
    }

    //metode = actiunile clasei
    //inheritance, polimorphism, encapsulation, abstractization
   //creeam mai jos o metoda numita descrierepe care o vom utiliza in ContBancarMain pentru a obtine descrierea contului
    public void interogareSold() {
       System.out.println("Titular cont " + this.titularCont); // printam titularul contului
       System.out.println("IBAN-ul contului este " + this.iban);
       System.out.println("Sold " + this.sold);
       System.out.println("Activ " + this.activ);
       System.out.println("Nr incercari gresite " + this.incercari_activare);
       System.out.println("---------------------------------------");
    }
    //cream mai jos o metoda prin care activam un cont

    public void activareCont(int pinUtilizator) {
        //modifica activ in true doar daca pin este corect

        if (this.incercari_activare < 3) {

            if (pinUtilizator == pin) {
                System.out.println("Cardul clientului " + titularCont + " fost activat cu succes!");
                this.activ = true;
            } else {
                System.out.println("PIN gresit " + titularCont);
                this.incercari_activare++; //incrementeaza
            }

        }else {
            this.activ = false;
            System.out.println("Ati gresit PIN-ul de trei ori. Contul dvs. este blocat");
        }
        System.out.println("----------------------------------");
    }

    public void alimentareCont(double suma_depusa) {
        //suma depusa se va aduga la this.sold
        this.sold += suma_depusa;
        System.out.println("Buna, " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa + ". Aveti in cont suma de " + this.sold);

    }

    //debitare cont
    public void plataCard(double suma_cheltuita){
        System.out.println("Buna, " + this.titularCont);
        if (suma_cheltuita <= this.sold){
            this.sold -= suma_cheltuita;
            System.out.println("Ati debitat suma de " + suma_cheltuita + ". Aveti in cont suma de " + this.sold);
        } else {
            System.out.println("Suma indisponibila.");
        }



    }



}
