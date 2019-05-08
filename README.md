## General Description
This is a springboot project for practicing with webflux and test the setup for prometheus federation 

## TODOs
* add kubernetes for deployment
* add custom metric tags
* add persistence for data
* add service discovery
* add circuit breaker

## cheetsheet:

### Run
    * mvn spring-boot:run
    * mvn clean package; docker build -t promfed; docker run -p 8080:8080 promfed
### check
    * localhost/hello - show a hello message
    * localhost/runner/99 - another get method
    * localhost/actuator  - list of endpoints, like health, info, metrics, prometheus,etc
    * localhost/actuator/prometheus - metrics


## Notes from reading

use following command to open a shell in the image (myapp)
then ls command will list all content

$ docker run -ti --entrypoint /bin/sh myapp
/ # ls
