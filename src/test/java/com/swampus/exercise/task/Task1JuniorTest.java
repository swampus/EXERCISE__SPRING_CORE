package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@Import(com.swampus.exercise.task.Task1Junior.class)
public class Task1JuniorTest {

    @Test
    public void testNotNull() {
        if(Arrays.asList(Task1Junior.class.getAnnotations()).stream()
                .noneMatch(t->t.toString().contains("org.springframework.stereotype.Service") ||
                        t.toString().contains("org.springframework.stereotype.Component"))){
            fail("Class Task1Junior is not in Spring context, sorry, you need create it.");
        }
    }

}