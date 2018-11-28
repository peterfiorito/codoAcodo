/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpractice;

/**
 *
 * @author pedrofiorito
 */
public class Employee extends Humano {
    String role;
    public Employee (String name, int age, String gender, String role){
        super(name, age, gender);
        this.role = role;
    }
}
