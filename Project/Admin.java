package project;

import java.util.Scanner;
import java.io.*;
public class Admin implements Serializable{
   public String f_name,l_name,password,username;

    
    Admin(String f_name,String l_name,String password,String username){
        this.f_name=f_name;
        this.l_name=l_name;
        this.password=password;
        this.username=username;
    }


    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
}
