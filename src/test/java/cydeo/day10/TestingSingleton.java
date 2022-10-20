package cydeo.day10;

import org.testng.annotations.Test;

public class TestingSingleton {

    @Test
    public void singleton_understand_test(){
        String str1 = Singleton.getWord();
        System.out.println(str1);
    }

    @Test
    public void singleton_understand_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str1 = "+str4);

    }












}
