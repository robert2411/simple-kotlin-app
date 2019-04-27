package biz.stevens.todo.repository

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class TodoEntity(
        @Id var id: UUID,
        var task: String
)
