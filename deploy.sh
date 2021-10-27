docker build --tag=ggabmc/webservice-demo ./dockerfile ./webservice-demo

docker push ggabmc/webservice-demo

kubectl apply -f kubernetes