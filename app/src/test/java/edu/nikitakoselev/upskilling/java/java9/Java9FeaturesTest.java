package edu.nikitakoselev.upskilling.java.java9;

import com.google.common.base.Strings;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Java9FeaturesTest {
    Java9Features java9Features = new Java9Features();

    @Test
    void listCreation() {
       String[] names = {"Eniki", "Beniki"};
       List<String> namesCollection = java9Features.listCreation(names);
       assertEquals(2, namesCollection.size());
       assertTrue(namesCollection instanceof List);
    }

    @Test
    void setCreation() {
        String[] names = {"Eniki", "Beniki"};
        Set<String> namesCollection = java9Features.setCreation(names);
        assertEquals(2, namesCollection.size());
        assertTrue(namesCollection instanceof Set);
    }

    @Test
    void mapCreation() {
        String[] names = {"one", "1", "two", "2"};
        Map<String, String> namesCollection = java9Features.mapCreation(names);
        assertEquals(2, namesCollection.size());
        assertTrue(namesCollection instanceof Map);
    }
}
