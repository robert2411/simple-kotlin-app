package biz.stevens.todo.controller

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

data class Todo(
        val id: UUID = UUID.randomUUID(),
        val title: String,
        val description: String = "",
        val priority: Int = 0,
        val created: LocalDateTime = LocalDateTime.now(),
        val dueDate: LocalDate?,
        var compleated: LocalDateTime?
)