package com.myb.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //create properties object
    private static Properties properties = new Properties();

    static{

        //load the file into FileInputStream
        try {
            FileInputStream file = new FileInputStream("configuration.properties");



            //load properties object with the file(configuration.properties)
            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("file not found in Configuration properties.");
        }


    }

    //use the above created logic to create a re-usable static method
    public static String getProperty(String keyWord){
        return  properties.getProperty(keyWord);
    }
}
