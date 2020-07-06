package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.math.BigDecimal;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
@Import(com.swampus.exercise.task.Task0Junior.class)
public class Task0JuniorTest {


    @Autowired
    private Task0Junior tesk0Junior;

    @Test
    public void calculateTotalAmount() {
        assertEquals("?",
                new BigDecimal("13"), tesk0Junior.calculateTotalAmount(new BigDecimal("10")));
    }
}