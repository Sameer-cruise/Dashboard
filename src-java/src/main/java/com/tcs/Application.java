package com.tcs;

import com.tcs.lists.Lists;
import com.tcs.services.DatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
@EnableAsync
public class Application {

    public static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("The main method has been invoked");
        callexternalpropertyfile();
        SpringApplication.run(Application.class, args);
    }

    private static void callexternalpropertyfile() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("apu.properties");
            prop.load(input);
            Lists.apuurl = prop.getProperty("apuurl");
            Lists.auth = prop.getProperty("auth");
            Lists.append = prop.getProperty("append");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
