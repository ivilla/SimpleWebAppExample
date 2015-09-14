package com.aeromexico.example.modulea;


/**
 *
 * @author Ivan Villa
 */

public class ExampleModuleA
{

    public boolean whoAreYou(String name){
        boolean autentificated = false;
        if(name.equals("Aldo"))
        {
          autentificated = true;
        }
        return autentificated;
    }
}
