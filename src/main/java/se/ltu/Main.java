package se.ltu;

public class Main {

    public static void main(String[] args) {

        GoogleSearch google = new GoogleSearch();
        google.DoSearch();

        Actitime actitimeFill = new Actitime();
        actitimeFill.fillForm();

        Adlibris adlibrisFill = new Adlibris();
        adlibrisFill.fillForm();


    }
}