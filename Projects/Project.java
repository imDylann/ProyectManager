/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
import java.util.HashSet;

/**
 *
 * @author fabia
 */
public class Project {
    private int id;
    private String name;
    private HashSet<Task>tasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getTask() {
        return tasks;
    }
    
      public void AddTask(Task tasks){
        this.tasks.add(tasks);
        
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new HashSet<>();
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", tasks=" + tasks + '}';
    }
    public int cantidadTareas(){
        int cont=0;
        for(Task task : tasks){
            if(task!=null){
                cont++;
            }
        }
        return cont;
    } 

    public int cantTareasCompletas(){
        int cont=0;
        for(Task task : tasks){
            if(task!=null&&task.isComplete()){
                cont++;
            }
        }
        return cont;
    }  
      public double calcularPorcentajeCompletado(HashSet<Task>tareas) {
        if (tareas == null || tareas.isEmpty()) {
            return 0.0;
        }

        int tareasCompletadas = 0;
        int totalTareas = tareas.size();

        for (Task tarea : tareas) {
            if (tarea.isComplete()) {
                tareasCompletadas++;
            }
        }

        return ((double) tareasCompletadas / totalTareas) * 100;
    }
}
