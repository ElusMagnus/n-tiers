# n-tiers

## Etapes
- Création de secrets Kubernetes dans le namespace via la commande suivante : 

```
kubectl create secret generic postgres-secret \
  --from-literal=username=myapplication  \
  --from-literal=password=M3P@ssw0rd! \
  --from-literal=url=http://my-db-test.io/
```

- Déploiement du nginx ingress controller via les commandes suivantes :

```
kubectl apply -f kubernetes/nginx-ingress-controller.yaml
kubectl apply -f kubernetes/nginx-ingress-service.yaml
```

- Build de la partie backend : 

`docker build -t my-registry.io/my-application/backend:1.0 -f backend/Dockerfile .`

- Déploiement de l'application via les commandes suivantes : 

```
kubectl apply -f kubernetes/deployment.yaml
kubectl apply -f kubernetes/service.yaml
kubectl apply -f kubernetes/ingress.yaml
```
