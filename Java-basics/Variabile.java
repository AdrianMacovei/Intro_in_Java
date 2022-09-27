public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";
        //strongly typed - trebuie specificat si tipul variabilei utilizate

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //suprascrierea
        modelMasina = "XC 60 facelift";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String nume;
        String prenume;
        //initializare
        nume = "Macovei";
        prenume = "Adrian";
        int varsta = 25;
        System.out.println(nume + " " + prenume + " are varsta de "+ varsta);
    }
}
