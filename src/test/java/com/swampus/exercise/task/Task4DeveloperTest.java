package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.Key;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Import({com.swampus.exercise.task.Task4Developer.class,
        com.swampus.exercise.not.modify.Key.class})
public class Task4DeveloperTest {

    private Key key;

    @Test
    public void secretKey() {
        AnnotationConfigApplicationContext appContext
                = new AnnotationConfigApplicationContext();
        appContext.register(Task4Developer.class);
        appContext.refresh();

        Key key = appContext.getBean(Key.class);
        assertEquals("t1", key.getX());
    }
}