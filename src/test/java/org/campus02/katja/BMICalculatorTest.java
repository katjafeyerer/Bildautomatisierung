package org.campus02.katja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    // Alt + Einfügen -> Set Up Method
    @BeforeEach //BeforeEach --> macht: ausgeführt before Tests ausgeführt werden
    void setUp() {
        bmiCalculator = new BMICalculator(180, 1.8);


    }
    @Test
    @DisplayName("Konstruktor Test")
    void testConstructor(){
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightIngKG());
        Assertions.assertEquals(1.8, bmiCalculator.getHeightInMeters());

    }

    @Test //Alt + Enter -> Replace qualified name  --> nur mehr Test sichtbar
    void result() {
    }
}