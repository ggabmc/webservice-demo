docker build --tag ggabmc/webservice-demo -f ./Dockerfile .

docker push ggabmc/webservice-demo

kubectl apply -f kubernates