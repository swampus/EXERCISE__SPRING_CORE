package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.JsonDataParser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import(com.swampus.exercise.task.Task3Junior.class)
public class Task3JuniorTest {


    @Autowired
    private Task3Junior task2Junior;

    @Test
    public void getData() {
        assertEquals(new JsonDataParser().parseData(),
                task2Junior.getData());
    }
}