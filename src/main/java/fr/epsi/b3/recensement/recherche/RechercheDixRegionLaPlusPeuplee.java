package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Region;


import java.util.*;

public class RechercheDixRegionLaPlusPeuplee extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
    }

    public void traiter(Recensement recensement) {

        HashMap<String, Integer> compteurs = new HashMap<>();
        List<Region> ListeRegion = recensement.getListeRegions();


        for (int i = 0; i < recensement.getListeRegions().size(); i++) {
            Region r = recensement.getListeRegions().get(i);
            String region = r.getNomRegion();
            Integer compteur = compteurs.get(region);

            if (compteur == null) {
                compteur = 0;
            }

            compteur++;

            compteurs.put(region, compteur);

        }
        Set<String> regions = compteurs.keySet();
        Iterator<String> iterateur = regions.iterator();


        int index = 0;
        String[][] Tabregion = new String[compteurs.size()][2];

        while (iterateur.hasNext()) {
            String region = iterateur.next();

            int popTotRegion = 0;
            for (int i = 0; i < recensement.getListeRegions().size(); i++) {
                if (ListeRegion.get(i).nomRegion.equals(region)) {
                    popTotRegion += ListeRegion.get(i).populationTotale;
                }
            }

            Tabregion[index][0] = region;
            Tabregion[index][1] = String.valueOf(popTotRegion);
            index++;
        }
        sortArrayByScore(Tabregion);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ". ");
            for (int j = 0; j < Tabregion[i].length; j++)
                System.out.print(Tabregion[i][j] + " ");
            System.out.println();
        }
    }


    public static void sortArrayByScore(String[][] array) {
        String tmpName, tmpScore;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (Integer.parseInt(array[i][1]) < Integer.parseInt(array[i + 1][1])) {
                    sorted = false;
                    // SWAP NAMES
                    tmpName = array[i][0];
                    array[i][0] = array[i + 1][0];
                    array[i + 1][0] = tmpName;

                    // SWAP SCORES
                    tmpScore = array[i][1];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][1] = tmpScore;
                }
            }
        }
    }
}








