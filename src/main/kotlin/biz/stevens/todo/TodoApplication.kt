package biz.stevens.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoApplication

fun main(args: Array<String>) {
    runApplication<TodoApplication>(*args)
}
//https://spring.io/guides/tutorials/spring-boot-kotlin/