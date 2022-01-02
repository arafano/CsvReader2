package fr.epsi.b3.recensement.infos;


import fr.epsi.b3.recensement.infos.Ville;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    public List<Ville> ListeVilles = new ArrayList();
    public List<Ville> getListeVilles() {return this.ListeVilles;}

    public void setListeVilles(List<Ville> ListeVilles){this.ListeVilles=ListeVilles;}

    public static List<Region> ListeRegions = new ArrayList();
    public List<Region> getListeRegions() {return this.ListeRegions;}

    public void setListeRegions(List<Region> ListeRegions){this.ListeRegions=ListeRegions;}


    public Recensement(){}

}