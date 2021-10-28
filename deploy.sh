#docker build --tag=ggabmc/webservice-demo -f ./Dockerfile .
docker build --tag=ggabmc/webservice-demo:latest --tag=ggabmc/webservice-demo:$SHA -f ./Dockerfile .

#docker push ggabmc/webservice-demo
docker push ggabmc/webservice-demo:latest
docker push ggabmc/webservice-demo:$SHA

kubectl set image deployments/ws-deployment webservice=ggabmc/webservice-demo:$SHA

kubectl apply -f kubernetes


