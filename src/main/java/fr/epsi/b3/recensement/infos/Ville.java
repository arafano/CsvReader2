package fr.epsi.b3.recensement.infos;


import java.util.List;

public class Ville implements Comparable<Ville>
{

    public int codeRegion;
    public String nomRegion;
    public String codeDepartement;
    public int codeCommune;
    public String nomCommune;
    public int populationTotale;
    public int CodeArrondissement;
    public int codeCanton;
    public int populationMunicipale;

    public Ville(){

    }

    public int getCodeArrondissement() { return this.CodeArrondissement;}
    public void setCodeArrondissement(int codeArrondissement) {this.CodeArrondissement=CodeArrondissement;}
    public int getCodeCanton(){return this.codeCanton;}

    public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune, int populationTotale, int CodeArrondissement, int codeCanton, int populationMunicipale){
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.CodeArrondissement = CodeArrondissement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
        this.codeCanton = codeCanton;
        this.populationMunicipale = populationMunicipale;


    }

    public void setCodeCanton(int codeCanton) {this.codeCanton = codeCanton;}
    public int getPopulationMunicipale(){return this.populationMunicipale;}
    public void setPopulationMunicipale(int populationMunicipale) {this.populationMunicipale = populationMunicipale;}
    public int getCodeRegion() {return this.codeRegion;}
    public void setCodeRegion(int codeRegion){this.codeRegion = codeRegion;}
    public String getNomRegion(){return this.nomRegion;}
    public void setNomRegion(String nomRegion) {this.nomRegion = nomRegion;}
    public String getCodeDepartement(){return this.codeDepartement;}
    public void setCodeDepartement(String codeDepartement) {this.codeDepartement = codeDepartement;}
    public int getCodeCommune() {return this.codeCommune;}
    public void setCodeCommune(int codeCommune) {this.codeCommune=codeCommune;}
    public String getNomCommune(){return this.nomCommune;}
    public void setNomCommune(String nomCommune){this.nomCommune = nomCommune;}
    public int getPopulationTotale(){return this.populationTotale;}
    public void setPopulationTotale(int populationTotale){this.populationTotale = populationTotale;}

    @Override
    public int compareTo(Ville o) {
        return o.populationTotale - this.populationTotale;
    }
}
