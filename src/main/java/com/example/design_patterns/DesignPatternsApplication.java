package com.example.design_patterns;

import com.example.design_patterns.decorator.io.LowercaseInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        try (InputStream inputStream = getFileInputStream("test.txt");
             InputStream in = new LowercaseInputStream(new BufferedInputStream(inputStream))) {

            // Use StringBuilder to build the transformed string
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = in.read()) >= 0) {
                sb.append((char) c);
            }
            logger.info("{}", sb);

        } catch (IOException e) {
            logger.error("Exception", e);
        }

    }

    public static InputStream getFileInputStream(String fileName) throws IOException {
        // Use the ClassLoader to get the InputStream for the file in the resources
        InputStream inputStream = DesignPatternsApplication.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IOException("File not found: " + fileName);
        }
        return inputStream;
    }

}
