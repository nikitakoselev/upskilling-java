/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.nikitakoselev.upskilling.java.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class Java8FeaturesTest {
    Java8Features java8Features = new Java8Features();

    @Test
    void lambdaUsage() {
        assertEquals("hey Bro", java8Features.lambdaUsage());
    }

    @Test
    void streamUsage() {
        List<String> names = Arrays.asList("eniki", "beniki", "meniki", "moo", "donkey", "ma");
        Predicate<String> longerThan3 = s -> s.length() > 3;
        assertEquals(4, java8Features.streamUsage(names, longerThan3));
    }
}