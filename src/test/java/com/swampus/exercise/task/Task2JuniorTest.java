package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Import(com.swampus.exercise.task.Task2Junior.class)
public class Task2JuniorTest {

    @Autowired
    private Task2Junior task2Junior;

    @Test
    public void getAlghoritm() {
        assertEquals("SHA", task2Junior.getAlghoritm());
    }
}