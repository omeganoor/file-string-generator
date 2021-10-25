package com.ulven.fileGenerator.controller;

import static org.mockito.Mockito.when;

import com.ulven.fileGenerator.services.FileGeneratorService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
class FileGeneratorControllerTest {

    @Mock
    private final FileGeneratorService fileGeneratorService;

    @InjectMocks
    private FileGeneratorController fileGeneratorController;

    FileGeneratorControllerTest() {
        this.fileGeneratorService = Mockito.mock(FileGeneratorService.class);
        this.fileGeneratorController = new FileGeneratorController(fileGeneratorService);
    }


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    void fileGeneratorController() {
        String fileName = "test.txt";
        int len = 10;
        String expected = "Your file name is " + fileName;
        when(fileGeneratorService.generateFile(len)).thenReturn(fileName);
        ResponseEntity<String> response = fileGeneratorController.generateFile(len);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(expected, response.getBody());
    }
}