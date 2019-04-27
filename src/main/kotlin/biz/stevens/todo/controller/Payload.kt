package biz.stevens.todo.controller

import java.util.*

data class Todo(val id: UUID = UUID.randomUUID(), val task: String)