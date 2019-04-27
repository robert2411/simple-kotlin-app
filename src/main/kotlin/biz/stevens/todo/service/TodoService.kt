package biz.stevens.todo.service

import biz.stevens.todo.controller.Todo
import biz.stevens.todo.repository.TodoEntity
import biz.stevens.todo.repository.TodoRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.collections.ArrayList

@Service
class TodoService(val todoRepository: TodoRepository) {
    fun getAllTodos(): List<TodoModel> = todoRepository.findAll().asSequence().map { t -> map(t) }.toList()

    fun createNewTodo(todo: TodoModel): TodoModel = map(todoRepository.save(map(todo)))

    fun getTodoById(id: UUID) = todoRepository.findById(id).map { t -> map(t) }.orElseThrow()

    fun deleteTodoById(id: UUID) = todoRepository.deleteById(id)
}