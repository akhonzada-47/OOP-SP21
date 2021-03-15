
package lab2h.act1;

class StudentDetails
{
    String Name;
    String RegNo;
    String Dep;
    double CGPA;
    String Semester;

    void UniData() 
    {
       System.out.print("Student Name : "+Name +
                    "\nRegistration No. : "+RegNo+
                    "\nDepartment : "+Dep+
                    "\nSemester : "+Semester+
                    "\nCGPA : "+ CGPA);
    }
    
}
