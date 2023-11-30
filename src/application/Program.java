/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Product;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 
 */
public class Program {

    public static void main(String[] args) {
        
        Set<Product> set = new HashSet<>();
        
        //conjunto
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        
        Product prod = new Product("Notebook", 1200.0);
        
        System.out.println(set.contains(prod)); // aqui vou testar prod exite no meu conjunto 
        // deu false
        // porque ele comparou pela ref do produto e nao pelo objeto
        // 
        // pra fazer serem igual por objeto tem q implementar o HashCode e equals na classe produtc
        
        // agora deu true
        
        
    }
}
