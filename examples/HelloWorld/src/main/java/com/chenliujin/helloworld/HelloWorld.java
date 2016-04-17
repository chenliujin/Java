/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chenliujin.helloworld;

/**
 *
 * @author chenliujin
 */
public class HelloWorld {
    
    public String sayHello()  
    {  
        return "Hello Maven";  
    }      
    
    public static void main(String[] args)  
    {  
        System.out.print( new HelloWorld().sayHello() );  
    }     
}
