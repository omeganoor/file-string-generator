package com.ulven.fileGenerator.services;

import static org.mockito.Mockito.when;

import com.ulven.fileGenerator.utils.StringUtils;
import java.io.IOException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


class FileGeneratorServiceTest {

    @Mock
    private final StringUtils stringUtils;

    @InjectMocks
    private FileGeneratorService fileGeneratorService;

    FileGeneratorServiceTest() {
        this.stringUtils = Mockito.mock(StringUtils.class);
        this.fileGeneratorService = new FileGeneratorService(stringUtils);
    }


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    void testGenerateFile() {
        String expected = "test.txt";
        int len = 10;
        when(stringUtils.getRandomString(len)).thenReturn("generatedString");
        String fileName = fileGeneratorService.generateFile(len);
        Assert.assertEquals(expected, fileName);
    }
}