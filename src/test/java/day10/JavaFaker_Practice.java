package day10;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker_Practice {
    @Test
    public void java_faker_test(){
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.numerify(\"###########\") = " + faker.numerify("###########"));
        System.out.println("faker.bothify(\"##??##???\") = " + faker.bothify("##??##???"));


    }
}
