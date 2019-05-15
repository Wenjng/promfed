mvn clean package

docker build -t mypromfed .

docker tag mypromfed:latest hewenjing99/mypromfed:v4

docker login

docker push hewenjing99/mypromfed:v4
