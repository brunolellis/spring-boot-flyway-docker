package br.com.bruno.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}

/*
$ docker run --name user-mysql -e MYSQL_ROOT_PASSWORD=root -d -p 3306:3306 mysql:5.7
$ mysql -h 127.0.0.1 -P 3306 -u root -p

create database user;
create user 'user'@'%' identified by 'user';
grant all on user.* to 'user'@'%'; 
*/ 
