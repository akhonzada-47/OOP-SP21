package project;

import java.util.Scanner;
import java.util.ArrayList;

public class Runner 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);        
        
        ArrayList <Doctor> dc=new ArrayList<>();
        ArrayList <Patient> pt=new ArrayList<>();
        ArrayList <Medicine> md=new ArrayList<>();
        ArrayList <Laboratories> lb=new ArrayList<>();

        Laboratories lb1=new Laboratories();
        Doctor dc1=new Doctor();
        Patient pt1=new Patient();
        Medicine md1=new Medicine();

        for(int i=0; i<70;i++)
            System.out.print('_');
        System.out.println("\n\t\t\tProject Team");
	System.out.println("\n\t  |Mudassar kabir	       (SP20-BSE-048)|");
	System.out.println("\t ||Ghulam Muhammad Akhonzada   (SP20-BSE-029)||");
	System.out.println("\t|||Bilal Ahmad                 (SP20-BSE-023)|||");
        for(int i=0; i<70;i++)
            System.out.print('_');
               
        System.out.println("\n\n\n\t\tHOSPITAL MANAGMENT SYSTEM");
        
        System.out.println("\nPlease Register yourself first!\n");   
     
        System.out.println("\t>>>  Registration Panel  <<<\n");
        System.out.print("Enter First name: ");
        String f_name=input.next();
        System.out.print("Enter Last name: ");
        String l_name=input.next();        
        System.out.print("Enter Username for your account: ");
        String username=input.next();    
        System.out.print("Enter your Password: ");
        String password=input.next();        
        System.out.println();
        
        while (password.length()<6)
        {
            System.out.println("The passwsord you Entered is too short!");
            System.out.print("Enter at least 6-character password!\ntry again...\nEnter your Password: ");
            password=input.next();                  
        }
        System.out.println("Your Registration have been completed successfully.");
        Admin adm=new Admin(f_name,l_name,password,username);
          
        System.out.println("\n\t>>>  LOGIN HERE,  <<<\n");
        System.out.print("Enter username: ");
        String username0=input.next();
        System.out.print("Enter password: ");
        String password0=input.next();
      
        while(!adm.getUsername().equals(username0)||!adm.getPassword().equals(password0))
        {
            System.out.println("Incorrect username/password\n try again...\n");
             
            System.out.print("Enter username: ");
            username0=input.next();
            System.out.print("Enter password: ");
            password0=input.next();
        }


        while (true)
        {
            System.out.println("\n\t\t***  DASHBOARD  ***\n");
                   
            System.out.println("Press 1 for Doctor's Panel"
                                 + "\nPress 2 for Patients's Panel "
                                 + "\nPress 3 for Medicine's Panel "
                                 + "\nPress 4 for Laboratorie's Panel"
                                 + "\n\t(Or any other number to Exit!)");
            System.out.print("Enter your choice: ");
           int choice0=input.nextInt();
           
           
           
           if(choice0==1)
           {
                dc.add(new Doctor("Dr. Stephen Strange","Nuero Surgeon","108","977845"));
                dc.add(new Doctor("Dr. Mashoor Gulati","Cardiologist","241","867892"));
                
               while(true)
               {       
                    System.out.println("\t>>>  Doctor's Panel  <<<\n");
                    
                    System.out.println("Press 1 to Add new Doctor data");
                    System.out.println("Press 2 to check all Doctor data");
                    System.out.println("Press 3 if you want to search doctor");
                    System.out.println("Press 4 if you want to delete doctor");
                    System.out.println("Press 5 to Exit");
                    
                    System.out.print("Enter your choice: ");
                    int choice1=input.nextInt();
                    
                    
                    if(choice1==1)
                    {         
                        int choice2=1;
                        while(choice2==1)
                        {
                            System.out.print("Enter  Doctor's name: ");
                            String name1=input.next();
                            System.out.print("Enter Room no.: ");
                            String room_no1=input.next();
                            System.out.print("Enter Specialization: ");
                            String specialization=input.next();
                            System.out.print("Enter ID: ");
                            String ID=input.next();

                            dc.add(new Doctor(name1,specialization,room_no1,ID));

                            System.out.print("Press 1 to add new doctor or other than 1 to Exit :");
                            choice2=input.nextInt();

                        }
                    }
                    else if(choice1==2)
                    {
                        System.out.println("\nDotors List,");
                        for(int i=0;i<dc.size();i++)
                        {
                            System.out.println(dc.get(i) + "\n");
                        }
                    }

                    else if(choice1==3){
                        System.out.print("Enter the ID of the doctor you want to search :");
                        String ID=input.next();
                        if(dc1.serach(ID, dc)){
                            System.out.println("Doctor found");
                            for(int i=0;i<dc.size();i++){
                                if(dc.get(i).getID().equals(ID)){
                                    System.out.println(dc.get(i));
                                }
                            }

                        }
                        else{
                            System.out.println("Doctor doesnt exists");
                        }
                    }
                    else if (choice1==4){
                        System.out.print("Enter the ID of doctor you want to delete :");
                        String ID=input.next();
                        int j=0;
                        for(int i=0;i<dc.size();i++){
                            j++;
                            if (dc.get(i).getID().equals(ID)){
                                dc.remove(i);
                                System.out.println("Doctor data removed!");
                            }
                            else if(j==dc.size()){
                                System.out.println("Doctor doesnt exists");
                            }

                        }

                    }
                    else if (choice1==5){
                        break;
                    }

                }
            }
           
           
           
           
            else if(choice0==2)
            {
                pt.add(new Patient("Nawaz Shareef","64354373476","58","Male","Cardiomyopathy"));
                pt.add(new Patient("Robert Williams","41108373432","45","Male","Brain Tumors"));

                while(true)
                {
                    System.out.println("\n\t>>>  Patients's Panel  <<<\n");

                    System.out.println("Press 1 to Add new Patient data");
                    System.out.println("Press 2 to check all Patients data");
                    System.out.println("Press 3 if you want to search patient");
                    System.out.println("Press 4 if you want to delete patient");
                    System.out.println("Press 5 if you want to Exit");

                    System.out.print("Enter your choice: ");
                    int choice1=input.nextInt();

                    if(choice1==1){

                        int choice2=1;
                        while(choice2==1){
                              System.out.print("Enter  Patient's name: ");
                              String name1=input.next();
                              System.out.print("Enter disease: ");
                              String disease=input.next();
                              System.out.print("Enter CNIC: ");
                              String CNIC=input.next();
                              System.out.print("Enter age: ");
                              String age=input.next();
                              System.out.print("Enter gender: ");
                              String gender=input.next();

                              pt.add(new Patient(name1,CNIC,age,gender,disease));

                              System.out.print("Press 1 to add new patient or other than 1 to Exit: ");
                              choice2=input.nextInt();                     
                        }
                    }
                    else if(choice1==2)
                    {
                        System.out.println("\nPatients List,");
                        for(int i=0;i<pt.size();i++)
                        {
                            System.out.println(pt.get(i) + "\n");
                        }
                    }

                    else if(choice1==3)
                    {
                        System.out.print("Enter the CNIC of the patient you want to search :");
                        String CNIC=input.next();
                        if(pt1.serach(CNIC, pt))
                        {
                            System.out.println("Patient found");
                            for(int i=0;i<pt.size();i++)
                            {
                                if(pt.get(i).getCnic_no().equals(CNIC))
                                {
                                    System.out.println(pt.get(i));
                                }
                            }

                        }
                        else
                        {
                            System.out.println("Patient doesnt exists");
                        }
                    }
                    else if (choice1==4)
                    {
                        System.out.print("Enter the CNIC of Patient you want to delete :");
                        String name3=input.next();
                        int j=0;
                        for(int i=0;i<pt.size();i++)
                        {
                            j++;
                            if (pt.get(i).getCnic_no().equals(name3))
                            {
                                pt.remove(i);
                                System.out.println("Patient data removed!");
                            }
                            else if(j==pt.size())
                            {
                                System.out.println("Patient doesnt exists");
                            }                   
                        }               
                    }
                    else if (choice1==5)
                    {
                        break;
                    }
                }
            }
            
            
            
            
            
            
            
            else if(choice0==3)
            {
                md.add(new Medicine("Lipiget-Ez","12/08/2022","Getz Pharma (Private) Limited","498.33"));
                md.add(new Medicine("Eslicarbazepine","27/12/2021","Hilton Pharma (Private) Limited","998.09"));
                
                   while(true)
                   {
                        System.out.println("\n\t>>>  Medicine Panel  <<<\n");
                        System.out.println("Press 1 to Add new Medicine data");
                        System.out.println("Press 2 to check all Medicine data");
                        System.out.println("Press 3 if you want to search Medicine");
                        System.out.println("Press 4 if you want to delete Medicine");
                        System.out.println("Press 5 if you want to Exit");

                        System.out.print("Enter your choice: ");
                        int choice1=input.nextInt();
           
                        if(choice1==1)
                        {
                            int choice2=1;
                            while(choice2==1)
                            {
                                System.out.print("Enter  name of the Medicine :");
                                String name1=input.next();
                                System.out.print("Enter Name of company :");
                                String company=input.next();
                                System.out.print("Enter Expiry date :");
                                String date=input.next();
                                System.out.print("Enter cost :");
                                String cost=input.next();

                                md.add(new Medicine(name1,date,company,cost));

                                System.out.print("Press 1 to add new Medicine or other than 1 to Exit :");
                                choice2=input.nextInt();                
                            }
                        }
                        else if(choice1==2){
                            System.out.println("\nMedicines List,");
                            for(int i=0;i<md.size();i++){
                                System.out.println(md.get(i)+"\n");
                            }
                        }

                        else if(choice1==3){
                            System.out.print("Enter the name of the Medicine you want to search :");
                            String name2=input.next();
                            if(md1.serach(name2, md)){
                                System.out.println("Medicine found");
                                for(int i=0;i<md.size();i++){
                                    if(md.get(i).getName().equals(name2)){
                                        System.out.println(md.get(i));
                                    }
                                }

                            }
                            else{
                                System.out.println("Medicine doesnt exists");
                            }
                        }
                        else if (choice1==4){
                            System.out.print("Enter the name of Medicine you want to delete :");
                            String name3=input.next();
                            int j=0;
                            for(int i=0;i<md.size();i++){
                                j++;
                                if (md.get(i).getName().equals(name3)){
                                    md.remove(i);
                                    System.out.println("Medicine data removed!");
                                }
                                else if(j==md.size()){
                                    System.out.println("Medicine doesnt exists");
                                }

                            }

                        }
                        else if (choice1==5){
                            break;
                        }
                    }
            }
            
            
            
            
            
            else if(choice0==4)
            {
                lb.add(new Laboratories("Electrocardiogram (ECG)","480.00"));
                lb.add(new Laboratories("Cardiac MRI","1800.00"));
               while(true)
               {
                    System.out.println("\n\t>>>  Laboratory Panel  <<<\n");

                    System.out.println("Press 1 to Add new Laboratory data,");
                    System.out.println("Press 2 to check all Laboratory data,");
                    System.out.println("Press 3 if you want to search Laboratory,");
                    System.out.println("Press 4 if you want to delete Laboratory,");
                    System.out.println("Press 5 if you want to Exit,");

                    System.out.print("Enter your choice: ");
                    int choice1=input.nextInt();

                    if(choice1==1)
                    {

                        int choice2=1;
                        while(choice2==1)
                        {
                              System.out.print("Enter  name of the Test :");
                              String name1=input.next();
                              System.out.print("Enter cost :");
                              String cost=input.next();
                              lb.add(new Laboratories(name1,cost));

                              System.out.print("Press 1 to add new Test or any other key to Exit :");
                              choice2=input.nextInt();

                        }
                    }
                    else if(choice1==2){
                        System.out.println("\nList of lab Tests,");
                        for(int i=0;i<lb.size();i++){
                            System.out.println(lb.get(i) + "\n");
                        }
                    }

                    else if(choice1==3){
                        System.out.print("Enter the name of the Test you want to search :");
                        String name2=input.next();
                        if(lb1.serach(name2, lb)){
                            System.out.println("Tset record exists");
                            for(int i=0;i<lb.size();i++){
                                if(lb.get(i).getFacility().equals(name2)){
                                    System.out.println(lb.get(i));
                                }
                            }

                        }
                        else{
                            System.out.println("Tset record doesnt exists");
                        }
                    }
                    else if (choice1==4){
                        System.out.print("Enter the name of Tset you want to delete :");
                        String name3=input.next();
                        int j=0;
                        for(int i=0;i<lb.size();i++){
                            j++;
                            if (lb.get(i).getFacility().equals(name3)){
                                lb.remove(i);
                                System.out.println("Test data removed!");
                            }
                            else if(j==md.size()){
                                System.out.println("Test doesnt exists");
                            }
                        }
                    }
                    else if (choice1==5){
                        break;
                    }
                } 
            }
            
            
            else
                break;
           
        }    
    }
}
    
    

