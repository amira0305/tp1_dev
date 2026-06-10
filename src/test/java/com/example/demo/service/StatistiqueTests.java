package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;

    @Test
    void prixMoyenUneVoiture() throws ArithmeticException { 
        Echantillon echantillon = new Echantillon(1, 10000);
        when(statistiqueImpl.prixMoyen()).thenReturn(echantillon);

        Echantillon e = statistiqueImpl.prixMoyen();
        assertEquals(1, e.getNombreDeVoitures());
        assertEquals(10000, e.getPrixMoyen());
    }

    @Test
    void prixMoyenPlusieursVoitures() throws ArithmeticException { 
        Echantillon echantillon = new Echantillon(2, 15000);
        when(statistiqueImpl.prixMoyen()).thenReturn(echantillon);

        Echantillon e = statistiqueImpl.prixMoyen();
        assertEquals(2, e.getNombreDeVoitures());
        assertEquals(15000, e.getPrixMoyen());
    }

    @Test
    void ajouterVoitureAppeleBien() { 
        Voiture v = new Voiture("Renault", 10000);
        statistiqueImpl.ajouter(v);
        verify(statistiqueImpl, times(1)).ajouter(v);
    }
}