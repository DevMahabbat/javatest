/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Mahabbat
 */
public class Teacher extends Person {
   private int level;
   
    

    public Teacher(int level, String name, String surname, int age) {
        super(name, surname, age);
        this.level = level;
    }

    public Teacher(int level) {
        super("","",0);
        this.level = level;
    }

    public Teacher() {
        super("","",0);
    }
    
   

   
}
