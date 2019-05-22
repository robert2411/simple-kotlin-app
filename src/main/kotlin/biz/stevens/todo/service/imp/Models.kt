package biz.stevens.todo.service.imp

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

data class TodoModel(
        val id: UUID = UUID.randomUUID(),
        val title: String,
        val description: String,
        val priority: Int,
        val created: LocalDateTime,
        val dueDate: LocalDate?,
        var compleated: LocalDateTime?
)