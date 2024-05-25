package tema_curs39_Ex1;

public class Elev {
    private String nume;
    private String prenume;
    private int varsta;
    private String sex;
    private int notaLaMate;
    private int notaLaFizica;
    private int notaLaInfo;

    public Elev(String nume, String prenume, int varsta, String sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
    }

    public int getNotaLaMate() {
        return notaLaMate;
    }

    public int getNotaLaFizica() {
        return notaLaFizica;
    }

    public int getNotaLaInfo() {
        return notaLaInfo;
    }

    public void setNotaLaMate(int notaLaMate) {
        if (notaLaMate <= 10 && notaLaMate >= 6) {
            this.notaLaMate = notaLaMate;
            System.out.println("Felicitari ai trecut la matematica.!");
        } else {
            System.out.println("Mai invata si revino..");
        }
    }

    public void setNotaLaFizica(int notaLaFizica) {
        if (notaLaFizica <= 10 && notaLaFizica >= 6 ) {
            this.notaLaFizica = notaLaFizica;
            System.out.println("Felicitari ai trecut la fizica!");
        } else {
            System.out.println("Mai invata si revino.");
        }
    }

    public void setNotaLaInfo(int notaLaInfo) {
        if (notaLaInfo <= 10 && notaLaInfo >= 6) {
            this.notaLaInfo = notaLaInfo;
            System.out.println("Felicitari ai trecut la Informatica!");
        } else {
            System.out.println("Mai invata si revino.");
        }
    }

    public void arataDetalii() {
        System.out.println("Detaliile elevului: " + nume + " " + prenume + " " + varsta + " " + sex);
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", sex='" + sex + '\'' +
                '}';
    }
}
