public class while_ {
    public static void main(String[] args) {
    //while - loop ciclu repetitiv
        //zona de cod care se repeta atata timp cat o connditie este true

        //masina merge cat timp are inca benzina
        int litri_benzina = 10;
        while (litri_benzina > 0) {
            System.out.println("Vruum Vruum!");
            //scadem benzina
            litri_benzina -= 1;
            //sub trei litri aprindem bec benzina
            if (litri_benzina < 3) {
                System.out.println("Aprindem bec rosu benzina!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");



    }
}
