/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comments.Comment;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Task {
    private int id;
    private String Description;
    private boolean Complete;
    private User User;
    private ArrayList<Comment> comments;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return Description;
    }

    public boolean isComplete() {
        return Complete;
    }

    
    public User getUser() {
        return User;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }


    public void setComplete(boolean Complete) {
        this.Complete = Complete;
    }

    public Task(int id, String Description, User User) {
        this.id = id;
        this.Description = Description;
        this.Complete = false;
        this.User = User;
        this.comments = new ArrayList<>();
    }

    public Task() {
        this.Complete = false;
        this.comments = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", Description=" + Description + ", Complete=" + Complete + ", User=" + User + ", comments=" + comments + '}';
    }
    
   public void Addcomment(String descripcion,User user){
          for(int i = 0;i<comments.size();i++){
              if(comments.get(i)==null){
        Comment comment = new Comment(i, user, descripcion);
              comments.add(comment);
          }
          }
    }

           
}
