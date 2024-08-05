/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Projects.Project;
import Users.User;
import java.util.ArrayList;
import java.util.HashSet;


public class ListaUsuario {
  private HashSet<User> listusuarios;

   public ListaUsuario(HashSet listusuarios) {
        this.listusuarios = listusuarios;
    }
   
    public HashSet getListProyectos() {
        return listusuarios;
    }
    
    
  public void  addUser(String id,String name, String email) {
            
                User user = new User(id,name,email);
                listusuarios.add(user);
            }
   public void borrarUser(int id){
      for(User user  : listusuarios){
          if(user.getId().equals(id)){
              listusuarios.remove(user);
          }
      }
  }
   
   public User buscarUser(int id){
     for(User user  : listusuarios){
         if(user.getId().equals(id)){
            return user; 
         }
     }
     return null;
   }
        
}
