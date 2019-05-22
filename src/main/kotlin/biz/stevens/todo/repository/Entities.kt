package biz.stevens.todo.repository

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TodoEntity(
        @Id var id: UUID,
        var title: String,
        var description: String,
        var priority: Int,
        var created: LocalDateTime,
        var dueDate: LocalDate?,
        var compleated: LocalDateTime?
)