# Order Service

### Reference Documentation
For further reference, please consider the following sections:

* Java JDK 21
* Maven 3.6.3

## Docker
To build the Docker image, run the following command in the root directory of the project:

```bash
docker buildx build -t baneymelo/order-app:<VERSION> .
```

### Running the Application
To run the application, you can use the following command:

```bash
docker run -d -p 8080:8080 baneymelo/order-app:<VERSION>
```
### Push image to registry
```bash
docker push <registry_url>/<image_name>:<tag>
````


## Kubernetes

### Deploy image to Kubernetes cluster

```bash
kubectl apply -f deployment.yaml
```

### Get pods 

```bash
kubectl get pods --watch
```

### Describe services

```bash
kubectl describe services order-service
```

### Logs pod

```bash
kubectl logs <POD-NAME>
```

## ArgoCD

### Install ArgoCD

```bash
kubectl create namespace argocd

kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
```
### Access ArgoCD UI

```bash
kubectl port-forward svc/argocd-server -n argocd 8080:443
```

### Expose ArgoCD UI

```bash
kubectl patch svc argocd-server -n argocd -p '{"spec": {"type": "LoadBalancer"}}'
```

### Get External IP
```bash
kubectl get svc argocd-server -n argocd
```

### Get password for admin user
```bash
kubectl get svc argocd-server -n argocd
```


TODO:
integrar helm