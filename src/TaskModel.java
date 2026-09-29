import java.time.LocalDateTime;

enum status {
    todo,
    in_progress,
    done
}

public class TaskModel {
    int id_task;
    String task_description;
    status task_status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
