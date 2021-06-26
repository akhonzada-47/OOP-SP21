
package project;


import java.io.Serializable;
import java.util.*;
public class Patient
{   
    public String name,cnic_no,age,Disease,Gender;

    Patient(){}
   
    public Patient(String name, String cnic_no, String age,String Gender,String Disease) {
   
        this.name = name;
        this.cnic_no = cnic_no;
        this.age = age;
        this.Gender=Gender;
        this.Disease=Disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic_no() {
        return cnic_no;
    }

    public void setCnic_no(String cnic_no) {
        this.cnic_no = cnic_no;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

   
     public boolean serach(String CNIC,ArrayList<Patient> dc){
        for(int i=0;i<dc.size();i++){
            if(dc.get(i).getCnic_no().equals(CNIC)){
                return true;
            }
        }
        return false;
        
    }

   @Override
    public String toString(){
        return "Name :"+this.name+"\nDisease :"+this.getDisease()+"\nCNIC :"+this.getCnic_no()
                +"\nGender :"+this.getGender()+"\nAge :"+this.getAge();
    }
  
}
