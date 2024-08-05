/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author ASUS
 */
public class User {
    private  String id;
    private String Name;
    private String Email;

    public User(String id, String Name, String Email) {
        this.id = id;
        this.Name = Name;
        this.Email = Email;
    }

    public User() {
    }

    
    
    
    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
