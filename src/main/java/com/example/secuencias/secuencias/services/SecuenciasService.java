package com.example.secuencias.secuencias.services;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SecuenciasService {


    public Object collatz(int n){
        List numeros = new ArrayList();
        while (n != 1){
            numeros.add(n);
            System.out.println(n + " ");
            if (n%2 == 0){
                n=n/2;
            }else {
                n=(n*3)+1;
            }
        }
        numeros.add(n);
        return numeros;
    }


    public Object fizz(int n){
        List valores = new ArrayList();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                valores.add("FizzBuzz");
                System.out.println("FizzBuzz");
            } else if (i%5==0){
                valores.add("Buzz");
                System.out.println("Buzz");
            } else if (i%3==0) {
                valores.add("Fizz");
                System.out.println("Fizz");
            }else {
                valores.add(i);
                System.out.println(i);
            }
        }
        return valores;
    }



}
