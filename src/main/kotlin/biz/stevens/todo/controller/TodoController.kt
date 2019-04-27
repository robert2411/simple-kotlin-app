package biz.stevens.todo.controller

import biz.stevens.todo.service.TodoService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1/todo")
class TodoController(val todoService: TodoService) {

    @GetMapping()
    fun getAllTodos(): List<Todo> = todoService.getAllTodos().asSequence().map { t -> map(t) }.toList()

    @PostMapping()
    fun createNewTodo(@RequestBody todo: Todo): Todo = map(todoService.createNewTodo(map(todo)))

    @GetMapping("/{id}")
    fun getTodoById(@PathVariable id: UUID): Todo = map(todoService.getTodoById(id))

    @DeleteMapping("/{id}")
    fun deleteTodoById(@PathVariable id: UUID): Unit = todoService.deleteTodoById(id)
}