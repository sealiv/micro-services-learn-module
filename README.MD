
## Work with Dockerfile
```shell script
# Создать образ по файлу Dockerfile из текущей папки
docker build -t discovery .
docker build -t common .
docker build -t one .
docker build -t two .
docker build -t two-api .
docker build -t zuul .

# Запустить Docker контейнер 
docker run -p 8761:8761 -d discovery
docker run -p 8077:8077 -d common
docker run -p 8081:8081 -d one
docker run -p 8082:8082 -d two
docker run -p 8083:8083 -d two-api
docker run -p 8080:8080 -d zuul


# Посмотреть logs
docker logs ec-app

# Проинспектировать контейнер
docker inspect ec-app

```