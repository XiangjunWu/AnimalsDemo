package at.campus02.wu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal a1, a2, a3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a1 = new Animal("Pluto",1,"Hund","Wuff");
        a2 = new Animal("Mauzi",6,"Katze","Miau");
        a3 = new Animal("Leo",3,"Löwe","Roarr");
    }

    @Test
    @DisplayName("Check animal loud")
    void testAnimalLoud(){
        assertEquals("Wuff", a1.getAnimalLoud());
        assertEquals("Miau", a2.getAnimalLoud());
        assertEquals("Roarr", a3.getAnimalLoud());
    }
    @Test
    @DisplayName("Check name and age")
    void testNameAndAge(){
        assertEquals("Pluto 1", a1.getNameAndAge());
        assertEquals("Mauzi 6", a2.getNameAndAge());
        assertEquals("Leo 3", a3.getNameAndAge());
    }
    @Test
    @DisplayName("Check age category")
    void testAgeCategory(){
        assertEquals("baby animal", a1.ageCategory());
        assertEquals("old animal", a2.ageCategory());
        assertEquals("young animal", a3.ageCategory());
    }
}