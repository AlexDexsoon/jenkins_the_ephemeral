start:
  docker-compose down --rmi all && \
  docker-compose up --build
stop:
  docker-compose down --rmi all
