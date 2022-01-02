package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Region;
import fr.epsi.b3.recensement.infos.Ville;

import java.util.List;
import java.util.Scanner;



public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {


        String Region = scanner.nextLine();
        List<Ville> ListeVille = recensement.getListeVilles();
        int popTotRegion = 0;
        for(int i=0;i<ListeVille.size();i++){
            if(ListeVille.get(i).nomRegion.equals(Region)){
                popTotRegion += ListeVille.get(i).populationTotale;

            }
            //break;
        }
        System.out.println("La population de cette région est : "+popTotRegion+"habitants");




    }

    @Override
    public void traiter(Recensement recensement) {

    }
}
