package com.example.dao;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao"
@Profile("prod")  // Ce bean sera actif uniquement avec le profil "prod"
public class DaoImpl1 implements IDao {
    @Override
    public double getValue() {
        return 100.0;
    }
}
