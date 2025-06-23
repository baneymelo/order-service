# kubectl commands


## deployment

```mermaid
graph LR;
  Deployment["Deployment"] -- "govern" --> Pod["Pod"]
```

- **apply**
```bash 
k apply -f deployment.yaml
``` 
- **get deployments** 
```bash 
k get deployments
``` 
- **get pods** 
```bash 
k get pods
```
- **logs** 
```bash 
k logs <POD_NAME>
```
- **describe pods** 
```bash 
k describe pod <POD_NAME>
```

## service

```mermaid
graph LR;
  Service["Service"] -- "expose" --> Pod["Pod"]
```
- **apply**
```bash 
k apply -f service.yaml
``` 
