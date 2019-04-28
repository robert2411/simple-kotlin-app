package biz.stevens.todo.controller

import biz.stevens.todo.service.imp.TodoModel

fun map(payload: Todo) = TodoModel(payload.id, payload.task)
fun map(model: TodoModel)  = Todo(model.id, model.task)