package com.example.secuencias.secuencias.controller;


import com.example.secuencias.secuencias.services.SecuenciasService;
import com.google.gson.Gson;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class SecuenciasController {


    @Autowired
    public SecuenciasService secuenciasService;


    public SecuenciasController(SecuenciasService secuenciasService){
        this.secuenciasService=secuenciasService;
    }


    @PostMapping("/secuence/collatz/{input}")
    public Object getCollatz(@PathVariable(name = "input") int numero) throws BadRequestException {

        if(numero <= 0){
            throw new BadRequestException(HttpStatus.BAD_REQUEST.toString());
        }
        Gson gson = new Gson();
        String sec = gson.toJson(secuenciasService.collatz(numero));
        return sec;
    }


    @PostMapping("/fizzbuzz/{input}")
    public Object getFizzBuzz(@PathVariable(name = "input") int numero) throws BadRequestException {
        if(numero <= 0){
            throw new BadRequestException(HttpStatus.BAD_REQUEST.toString());
        }
        Gson gson = new Gson();
        String sec2 = gson.toJson(secuenciasService.fizz(numero));
        return sec2;
    }






}
