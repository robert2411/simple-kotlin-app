package biz.stevens.todo.controller

import biz.stevens.todo.service.imp.TodoModel

fun map(payload: Todo) = TodoModel(
        payload.id,
        payload.title,
        payload.description,
        payload.priority,
        payload.created,
        payload.dueDate,
        payload.compleated
)

fun map(model: TodoModel) = Todo(
        model.id,
        model.title,
        model.description,
        model.priority,
        model.created,
        model.dueDate,
        model.compleated
)
