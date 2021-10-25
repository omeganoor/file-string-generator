package com.ulven.fileGenerator.services;

import com.ulven.fileGenerator.utils.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileGeneratorServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    void fileGenerator() {
        StringUtils st = new StringUtils();
        FileGeneratorService fg = new FileGeneratorService(st);
        String fileName = fg.fileGenerator(10);
        Assert.assertEquals("test.txt", fileName);
    }
}