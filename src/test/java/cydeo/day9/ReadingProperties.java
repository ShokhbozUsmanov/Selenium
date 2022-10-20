package cydeo.day9;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file_test() throws IOException {

        Properties giper = new Properties();
        FileInputStream properties = new FileInputStream("giper.properties");
        giper.load(properties);

        System.out.println("giper.getProperty(\"browser\") = " + giper.getProperty("browser"));
        System.out.println("giper.getProperty(\"env\") = " + giper.getProperty("env"));
        System.out.println("giper.getProperty(\"username\") = " + giper.getProperty("username"));
        System.out.println("giper.getProperty(\"password\") = " + giper.getProperty("password"));

    }

}
