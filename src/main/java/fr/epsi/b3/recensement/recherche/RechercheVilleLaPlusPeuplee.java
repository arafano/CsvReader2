package fr.epsi.b3.recensement.recherche;

import fr.epsi.b3.recensement.infos.MenuService;
import fr.epsi.b3.recensement.infos.Recensement;
import fr.epsi.b3.recensement.infos.Ville;

import java.util.Collections;
import java.util.Scanner;

public class RechercheVilleLaPlusPeuplee extends MenuService {




    @Override
    public void traiter(Recensement recensement, Scanner scanner) {}

    public void traiter(Recensement recensement) {

        Ville VillePlusPeuplee = new Ville();

        for(int i=0;i<recensement.getListeVilles().size();i++){
            if(VillePlusPeuplee.populationMunicipale < recensement.ListeVilles.get(i).populationMunicipale){
                VillePlusPeuplee = recensement.ListeVilles.get(i);
            }
            System.out.println("La ville la plus peuplée est la ville de " +VillePlusPeuplee.nomCommune +"avec un total de "+VillePlusPeuplee.populationTotale);

        }

    }
}
