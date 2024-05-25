package tema_curs39_Ex1;

public class Main {
    /*
    1. Creati clasa Elev cu 3 campuri private: nume="Ion"; prenume="Popescu"; varsta= 26; sex = masculin;
    2.Creati un obiect elev, si afisati detaliile lui pe acelasi rand cu spatiu intre ele prin metoda arataDetalii();
    3.Creati un obiect eleva. Afisati la consola si detaliile acesteia.
    4. Adaugati getteri si setteri pentru fiecare camp.
    5. Modificati si detaliile elevei prin setter, astfel:
    nume= "Iulia"; prenume= "Barbu"; varsta= 20; sex= feminin.
    6. Afisati la consola numele ei complet
    7. Apelati metoda toString() prin eleva.
    8. Adaugati 3 campuri private, notaLaMate, notaLaFizica, notaLaInfo.
    9. Adaugati 3 metode publice  de get si alte 3 de set care sa acceseze notele.
    10.Modificati notele cu note mai mari punand o conditie in setteri.
    11. Afisati valorile si observati ce se intampla

     */

    public static void main(String[] args) {
        Elev elev = new Elev("Ion", "Popescu", 26, "M");
        elev.arataDetalii();

        Elev eleva = new Elev("Iulia", "Barbu", 20, "F");
       eleva.arataDetalii();
        System.out.println(eleva);
        eleva.setNotaLaMate(7);
        eleva.setNotaLaInfo(10);
        eleva.setNotaLaFizica(5);

    }

}
