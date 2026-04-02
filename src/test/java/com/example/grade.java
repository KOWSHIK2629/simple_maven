package com.example;

import static org.junit.Assert.assertEquals; import org.junit.Test;

public class AppTest { @Test
public void testCalculateGrade() {
assertEquals("A", App.calculateGrade(95)); assertEquals("B", App.calculateGrade(85)); assertEquals("C", App.calculateGrade(75)); assertEquals("D", App.calculateGrade(65)); assertEquals("F", App.calculateGrade(50));
}
}
