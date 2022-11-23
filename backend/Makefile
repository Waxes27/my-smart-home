init: drop
	mvn package
	docker-compose up --build
	

drop:
	docker-compose down

network:
	docker run -it  -p3306:3306 -v mysql-volume:/var/lib/mysql -e MYSQL_USER=dev -e MYSQL_PASSWORD=D3Vel0pM3nT -e MYSQL_DATABASE=Home -d mysql/mysql-server:8.0.20