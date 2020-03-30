# Learn Java & Demo Spring Boot
Special thanks to: Eko Kurniawan Khannedy ([medium](https://medium.com/@khannedy))

### TODO JAVA
* Java Fundamental
* Java Generic
* Java Collection
* Java Lambda
* Java Stream
* Java Date and Time
* Java Platform Module System
* Java Concurrency

### TODO SPRING FRAMEWORK
* Spring Core
* Spring Data Access
* Spring Web MVC
* Spring WebFlux
* Spring Session
* Spring Scheduling
* Spring Caching
* Spring Data JPA
* Spring Data Redis
* Spring Data MongoDB
* Spring Kafka
* Spring Boot
* Spring Cloud Consul
* Spring Cloud Vault
* Spring Cloud Hystrix
* Spring Cloud Feign
* Spring Cloud Zuul

### TODO JAVA LIBRARY
* Reactor
* RxJava
* Jackson
* Mockito

### TODO DATASTORE
* MongoDB
* Redis
* PostgreSQL
* Cassandra
* ElasticSearch

### TODO SUPPORTED TOOL
* Apache Kafka
* Consul
* Vault

### TODO CONCEPT
* Effective Java
* Clean Code
* Design Pattern
* Refactoring
* SOLID
* Test Driven Development

### TODO ARCHITECTURE
* Domain Driven Design
* Microservices
* Command Query Responsibility Segregation

# Docker Basic Documentation
Special thanks to: Eko Kurniawan Khannedy ([source](https://www.youtube.com/playlist?list=PL-CtdCApEFH-A7jBmdertzbeACuQWvQao))

```bash
command:
> docker pull <image>:<tag>
> docker image ls
> docker image rm <image>:<tag>
> docker container ls
> docker container ls --all
> docker container create --name <name> <image>:<tag>
> docker container start <name>
> docker container stop <name>
> docker container logs <name>
> docker container rm <name>
> docker network ls
> docker network create <network>
> docker network connect <network> <name>
> docker volume ls
> docker volume create <volume>
> docker system df
> docker system prune
> docker system prune -a --volumes
> docker exec -t -i <name> <location>

build image with dockerfile:
> docker build --tag <image>:<tag> <location>

open port:
> docker container create -p <outport>:<inport> --name <name> <image>:<tag>

store database:
> docker container create -v <volume>:<location> --name <name> <image>:<tag>
> docker container create -v <local_folder>:<location> --name <name> <image>:<tag>

environment variable:
> docker container create -e <variable1>=<value1> -e <variable2>=<value2> --name <name> <image>:<tag>
```
```dockerfile
# dockerfile:

FROM <image>:<tag>              # Import image
COPY <source> <destination>     # Copy local file to docker
CMD ["str1", "str2", "str3"]    # Join str to run command when start container
```