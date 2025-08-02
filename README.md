# Microservicio: Gestion de Persona-Cliente

Este microservicio forma parte de la solucion de la prueba tecnica backend java. Se encarga del mantenimiento de persona/cliente.

## Tecnologias
- Java 17
- Spring Boot
- Maven
- VS Code (opcional)
  - **Java Extension Pack**
  - **Spring Boot Tools**
  - **Lombok Annotations Support**
- H2
- Postman

## Como Ejecutar en local
1. Clonar el repositorio
2. Ejecutar con Maven:
   -  -/mvnw spring-boot:run (Terminal)
3. Acceder a la API REST en:
   -  http://localhost:8080/clientes
4. Acceder a la consola de la base de datos en memoria (H2):
   - http://localhost:8080/h2-console
     - JDBC URL: jdbc:h2:mem:testdb
     - User: sa
     - password:
## Pruebas Automatizadas
./mvnw test

## Coleccion Postman
[Coleccion Postman](./Reto_Tecnico_Java.postman_collection.json)
## DATABASE
[BaseDatos.sql](./BaseDatos.sql)

## Falta por implementar 
- El despliegue mediante Docker 

   
