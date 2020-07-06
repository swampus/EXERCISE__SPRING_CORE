package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


@SpringBootTest
@Import(com.swampus.exercise.task.Task5Developer.class)
public class Task5DeveloperTest {

    @Autowired
    private Task5Developer task5Developer;

    @Test
    public void doStaff() throws NoSuchMethodException {

        if(Arrays.stream(Task5Developer.class.getConstructors()).flatMap(t ->
                Arrays.stream(t.getAnnotations())
        ).noneMatch(t -> t.toString().contains("Autowired"))){
            fail("Required components (fields) looks not inject into class");
        }

        assertEquals("XMLJSON", task5Developer.doStaff());
    }
}