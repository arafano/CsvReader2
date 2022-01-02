package fr.epsi.b3.recensement.service;

import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Region;
import fr.epsi.b3.recensement.infos.Ville;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Tools {
    public Tools() {
    }

    public static Recensement ListeVille(Path FilePath) throws IOException {
        Recensement MonRecensement = new Recensement();
        List<String> lines = Files.readAllLines(FilePath, StandardCharsets.UTF_8);

        for (int i = 0; i < lines.size(); ++i) {
            String[] SeparatedElements = ((String) lines.get(i)).split(";");
            int codeRegion = Integer.parseInt(SeparatedElements[0]);
            String nomRegion = SeparatedElements[1];
            String codeDepartement = SeparatedElements[2];
            int CodeArrondissement = Integer.parseInt(SeparatedElements[3]);
            int codeCanton = 0;
            if (!SeparatedElements[4].equals("null")) {
                codeCanton = Integer.parseInt(SeparatedElements[4]);
            }
            int codeCommune = Integer.parseInt(SeparatedElements[5]);
            String nomCommune = SeparatedElements[6];
            int populationMunicipale = Integer.parseInt(SeparatedElements[7]);
            int populationTotale = Integer.parseInt(SeparatedElements[9].replaceAll("\r", ""));
            MonRecensement.ListeVilles.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale, CodeArrondissement, codeCanton, populationMunicipale));
            //MonRecensement.ListeRegions.add(new Region(codeRegion, nomRegion));
            MonRecensement.ListeRegions.add(new Region(codeRegion, nomRegion, populationMunicipale, populationTotale));
        }
        return MonRecensement;

    }
    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int Choix = 0;
        boolean isNumeric = false;
        int NbOptions = 5;
        System.out.println("Menu : \n");
        System.out.println("quel option souhaitez vous faire : \n");
        System.out.println("1: Rechercher la population pour une ville.\n");
        System.out.println("2: Rechercher la ville la plus peuplee. \n");
        System.out.println("3: Rechercher la population pour un département.\n");
        System.out.println("4: Rechercher la population pour une région.\n");
        System.out.println("5: Afficher les dix régions les plus peuplées\n");



        while(isNumeric == false || Choix == 0){
            try{
                System.out.println("\nVotre choix : ");
                Choix = sc.nextInt();
                sc.nextLine();
                if(Choix ==0 || Choix > NbOptions) {
                    System.out.println("\nLe choix doit être comprise entre 1 et " + NbOptions + "!");
                }else{
                    isNumeric = true;
                }
            } catch (InputMismatchException e){
                System.out.println("veuillez saisir des nombres : ");
                sc.nextLine();
            }
        }
        return Choix;

    }


    public static Scanner Ville(){
        System.out.println("Pour quelle ville souhaitez vous connaître la population : ");
        Scanner sc = new Scanner(System.in) ;
        return sc;
    }


    public static Scanner Departement(){
        System.out.println("Pour quelle Département souhaitez vous connaître la population : ");
        Scanner sc = new Scanner(System.in) ;
        return sc;
    }

    public static Scanner Region(){
        System.out.println("Pour quelle Région souhaitez vous connaître la population : ");
        Scanner sc = new Scanner(System.in) ;
        return sc;
    }


}

