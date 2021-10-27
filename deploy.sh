docker build -t ggabmc/webservice-demo -f ./Dockerfile ./webservice-demo

docker push ggabmc/webservice-demo

kubectl apply -f kubernetes