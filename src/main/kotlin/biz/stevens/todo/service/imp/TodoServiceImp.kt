package biz.stevens.todo.service.imp

import biz.stevens.todo.repository.TodoRepository
import biz.stevens.todo.service.TodoService
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodoServiceImp(val todoRepository: TodoRepository) : TodoService {
    override fun getAllTodos() = todoRepository.findAll().asSequence().map(::map).toList()

    override fun createNewTodo(todo: TodoModel) = map(todoRepository.save(map(todo)))

    override fun getTodoById(id: UUID) = todoRepository.findById(id).map(::map).orElseThrow()

    override fun deleteTodoById(id: UUID) = todoRepository.deleteById(id)
}