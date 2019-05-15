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


## using kubernetes/minikube
#### Now the image is pulled from local docker registry ###
#### TODO : pull image from my private dockerhub account/hewenjing99 ####

kubectl apply -f kube-deploy.yaml

## check deployment
$ kubectl get deploy

## check rs
wenjing@wenjing-Inspiron-7737:~/expProjects/kube-deploy/promfed$ kubectl get rs

## check pods
wenjing@wenjing-Inspiron-7737:~/expProjects/kube-deploy/promfed$ kubectl get pods

## get pod IP
wenjing@wenjing-Inspiron-7737:~/expProjects/kube-deploy/promfed$ kubectl describe pod my-promfed-788b76f8cd-2ggcg |grep IP
IP:                 172.17.0.5

## expose service
kubectl expose deployment my-promfed --type=LoadBalancer --port=8080

## check service created
wenjing@wenjing-Inspiron-7737:~/expProjects/kube-deploy/promfed$ kubectl get services
NAME         TYPE           CLUSTER-IP      EXTERNAL-IP   PORT(S)          AGE
my-promfed   LoadBalancer   10.96.230.249   <pending>     8080:30879/TCP   33s

## check service exposed with
wenjing@wenjing-Inspiron-7737:~/expProjects/kube-deploy/promfed$ minikube service my-promfed
🎉  Opening kubernetes service default/my-promfed in default browser...

## now in browser url http://192.168.99.101:30879/
endpoints /hello and /actuator  should show contents






