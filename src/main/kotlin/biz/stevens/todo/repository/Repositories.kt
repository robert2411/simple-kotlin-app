package biz.stevens.todo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TodoRepository : CrudRepository<TodoEntity, UUID>