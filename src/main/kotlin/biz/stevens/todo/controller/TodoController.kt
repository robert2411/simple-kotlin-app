package biz.stevens.todo.controller

import biz.stevens.todo.service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class TodoController(val todoService: TodoService) {

    @GetMapping("/")
    fun getAllTodos(model: Model, @RequestParam(value = "completed") completed: Boolean = false): String {

        val todos = todoService.getAllTodos()
                .map(::map)
                .filter { t -> (t.compleated != null && completed) || t.compleated == null }
                .toList()


        model["title"] = "test"
        model["todos"] = todos

        return "index"
    }

    @PostMapping("/")
    fun createNewTodo(model: Model, @RequestParam map: Map<String, String>): String {

        todoService.createNewTodo(
                map(
                        Todo(
                                title = map["title"].orEmpty(),
                                description = map["description"].orEmpty(),
                                compleated = null,
                                dueDate = null
                        )
                )
        )

        val todos = todoService.getAllTodos().asSequence().map(::map).toList()

        model["title"] = "test"
        model["todos"] = todos

        return "index"
    }

//    @PostMapping
//    fun createNewTodo(@RequestBody todo: Todo): Todo = map(todoService.createNewTodo(map(todo)))
//
//    @GetMapping("/{id}")
//    fun getTodoById(@PathVariable id: UUID): Todo = map(todoService.getTodoById(id))
//
//    @DeleteMapping("/{id}")
//    fun deleteTodoById(@PathVariable id: UUID): Unit = todoService.deleteTodoById(id)
//    }
}