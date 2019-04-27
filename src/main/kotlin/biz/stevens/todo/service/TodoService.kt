package biz.stevens.todo.service

import biz.stevens.todo.repository.TodoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodoService(val todoRepository: TodoRepository) {
    fun getAllTodos(): List<TodoModel> = todoRepository.findAll().asSequence().map { t -> map(t) }.toList()

    fun createNewTodo(todo: TodoModel): TodoModel = map(todoRepository.save(map(todo)))

    fun getTodoById(id: UUID): TodoModel = todoRepository.findById(id).map { t -> map(t) }.orElseThrow()

    fun deleteTodoById(id: UUID): Unit = todoRepository.deleteById(id)
}