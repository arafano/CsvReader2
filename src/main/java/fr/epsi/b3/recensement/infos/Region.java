package fr.epsi.b3.recensement.infos;

import java.util.List;

public class Region  {
    public int codeRegion;
    public String nomRegion;
    public int populationMunicipale;
    public int populationTotale;

    public Region(){}
    public Region(int codeRegion, String nomRegion, int populationMunicipale, int populationTotale){
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.populationMunicipale = populationMunicipale;
        this.populationTotale = populationTotale;


    }


    public int getCodeRegion() {return this.codeRegion;}
    public void setCodeRegion(int codeRegion){this.codeRegion = codeRegion;}

    public String getNomRegion() {return  this.nomRegion;}
    public void setNomRegion(String nomRegion) {this.nomRegion = nomRegion;}

    public int getPopulationMunicipale(){return this.populationMunicipale;}
    public void setPopulationMunicipale(int populationMunicipale){this.populationMunicipale = populationMunicipale;}

    public int getPopulationTotale() {return this.populationTotale;}
    public void setPopulationTotale(int populationTotale){this.populationTotale = populationTotale;}


    }


