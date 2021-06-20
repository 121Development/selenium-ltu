package se.ltu;

import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to conduct the Grid test (y) or skip and do the other tests (n)? y/n: ");
        String s = in.nextLine();

        if (s.equalsIgnoreCase("y")){
            GridTest gt = new GridTest();
            gt.launchbrowser();
        }

        GoogleSearch google = new GoogleSearch();
        google.search();

        Adlibris adlibrisFill = new Adlibris();
        adlibrisFill.fillForm();

        Actitime actitimeFill = new Actitime();
        actitimeFill.fillForm();





    }
}