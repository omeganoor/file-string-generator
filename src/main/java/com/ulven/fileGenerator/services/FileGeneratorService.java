package com.ulven.fileGenerator.services;

import com.ulven.fileGenerator.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class FileGeneratorService {
    private StringUtils stringUtils;

    public FileGeneratorService(StringUtils stringUtils) {
        this.stringUtils = stringUtils;
    }

    public String fileGenerator(int x) {
        String file = "test.txt";
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            while(x > 0) {
                String st = stringUtils.getRandomString(100);
                writer.write(st+"\n");
                x--;
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

}
