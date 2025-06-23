# Order Service

### Reference Documentation
For further reference, please consider the following sections:

* Java JDK 21
* Maven 3.6.3

### Docker
To build the Docker image, run the following command in the root directory of the project:

```bash
docker buildx build -t baneymelo/order-app:<VERSION> .
```

### Running the Application
To run the application, you can use the following command:

```bash
docker run -d -p 8080:8080 baneymelo/order-app:<VERSION>
```
### License

MIT License


TODO
- crear y contenerizar otra aplicacion.
- crear los deployment y service de la nueva aplicacion.
- TEMA pendiente el de la base de datos.