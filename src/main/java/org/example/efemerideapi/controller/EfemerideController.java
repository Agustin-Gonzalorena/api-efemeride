package org.example.efemerideapi.controller;

import org.example.efemerideapi.exception.NotFoundException;
import org.example.efemerideapi.service.EfemerideService;
import org.example.efemerideapi.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/efemeride")
public class EfemerideController {
    @Autowired
    private EfemerideService efemerideService;


    @GetMapping("/last")
    public ResponseEntity<?> getLast() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ApiResponse<>(HttpStatus.OK.value(), efemerideService.getLast()));
    }

    @GetMapping("/{input}")
    public ResponseEntity<?> errorEndpoint(@PathVariable String input) {
        throw new NotFoundException("No existe el endpoint.");
    }

}
