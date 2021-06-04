# sumitdevops

To build application :
gradle clean build
First Push
Second Push

To create docker image :
"docker build -f Dockerfile -t docker-spring-boot:1.0 ."

To run docker image :
"docker run -p 9292:8282 --name docker-spring-boot -d docker-spring-boot:1.0"
