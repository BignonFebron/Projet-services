package com.bootcamp;

import com.bootcamp.Designs.Critere;
import com.bootcamp.Designs.Sort;
import com.bootcamp.jpa.entities.Impact;
import com.bootcamp.jpa.entities.Projet;
import com.bootcamp.jpa.repositories.ImpactRepository;
import com.bootcamp.jpa.repositories.ProjetRepository;
import java.sql.SQLException;
import java.util.List;


public class App 
{    
    public static void main(String[] args) throws SQLException {
        
        //ProjetRepository pr = new ProjetRepository("tpRest-mysql");
        ImpactRepository ir = new ImpactRepository("tpRest-mysql");
        
        Projet projet = new Projet();
        projet.setNom("essai0");
        
        List<Impact> iliste = projet.getImpacts();
        for (Impact impact : iliste) {
            ir.create(impact);
            impact.setProjet(projet);
        }
        System.out.println("\n "+iliste.get(0));
        System.out.println("\n "+iliste.get(1));
        
        
    }
}
