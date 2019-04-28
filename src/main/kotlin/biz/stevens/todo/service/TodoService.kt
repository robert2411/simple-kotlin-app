package biz.stevens.todo.service

import biz.stevens.todo.service.imp.TodoModel
import java.util.*

interface TodoService {
    fun getAllTodos(): List<TodoModel>
    fun createNewTodo(todo: TodoModel): TodoModel
    fun getTodoById(id: UUID): TodoModel
    fun deleteTodoById(id: UUID): Unit
}