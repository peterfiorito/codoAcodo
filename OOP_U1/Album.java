/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedrofiorito
 */
public class Album {
    String titulo;
    String artista;
    String año;
    int precio;
    int unidades_vendidas;
    
    
    public boolean es_platino(int unidades){
        boolean platino = false;
        if(unidades >= 1000000){
            platino = true;
        }
        return platino;
    }
    
    public boolean es_oro(int unidades){
        boolean gold = false;
        if(unidades >= 500000){
            gold = true;
        }
        return gold;
    }
    
    public int ventas_bruto(int precio, int unidades){
        int ganancias = precio * unidades;
        
        return ganancias;
    }
    
    public Album(String titulo, String artista, String año, int precio, int unidades_vendidas){
        this.titulo = titulo;
        this.artista = artista;
        this.año = año;
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
    }
    
    public static void main(String[] args){
        Album disco1 = new Album("Breakfast can wait", "Prince", "2014", 10, 500000);
        System.out.println("Titulo: " + disco1.titulo +'\n'+
                           "Artista: "+ disco1.artista +'\n' +
                           "Año"+ disco1.año + '\n' +
                           "Precio" + disco1.precio + '\n' +
                           "Unidades vendidas" +disco1.unidades_vendidas + '\n'+
                           "Es platino? " + disco1.es_platino(500000) + '\n' +
                           "Es oro? " + disco1.es_oro(500000));
        
    }
    
}
