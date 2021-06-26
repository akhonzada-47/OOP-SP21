package project;
import java.io.Serializable;
import java.util.ArrayList;
public class Doctor implements Serializable{
    public String name,specialization,Qualification,room_no,ID;
    

    public Doctor(String name, String specialization, String room_no, String ID) {
        this.name = name;
        this.specialization = specialization;
        this.room_no = room_no;
        this.ID=ID;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    Doctor() {
    }
    
    public boolean serach(String ID,ArrayList<Doctor> dc){
        for(int i=0;i<dc.size();i++){
            if(dc.get(i).getID().equals(ID)){
                return true;
            }
        }
        return false;
        
    }
    

    
    @Override
    public String toString(){
        return "Name :"+this.name+"\nSpecialization :"+this.specialization+"\nRoom no :"+this.room_no+"\nID :"+this.ID;
    }
}
