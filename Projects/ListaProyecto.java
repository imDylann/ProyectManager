
package Projects;

import Tasks.Task;
import java.util.ArrayList;
import java.util.HashSet;


public class ListaProyecto {
    
    private ArrayList<Project> listProyectos;

    public ListaProyecto(ArrayList listProyectos) {
        this.listProyectos = listProyectos;
    }

    public ArrayList getListProyectos() {
        return listProyectos;
    }
    
  public void  addProjetcs(String name) {
        for (int i = 0; i < listProyectos.size(); i++) {
            if (listProyectos.get(i) == null) {
                Project project = new Project(i,name);
                listProyectos.add(project);
            }
        }
        
    }  
    
  public void DeletedProject(int id){
      for(Project project  : listProyectos){
          if(project.getId()==id){
              listProyectos.remove(project);
          }
      }
  }
    
  }
