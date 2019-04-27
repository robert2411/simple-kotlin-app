package biz.stevens.todo.service

import biz.stevens.todo.repository.TodoEntity

fun map(entity: TodoEntity) = TodoModel(entity.id, entity.task)
fun map(model: TodoModel)  = TodoEntity(model.id, model.task)