# n-tiers

# Pré-requis pour déployer

Afin de déployer l'application il convient d'avoir certains pré-requis.

- un namespace Kubernetes
- création des secrets GitHub `DOCKERHUB_USERNAME`, `DOCKERHUB_PASSWORD` pour interagir avec DockerHub pour l'étape de build de l'image du backend.
- création du secret GitHub `KUBE_CONFIG_DATA` via la commande `cat $HOME/.kube/config | base64 -w 0` afin de permettre à la GitHub Action d'interagir avec le namespace kubernetes
- la création de secrets Kubernetes dans le namespace via la commande suivante : 


```
kubectl create secret generic postgres-secret \
  --from-literal=username=myapplication  \
  --from-literal=password=M3P@ssw0rd! \
  --from-literal=url=http://my-db-test.io/
```

Ces variables étant sensibles il est impératif de ne pas les versionner, ceci est fait pour l'illustration et pour les besoins de l'exercice.
