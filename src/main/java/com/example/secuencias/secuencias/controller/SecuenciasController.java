package com.example.secuencias.secuencias.controller;


import com.example.secuencias.secuencias.Model.EntradaBean;
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



    @PostMapping("/secuence/collatz")
    public Object getCollatz2(@RequestBody EntradaBean num) throws BadRequestException {

        if(num.getNumero() <= 0){

            throw new BadRequestException(HttpStatus.BAD_REQUEST.toString());
        }
        Gson gson = new Gson();
        String sec = gson.toJson(secuenciasService.collatz(num.getNumero()));
        return sec;
    }


    @PostMapping("/fizzbuzz")
    public Object getFizzBuzz2(@RequestBody EntradaBean num) throws BadRequestException {
        if(num.getNumero() <= 0){
            throw new BadRequestException(HttpStatus.BAD_REQUEST.toString());
        }
        Gson gson = new Gson();
        String sec2 = gson.toJson(secuenciasService.fizz(num.getNumero()));
        return sec2;
    }




}
