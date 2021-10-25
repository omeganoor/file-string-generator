package com.ulven.fileGenerator.controller;

import com.ulven.fileGenerator.services.FileGeneratorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FileGenereatorController {

    private FileGeneratorService fileGeneratorService;

    public FileGenereatorController(FileGeneratorService fileGeneratorService) {
        this.fileGeneratorService = fileGeneratorService;
    }

    @PostMapping(path = "/generateFile")
    public ResponseEntity<String> generateFile(@RequestParam(required = true) Integer x) {

        String fileName = fileGeneratorService.fileGenerator(x);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Your file name is " + fileName);
    }
}
