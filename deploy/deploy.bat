docker build -t image-config-server:v1 -f DockerfileConfig .
docker build -t image-discovery-service:v1 -f DockerfileDiscovery .
docker build -t image-gateway-service:v1 -f DockerfileGateway .
docker build -t image-service-bus:v1 -f DockerfileBus .
docker build -t image-service-tasador:v1 -f DockerfileTasador .
docker-compose up -d