package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        //desktop
        // initializam obiecte de tip ContBancar
        // sunt instante ale clasei cont bancar
        ContBancar cont1 = new ContBancar("Adrian Macovei", "RO001");
        ContBancar cont2 = new ContBancar("Bogdan Macovei", "RO002");
        //daca nu definim constructorul el exista? Da by default
       //activam metoda descriere

        //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3454);
        cont2.activareCont(7777);

        ;

        //alimentare cont

        cont1.alimentareCont(2000);
        cont2.alimentareCont(2345.53);


        //debitare card = sau cheltuire bani
        cont1.plataCard(2001);
        cont1.interogareSold(); //descriere ne eficientizeaza munca
        cont2.interogareSold();
    }
}

