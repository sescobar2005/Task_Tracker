void main(String[] args){
    TaskService taskService = new TaskService();

    if (args.length == 0){
        System.out.println("Argumento erroneo");
        return;
    }

    switch(args[0]){
        case "add":
            taskService.add_task(args[1]);
            break;

        case "update":
            taskService.update_task(Integer.parseInt(args[1]), args[2]);
            break;

        case "delete":
            taskService.delete_task(Integer.parseInt(args[1]));
            break;

        default:
            System.out.println("Comando no reconocido");
    }
}

