docker build -t comex/comexws:1.3 .
docker run -d --network comex-network -p 8080:8080 comex/comexws:1.3

