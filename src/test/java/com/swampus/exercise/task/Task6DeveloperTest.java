package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Import(com.swampus.exercise.task.Task6Developer.class)
public class Task6DeveloperTest {

    @Test
    public void something() {
        if(Arrays.asList(Task6Developer.class.getAnnotations()).stream()
                .noneMatch(t->t.toString().contains("org.springframework.stereotype.Service") ||
                        t.toString().contains("org.springframework.stereotype.Component"))){
            fail("Class Task6Developer will not be put Spring context, sorry, you need investigate why and fix.");
        }
    }
}