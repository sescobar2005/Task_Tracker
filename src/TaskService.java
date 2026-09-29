import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskService {
    // Añadiendo tarea  
    void add_task(String task){
        File file = new File("tasks.json");

        try {
            if (file.createNewFile()){
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.append("[]");
                fileWriter.close();

            } else {
                String text = "";
                FileReader fileReader = new FileReader(file);
                int character = fileReader.read();

                while (character != -1){
                    text += Character.toString(character);
                    character = fileReader.read();
                }

                System.out.println(text);
                fileReader.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Actualizando tarea
    void update_task(int id_task, String task){
        System.out.println("Actualizar");
    }

    // Eliminando tarea
    void delete_task(int id_task){
        System.out.println("Eliminar");
    }
}
