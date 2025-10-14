package com.example.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("dao2")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao2"
public class DaoImpl2 implements IDao{
    @Override
    public double getValue() {
        return 150;
    }
}
