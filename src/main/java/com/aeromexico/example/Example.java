package com.aeromexico.example;


/**
 *
 * @author Ivan Villa
 */

public class Example
{

    public boolean whoAreYou(String name){
        boolean autentificated = false;
        if(name.equals("Ivan"))
        {
          autentificated = true;
        }
        return autentificated;
    }
}
