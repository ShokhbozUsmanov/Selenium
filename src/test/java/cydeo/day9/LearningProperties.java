package cydeo.day9;

import org.testng.annotations.Test;

import java.security.Key;

public class LearningProperties {

    @Test
    public void Java_properties_read_test(){
        System.out.println("System.getProperty = " + System.getProperty("os.name"));
        System.out.println("System.getProperty = " + System.getProperty("user.name"));
        System.out.println("System.getProperty = " + System.getProperty("java.version"));

    }
}
