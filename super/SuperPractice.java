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
public class SuperPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee DBA = new Employee("Jorge", 40, "Masculino", "DBA");
        System.out.println(DBA.name);
        System.out.println(DBA.age);
        System.out.println(DBA.gender);
        System.out.println(DBA.role);
    }
    
}
