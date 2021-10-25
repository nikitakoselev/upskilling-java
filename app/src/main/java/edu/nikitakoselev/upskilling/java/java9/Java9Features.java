package edu.nikitakoselev.upskilling.java.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Java9Features {
    public List<String> listCreation(String... strings) {
        return List.of(strings);
    }

    public Set<String> setCreation(String... names) {
        return Set.of(names);
    }

    public Map<String, String> mapCreation(String[] names) {
        //I know it's ugly, give me your pull request to fix it :D
        return Map.of(names[0], names[1], names[2], names[3]);
    }
}
