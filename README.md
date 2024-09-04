**GIT Repositories:**
HelloService: https://github.com/nikhil-287/helloService
WorldService: https://github.com/nikhil-287/worldService

Both repositories are on the main branch, and they include:
Java and Spring Boot source code.
Dockerfiles and Kubernetes manifests (deployment.yaml, service.yaml).


**Docker Images:**
HelloService: https://hub.docker.com/repository/docker/nick287/helloservice/general
WorldService: https://hub.docker.com/repository/docker/nick287/worldservice/general
Both images were built and tested locally before being pushed to Docker Hub.


**Prerequisites:**
Ensure that the following are installed on your machine:
Docker
Minikube

**Running the Microservices:**
For Hello Service:
Open a terminal in the helloService directory.

1. Start Minikube:
$ minikube start
2. Create the deployment:
$ kubectl apply -f deployment.yaml
3. Check pod status:
$ kubectl get pods
4. Check logs for each pod to ensure the application is running:
$ kubectl logs <pod-name>
5. Create the service:
$ kubectl apply -f service.yaml
6. Verify service status:
$ kubectl get services


For World Service:
Open a terminal in the worldService directory and repeat steps 2 to 6 as above.

Once both services are running, use the following command to get the IPs and ports:
$ minikube service --all

Replace the IP and port combinations in the rest.sh file with the correct IP+port for the Hello and World services.
Run the script:
$ sh rest.sh


**Expected Output:**
Response from server:
Hello World



