package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Import(com.swampus.exercise.task.Task7Senior.class)
public class Task7SeniorTest {

    @Autowired
    private Task7Senior task7Senior;

    @Test
    public void init() {
        assertEquals("accessGranted", task7Senior.getAccessKey());
    }
}