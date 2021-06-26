package project;

import java.util.ArrayList;

public class Medicine
{
String name,date,company,cost;

       Medicine(String name, String date, String company, String cost) {
           this.name=name;
           this.company=company;
           this.date=date;
           this.cost=cost;
        
    }

    Medicine() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
    public String toString(){
        return "Medicine name :"+this.getName()+"\nCompany :"+this.getCompany()+"\nExpiry Date :"+this.getDate()+
                "\nCost :"+this.getCompany();
    }
    public boolean serach(String name,ArrayList<Medicine> md){
        for(int i=0;i<md.size();i++){
            if(md.get(i).getName().equals(name)){
                return true;
            }
        }
        return false;
        
    }
    
    
}
