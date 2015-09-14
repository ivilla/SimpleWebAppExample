package com.aeromexico.example.moduleb;


/**
 *
 * @author Ivan Villa
 */

public class ExampleModuleB
{

    public boolean whoAreYou(String name){
        boolean autentificated = false;
        if(name.equals("Ramon"))
        {
          autentificated = true;
        }
        return autentificated;
    }
}
