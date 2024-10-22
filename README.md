# Prueba_Tecnica


Este proyecto contiene 2 endPoints para calcular la secuencia de Collatz y FizzBuzz


### Como consumir el api de secuencias ###

Primero debemos levantar el proyecto 
Abrimos una terminal o la pestaña de comandos de Intellij (Doble Ctrl)
y ejecutamos el siguiente comando:

gradlew bootRun

Una vez levantado el proyecto  el proyecto cuenta con 2 endpoints 
El puerto default es el 8080

### COLLATZ ###
Metodo POST
 
http://localhost:8080/api/secuence/collatz/{VALOR_NUMERICO}

### FIZZBUZZ ###
Metodo POST

http://localhost:8080/api/fizzbuzz/{VALOR_NUMERICO}


## PETICIONES CON UN BODY ##

Se añaden otros 2 servicios POST  con la diferencia que el numero a generar su secuencia ya
no va dentro de la querystring si no por medio de un json dentro del body de la petición.

### COLLATZ ###
Metodo POST

http://localhost:8080/api/secuence/collatz

### FIZZBUZZ ###
Metodo POST

http://localhost:8080/api/fizzbuzz

JSON PARA AMBOS CASOS
EJEMPLO:

{
"numero":"30"
}

