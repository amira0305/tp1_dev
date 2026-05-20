package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        assertEquals(1,1);
    }

    @Test

    void creerVoiture(){
        Voiture voiture = new voiture ("Audi", 3000)
        Assert.isTrue(voiture.getMarque().equals("Audi"), "Doit être Audi");
        Assert.isTrue(voiture.getPrix() == 3000, "Doit être 3000");
        Assert.isTrue(voiture.getId () == 0, "Doit être 0");
    }

}
