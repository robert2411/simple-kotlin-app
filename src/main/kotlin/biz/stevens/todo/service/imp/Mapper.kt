package biz.stevens.todo.service.imp

import biz.stevens.todo.repository.TodoEntity

fun map(entity: TodoEntity) = TodoModel(
        entity.id,
        entity.title,
        entity.description,
        entity.priority,
        entity.created,
        entity.dueDate,
        entity.compleated
)

fun map(model: TodoModel) = TodoEntity(
        model.id,
        model.title,
        model.description,
        model.priority,
        model.created,
        model.dueDate,
        model.compleated
)
