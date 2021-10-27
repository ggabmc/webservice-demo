docker build --tag ggabmc/webservice-demo -f ./dockerfile .

docker push ggabmc/webservice-demo

kubectl apply -f kubernates