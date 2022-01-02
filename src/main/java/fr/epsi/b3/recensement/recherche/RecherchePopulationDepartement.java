package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Ville;

import java.util.List;
import java.util.Scanner;



public class RecherchePopulationDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {


        String Ville = scanner.nextLine();
        List<Ville> ListeVille = recensement.getListeVilles();
        int popTot = 0;
        for(int i=0;i<ListeVille.size();i++){
            if(ListeVille.get(i).codeDepartement.equals(Ville)){
                popTot += ListeVille.get(i).populationTotale;

            }
            //break;
        }
        System.out.println("La population de ce département est : "+popTot+"habitants");




    }

    @Override
    public void traiter(Recensement recensement) {

    }
}
