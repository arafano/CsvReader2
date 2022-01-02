package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Ville;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        boolean Find = false;
        int i=0;
        String Ville = scanner.nextLine();
        List<Ville> ListeVille = recensement.getListeVilles();

        while(!Find && i<ListeVille.size()){
            if(ListeVille.get(i).nomCommune.equals(Ville)){
                System.out.println("La population de cette ville est : "+ListeVille.get(i).populationTotale+"habitants");
                Find = true;
            }
            i++;
        }
        if(!Find){
            System.out.println("La ville indiquee n'est pas contenue dans la liste des villes");
        }
    }

    @Override
    public void traiter(Recensement recensement) {

    }
}
