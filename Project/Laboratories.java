package project;
import java.util.ArrayList;


public class Laboratories{
    String facility,cost;
    
    Laboratories(String facility,String cost){
        this.cost=cost;
        this.facility=facility;
    }

    Laboratories() {
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    public boolean serach(String name,ArrayList<Laboratories> lb){
        for(int i=0;i<lb.size();i++){
            if(lb.get(i).getFacility().equals(name)){
                return true;
            }
        }
        return false;
        
    }
    @Override
    public String toString(){
        return "Facility :"+this.getFacility()+"\nCost :"+this.getCost();
    }
    
}
